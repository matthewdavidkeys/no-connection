
import org.junit.*;

import junit.framework.TestCase;

import java.net.*;
import java.io.*;

import ClientThread;



public class Test_Server extends TestCase{
    /* This is the home addr */
    public final String IP = "127.0.0.1";
    /* This is the port of the server you need to connect to */
    public final int PORT = 6666;

    private boolean passed = true;
  /*   class MultiConnect extends Thread{
        public void run(){
                Socket ClientSocket;
                try {
                    ClientSocket = new Socket(IP,PORT);
                    assertTrue(ClientSocket.isConnected());
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }             
        }

    } */


    /**
     * Check for basic connection between the server and the client
     * @throws IOException
     * 
     */
    @Test
    public void testConnect() throws IOException{
        boolean pass=true;
        System.out.println("Check if connection with one client");
        
        try {     
            ClientThread ClientSocket;
     
            ClientSocket = new ClientThread(new Socket(IP, PORT),"bob the");      
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            pass = false;
        } 
        assertTrue(pass);       
    }

    /**
     * Checks if multiple clients connects to server.
     * @throws IOException
     */
    @Test
    public void testMultiConnect() throws IOException{
        System.out.println("Check if connection with multiple clients");
        boolean allAlive = true;
        int numClients = 8;
        ClientThread[] ClientSockets = new ClientThread[numClients];
        Thread[] threads = new Thread[numClients];
        for (int i = 0; i < numClients; i++) {
            final int clientNum = i;
            threads[i] = new Thread(() -> {
                try {
                    ClientSockets[clientNum] = new ClientThread(new Socket(IP, PORT),"bob"+Integer.toString(clientNum));
                } catch (IOException e) {
                    e.printStackTrace();
                    check();
                }
            });
            threads[i].start();
        }
        while (allAlive){
            allAlive = false;
            for (int i = 0; i < numClients; i++) {
                if (threads[i].isAlive()){
                    allAlive = true;
                }
            }

        }
        assertEquals(true,passed);
        
    }

    /**
     * give one message to server
     */
    /*@Test
    public void testMessage(){
        
    }*/

    public synchronized void check(){
        passed = false;
    }
}
