import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * Part of server. Handles threading and client connections/messages.
 */
public class ServerThread implements Runnable{

    private CopyOnWriteArrayList<ServerThread> threadList;
    //private BufferedReader buffOut;
    //private BufferedWriter buffIn;
    private ObjectOutputStream objectOut;
    private ObjectInputStream objectIn;
    private Socket skt;
    private String user;

    /**
     * Procedure that returns client's nickname
     * @return String containing client's nickname
     */
    public String getNickname() {
        return this.user;
    }

    /**
     * Procedure that sends message to all clients that are connected to the server.
     * 
     * @param message String containing message to be sent.
     */
    public void send_all(Message message) {
        for (Iterator <ServerThread> iterator = threadList.iterator(); iterator.hasNext();) {
            try {
                ServerThread cThread = iterator.next();
                cThread.objectOut.writeObject(message);
                cThread.objectOut.flush();
                //cThread.buffIn.write(message + "\n");
                //cThread.buffIn.flush();
                 
            } catch (IOException e) {
                closeConnections(skt, objectIn, objectOut);
            }
        }
    }

    /**
     * Procedure that sends message to specified client.
     * 
     * @param message String containing message to be sent.
     * @param usr Nickname of client to whisper message to.
     * @throws IOException Exception if there are any errors with socket.
     */
    private void send_whisper(String msg, String usr) throws IOException {
        ServerThread recipient = null;
        // find object of recipient
        for (ServerThread cThread : threadList) {
            if (cThread.user.equals(usr)) {
                recipient = cThread;
                break;
            }
        }
        // invalid user
        if (recipient == null) {
            objectOut.writeObject(new Message(Message.MessageType.MESSAGE, 
                "<SERVER>: User \"" + usr + "\" does not exist.\n"));
            objectOut.writeObject(new Message(Message.MessageType.MESSAGE, 
                "<SERVER>: Please use the command \"/online\" to see list of users.\n"));
            objectOut.flush();
            return;
        }
        // send to recipient and to yourself so your message displays too
        try {
            Message message = new Message(Message.MessageType.MESSAGE,
                user + " [whisper]: " + msg);
            objectOut.writeObject(message);
            objectOut.flush();
            recipient.objectOut.writeObject(message);
            recipient.objectOut.flush();

        } catch (IOException e) {
            closeConnections(skt, objectIn, objectOut);
        } 
    }

    /**
     * Remove client from Server and close object attributes.
     * 
     * @param skt Socket of client/server connection.
     * @param buffIn Buffer for writing outgoing messages to client side.
     * @param buffOut Buffer for reading messages from incoming server side.
     */
    public void closeConnections(Socket skt, ObjectInputStream objectIn, ObjectOutputStream objectOut) {
        // Remove user from list of connected clients.
        threadList.remove(this);
        send_all(new Message(Message.MessageType.LEAVE, "<SERVER>: \"" + user + "\" has left the chat\n"));
        // Close all object instances relating to disconnected user.
        try {
            if (skt != null) 
                skt.close();
            if (objectIn != null)
                objectIn.close();
            if (objectOut != null) 
                objectOut.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Send the number of clients onto the buffer,
     * then follow with list of client usernames.
     */
    public void getClients() {
        try {

            // push number of clients onto buffer
            /*this.buffIn.write(threadList.size() + "\n");
            this.buffIn.flush();
            // push list of clients onto buffer
            for (ServerThread s: threadList) {
                this.buffIn.write(s.user + "\n");
                this.buffIn.flush();
            }   */

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Client constructor that instantiates object.
     * 
     * @param that Socket of client/server connection.
     */
    public ServerThread(Socket that, CopyOnWriteArrayList<ServerThread> list) {
        InputStream in;
        OutputStream out;

        this.skt = that;
        threadList = list;
        try {
            in = skt.getInputStream();
            out = skt.getOutputStream();
            objectOut = new ObjectOutputStream(new BufferedOutputStream(out));
            objectOut.flush();
            objectIn = new ObjectInputStream(new BufferedInputStream(in));

            // get username from client
            Message message = (Message) objectIn.readObject();
            user = message.getMessage();
        } catch (IOException e) {
            System.out.println("Error: Could not intialise socket stream:\n." + skt);
            e.printStackTrace();
            closeConnections(that, objectIn, objectOut);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * Thread that listens for incoming messages from clients.
     */
    @Override
    public void run() {
        String s, whisperUser, restOfMsg;
        while (true) {
            try {
                Message message = (Message) objectIn.readObject();
                s = message.getMessage();
                // socket connection dropped
                if (s == null) {
                    closeConnections(skt, objectIn, objectOut);
                    break;
                }

                if (message.getMessageType() == Message.MessageType.WHISPER) {
                    // get whisper username
                    whisperUser = s.substring(1, s.indexOf(' '));
                    restOfMsg = s.substring(s.indexOf(' ') + 1);
                    send_whisper(restOfMsg, whisperUser);

                } else if (message.getMessageType() == Message.MessageType.ONLINE) {
                    this.objectOut.writeObject(new Message(Message.MessageType.MESSAGE,
                        "<SERVER>: #List of Clients Online#\n"));
                    this.objectOut.flush();
                    // send list of clients to requesting client
                    getClients();
                    this.objectOut.writeObject(new Message(Message.MessageType.MESSAGE, 
                        "<SERVER:> ################\n"));
                    this.objectOut.flush();
                } else {
                    // send global message
                    send_all(new Message(Message.MessageType.MESSAGE, user + ": " + s));
                }
                
            } catch (IOException | ClassNotFoundException e) {
                closeConnections(skt, objectIn, objectOut);
                break;
            }
        }
    }
}
