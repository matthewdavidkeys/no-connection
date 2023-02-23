import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    private Socket skt;
    private BufferedWriter buffIn;
    private BufferedReader buffOut;
    private String nickname;
    private static GUI gui;

    /*
     * Client constructor
     */
    public Client(Socket skt, String nickname) {
        InputStreamReader in;
        OutputStreamWriter out;
        try {
            this.skt = skt;
            this.nickname = nickname;
            //Set input and output to input and output of given socket
            in = new InputStreamReader(skt.getInputStream());
            out = new OutputStreamWriter(skt.getOutputStream());
            this.buffIn = new BufferedWriter(out);
            this.buffOut = new BufferedReader(in);
            buffIn.write(nickname + "\n");
            buffIn.flush();
        } catch (IOException e) {
            closeConnections(skt, buffIn, buffOut); 
        }   
    }

    /*Sends user's nickname and message to thread to be displayed on server */
    public void messageToThread(String msg) {
        try {
            buffIn.write(msg);
            buffIn.flush();
        } catch (IOException e) {
            closeConnections(skt, buffIn, buffOut);
        }
    }

    /*
     * Runnable class run by a thread to constantly read
     * messages from buffer to display to user
     */
    private class readMessagesRunnable implements Runnable {
        public void run() {
            String msg;
            
            while (!skt.isClosed()) {
                try {
                    msg = buffOut.readLine();
                    gui.otherClientMessagesTextArea.append(msg + "\n");

                } catch (IOException e) {
                    closeConnections(skt, buffIn, buffOut);
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
    public void closeConnections(Socket skt, BufferedWriter buffIn, BufferedReader buffOut) {
        try {
            if (skt != null) {
                skt.close();
            }

            if (buffIn != null) {
                buffIn.close();
            }

            if (buffOut != null) {
                buffOut.close();
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
