import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {

    private Socket skt;
    private BufferedWriter buffIn;
    private BufferedReader buffOut;
    private String nickname;
    private static GUI gui;

    //Client constructor
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
        } catch (IOException e) {
            closeConnections(skt, buffIn, buffOut); 
        }   
    }

    /*Sends user's nickname and message to thread to be displayed on server */
    public void messageToThread(String msg) {
        try {
            //send user's nickname to thread handler
            buffIn.write(nickname + "\n");
            buffIn.flush();

            /*//TODO: Change input from System.in to input text box on GUI
            Scanner scanner = new Scanner(System.in);

            while (!skt.isClosed()) {
                //read message from input and send on buffered writer
                String msg = gui.otherClientMessagesTextArea.getText();
                //String msg = scanner.nextLine();
                //User's username already accounted for in ClientThread 
                buffIn.write(msg + "\n");
                buffIn.flush();
            }*/
            buffIn.write(msg + "\n");
            buffIn.flush();
        } catch (IOException e) {
            closeConnections(skt, buffIn, buffOut);
        }
    }

    private class readMessagesRunnable implements Runnable {
        public void run() {
            String msg;
            
            while (!skt.isClosed()) {
                try {
                    msg = buffOut.readLine();
                    //TODO: Change from System.out to GUI text box
                    //System.out.println(msg);
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

    public static void main(String[] args) throws UnknownHostException, IOException {
        //TODO: Change from System.in to GUI input text box
        Scanner scanner;
        String nickname;
        Socket skt;
        Client client;

        scanner = new Scanner(System.in);

        System.out.println("Enter nickname: ");
        nickname = scanner.nextLine();

        skt = new Socket("localhost", 6666); 
        client = new Client(skt, nickname);

        gui = new GUI(client);
        gui.setVisible(true);
        
        client.readMessage();
        //client.messageToThread();
    }

}
