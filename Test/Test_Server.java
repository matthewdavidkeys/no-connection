
import org.junit.*;

import junit.framework.TestCase;

import java.net.*;
import java.io.*;


/*
 * Note this test folder uses a slightly modified version of the main src
 * For example making somethings public or gives a return where there is no need for return
 */


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
            TestClient ClientSocket;
     
            ClientSocket = new TestClient(new Socket(IP, PORT),"bob the Legend");      
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
        TestClient[] ClientSockets = new TestClient[numClients];
        Thread[] threads = new Thread[numClients];
        for (int i = 0; i < numClients; i++) {
            final int clientNum = i;
            threads[i] = new Thread(() -> {
                try {
                    ClientSockets[clientNum] = new TestClient(new Socket(IP, PORT),"bob"+Integer.toString(clientNum));
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
    @Test
    public void testMessageToAll() throws IOException{
        Socket user1 = new Socket(IP,PORT);
        
        
        
        Thread thrd = new Thread(()-> {
            try {
                TestClient Messanger;
                Messanger = new TestClient(user1,"user1");
                Messanger.messageToThread("@Ping hello");
                
            } catch (Exception e) {
                assertTrue(false);
                // TODO: handle exception
                e.printStackTrace();
            }
            assertTrue(true);
        });
    }

    @Test
    public void testWhisper() throws IOException{
        Socket user1 = new Socket(IP,PORT);
        Thread thrd = new Thread(()-> {
            try {
                TestClient Messanger;
                Messanger = new TestClient(user1,"user1");
                Messanger.messageToThread("Ping");
                
            } catch (Exception e) {
                assertTrue(false);
                // TODO: handle exception
                e.printStackTrace();
            }
            assertTrue(true);
        });
    }

    public synchronized void check(){
        passed = false;
    }
}
