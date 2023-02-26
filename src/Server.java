import java.io.*;
import java.net.*;
import java.util.concurrent.CopyOnWriteArrayList;
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

        // listen for connecting clients while active
        sskt = new ServerSocket(portNum);
        System.out.println("Server started on port: " + portNum);
        
        while (true) {
           try {

                // wait for someone to connect
                skt = sskt.accept();
                System.out.println("Client connected.");
                client = new ServerThread(skt, threadList);
                threadList.add(client);
                Thread clientThread = new Thread(client);
                clientThread.start();
                client.send_all("<SERVER>: " + client.getNickname() + " has joined the chat");

           } catch (Exception e) {
                break;
           } 
        }
    }
}
