import java.io.*;
import java.net.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;
/**
 * Simple server that opens a port and listens for connecting clients.
 * Idea for structure:
 * YouTube: Java Socket Programming - Multiple Clients Chat by WittCode
 */
public class Server {
    private static ServerSocket sskt;
    private static Socket skt;
    private static final int portNum = 6666;
    private static CopyOnWriteArrayList<ServerThread> threadList = new CopyOnWriteArrayList<ServerThread>();

    /**
     * Get the list of clients (ServerThreads) currently connected to the server.
     * 
     * @return List of ServerThreads
     */
    public static CopyOnWriteArrayList<ServerThread> getClientList() {
        return threadList;
    }

    public static void main(String[] args) throws IOException {
        ServerThread client;        
        ObjectInputStream objectIn;
        ObjectOutputStream objectOut;
        ArrayList<String> users = new ArrayList<String>();

        // listen for connecting clients while active
        sskt = new ServerSocket(portNum);
        System.out.println("Server started on port: " + portNum);
        
        while (!sskt.isClosed()) {
           try {
                // wait for someone to connect
                skt = sskt.accept();
                objectOut = new ObjectOutputStream(skt.getOutputStream());
                objectOut.flush();
                objectIn = new ObjectInputStream(skt.getInputStream());
                client = new ServerThread(skt, threadList, objectIn, objectOut);

                for (ServerThread thread: threadList) {
                    users.add(thread.getNickname());
                }

                //get username from client
                Message message = (Message) objectIn.readObject();
                String user = message.getMessage();
                if (!checkUnique(user, users)) {
                    objectOut.writeObject(new Message(Message.MessageType.UNIQUENESS, "not unique"));
                    objectOut.flush();
                    continue;
                }
                objectOut.writeObject(new Message(Message.MessageType.UNIQUENESS, "unique"));
                objectOut.flush();

                client.setNickname(user);
                threadList.add(client);
                Thread clientThread = new Thread(client);
                clientThread.start();
                client.send_all(new Message(Message.MessageType.SERVER, 
                    "<SERVER>: " + client.getNickname() + " has joined the chat\n"));
           } catch (Exception e) {
                break;
           } 
        }
    }

    private static Boolean checkUnique(String user, ArrayList<String> users) {
        for (String s: users) {
            if (s.equals(user)) {
                return false;
            }
        }
        return true;
    }
}
