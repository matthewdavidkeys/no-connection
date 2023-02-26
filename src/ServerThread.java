import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.*;

/**
 * Part of server. Handles threading and client connections/messages.
 */
public class ServerThread implements Runnable{

    private CopyOnWriteArrayList<ServerThread> threadList;
    private BufferedReader buffOut;
    private BufferedWriter buffIn;
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
    public void send_all(String message) {
        for (Iterator <ServerThread> iterator = threadList.iterator(); iterator.hasNext();) {
            try {
                ServerThread cThread = iterator.next();
                cThread.buffIn.write(message + "\n");
                cThread.buffIn.flush();
                 
            } catch (IOException e) {
                closeConnections(skt, buffIn, buffOut);
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
    private void send_whisper(String message, String usr) throws IOException {
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
            buffIn.write("<SERVER>: User \"" + usr + "\" does not exist.\n");
            buffIn.write("<SERVER>: Please use the command \"/online\" to see list of users.\n");
            buffIn.flush();
            return;
        }
        // send to recipient and to yourself so your message displays too
        try {

            buffIn.write(user + " [whisper]: " + message + "\n");
            buffIn.flush();
            recipient.buffIn.write(user + " [whisper]: " + message + "\n");
            recipient.buffIn.flush();

        } catch (IOException e) {
            closeConnections(skt, buffIn, buffOut);
        } 
    }

    /**
     * Remove client from Server and close object attributes.
     * 
     * @param skt Socket of client/server connection.
     * @param buffIn Buffer for writing outgoing messages to client side.
     * @param buffOut Buffer for reading messages from incoming server side.
     */
    public void closeConnections(Socket skt, BufferedWriter buffIn, BufferedReader buffOut) {
        // Remove user from list of connected clients.
        threadList.remove(this);
        send_all("<SERVER>: \"" + user + "\" has left the chat");
        // Close all object instances relating to disconnected user.
        try {

            if (skt != null) 
                skt.close();
            if (buffOut != null)
                buffOut.close();
            if (buffIn != null) 
                buffIn.close();

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
            this.buffIn.write(threadList.size() + "\n");
            this.buffIn.flush();
            // push list of clients onto buffer
            for (ServerThread s: threadList) {
                this.buffIn.write(s.user + "\n");
                this.buffIn.flush();
            }   

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
        InputStreamReader in;
        OutputStreamWriter out;

        this.skt = that;
        threadList = list;
        try {

            in = new InputStreamReader(skt.getInputStream());
            out = new OutputStreamWriter(skt.getOutputStream());
            buffIn = new BufferedWriter(out);
            buffOut = new BufferedReader(in);   
            // get username from client
            user = buffOut.readLine();

        } catch (IOException e) {
            System.out.println("Error: Could not intialise socket stream:\n." + skt);
            e.printStackTrace();
            closeConnections(that, buffIn, buffOut);
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

                s = buffOut.readLine();
                // socket connection dropped
                if (s == null) {
                    closeConnections(skt, buffIn, buffOut);
                    break;
                }

                if (!s.isBlank() && s.charAt(0) == '@') {
                    if ((s.indexOf(' ') == -1) || (s.indexOf(' ') == 1)) {
                        this.buffIn.write("<SERVER>: Usage \"@<username> <message>\"\n");
                        this.buffIn.flush();
                        continue;
                    }
                    // get whisper username
                    whisperUser = s.substring(1, s.indexOf(' '));
                    restOfMsg = s.substring(s.indexOf(' ') + 1);
                    send_whisper(restOfMsg, whisperUser);

                } else if (s.equals("/online")) {
                    this.buffIn.write("<SERVER>: #List of Clients Online#\n");
                    this.buffIn.flush();
                    // send list of clients to requesting client
                    getClients();
                    this.buffIn.write("<SERVER:> ################\n");
                    this.buffIn.flush();
                    continue;

                } else {
                    // send global message
                    send_all(user + ": " + s);
                }
                
            } catch (IOException e) {
                closeConnections(skt, buffIn, buffOut);
                break;
            }
        }
    }
}
