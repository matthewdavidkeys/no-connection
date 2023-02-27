import java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.swing.*;

public class Client {

    private Socket skt;
    //private BufferedWriter buffIn;
    //private BufferedReader buffOut;
    private ObjectInputStream objectIn;
    private ObjectOutputStream objectOut;
    private String nickname;
    private static GUI gui;

    /*
     * Client constructor
     */
    public Client(Socket skt, String nickname, ObjectInputStream objectIn, ObjectOutputStream objectOut) {
        InputStream in;
        OutputStream out;
        try {
            this.skt = skt;
            this.nickname = nickname;
            //Set input and output to input and output of given socket
            /*in = skt.getInputStream();
            out = skt.getOutputStream();
            objectOut = new ObjectOutputStream(new BufferedOutputStream(out));
            objectOut.flush();
            objectIn = new ObjectInputStream(new BufferedInputStream(in));*/
            this.objectIn = objectIn;
            this.objectOut = objectOut;
    
            //write nickname to stream
            objectOut.writeObject(new Message(Message.MessageType.CLIENT, nickname));
            objectOut.flush();
        } catch (IOException e) {
            closeConnections(skt, objectIn, objectOut); 
        }   
    }

    /*Sends user's nickname and message to thread to be displayed on server */
    public void messageToThread(Message msg) {
        try {
            objectOut.writeObject(msg);
            objectOut.flush();
        } catch (IOException e) {
            closeConnections(skt, objectIn, objectOut);
        }
    }

    /*
     * Runnable class run by a thread to constantly read
     * messages from buffer to display to user
     */
    private class readMessagesRunnable implements Runnable {
        public void run() {
            Message message;
            String msg;
            
            while (!skt.isClosed()) {
                try {
                    message = (Message) objectIn.readObject();
                    msg = message.getMessage();
                    if (msg == null) {
                        gui.otherClientMessagesTextArea.append("<SERVER ERROR>: Server host program terminated/crashed.\n");
                        TimeUnit.SECONDS.sleep(3);
                        closeConnections(skt, objectIn, objectOut);
                        System.exit(0);
                        break;
                    }                 
                    gui.otherClientMessagesTextArea.append(msg);

                } catch (IOException | InterruptedException | ClassNotFoundException e) {
                    closeConnections(skt, objectIn, objectOut);
                }
            }
        }
    }

    /*Reads all messages on server 
     * Uses separate thread to not block program
    */
    public void readMessage() {
        readMessagesRunnable read = new readMessagesRunnable();
        Thread thread = new Thread(read);
        thread.start();    
    }

    /*
     * Closes all sockets and buffers between client and client thread / server
     * Checks for null to avoid null pointer exceptions
     */
    public void closeConnections(Socket skt, ObjectInputStream objectIn, ObjectOutputStream objectOut) {
        try {
            if (skt != null) {
                skt.close();
            }

            if (objectIn != null) {
                objectIn.close();
            }

            if (objectOut != null) {
                objectOut.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * Creates login GUI
     * Client and socket created within GUIStart.java
     */
    public static void main(String[] args){
        GUIStart startGUI;
        try {
            startGUI = new GUIStart();
            startGUI.setVisible(true);
        } catch (Exception e) {
            System.out.println("Incorrect IP or port...");
            System.exit(1);
        }
    }

    public void setGUI(GUI gui) {
        this.gui = gui;
    }

}
