import java.io.*;
import java.net.*;
/**
 * Simple server that opens a port and listens for connecting clients.
 * Idea for structure:
 * YouTube: Java Socket Programming - Multiple Clients Chat by WittCode
 */
public class Server {
    private static ServerSocket sskt;
    private static Socket skt;
    private static final int portNum = 6666;

    public static void main(String[] args) throws IOException {
        ServerThread client;        

        // listen for connecting clients while active
        sskt = new ServerSocket(portNum);
        System.out.println("Server started on port: " + portNum);
        
        while (!sskt.isClosed()) {
           try {
                skt = sskt.accept();
                System.out.println("Client connected.");
                client = new ServerThread(skt);
                Thread cThread = new Thread(client);
                cThread.start();
                client.send_all("<SERVER>: " + client.getNickname() + " has joined the chat");

           } catch (Exception e) {
                e.getStackTrace();
           } 
        }
        System.out.println("Server terminated.");
    }
}
