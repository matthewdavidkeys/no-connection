import java.io.*;
import java.net.*;

public class Server {
    private static ServerSocket sskt;
    private static Socket skt;
    private static final int portNum = 6666;

    public static void main(String[] args) throws IOException {
        ClientThread client;        

        // listen for connecting clients while active
        sskt = new ServerSocket(portNum);
        System.out.println("Server started on port: " + portNum);
        
        while (!sskt.isClosed()) {
           try {
                skt = sskt.accept();
                System.out.println("Client connected.");
                client = new ClientThread(skt);
                Thread cThread = new Thread(client);
                cThread.start();

           } catch (Exception e) {
                e.getStackTrace();
           } 
        }
        System.out.println("Server terminated.");
    }
}
