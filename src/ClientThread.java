import java.io.*;
import java.net.*;
import java.util.ArrayList;

public class ClientThread implements Runnable{

    private static ArrayList<ClientThread> cThreads = new ArrayList<ClientThread>();
    private BufferedReader buffOut;
    private BufferedWriter buffIn;
    private Socket skt;
    private String user;

    private void send_all(String message) {
        for (ClientThread cThread : cThreads) {
            try {
                cThread.buffIn.write(user + ": " + message + "\n");
                cThread.buffIn.flush();
            } catch (IOException e) {
                leave();
            }
        } 
    }

    private void send_whisper(String message, String user) throws IOException {
        ClientThread recipient = null;
        // find object of recipient
        for (ClientThread cThread : cThreads) {
            if (cThread.user == user) {
                recipient = cThread;
                break;
            }
        }
        // invalid user
        if (recipient == null) {
            buffIn.write(user + " is not a valid user.\n");
            buffIn.flush();
            return;
        }

        // send to recipient
        try {
            recipient.buffIn.write(user + ": " + message + "\n");
            recipient.buffIn.flush();
        } catch (IOException e) {
            leave();
        } 
    }

    private void leave() {
        try {
            skt.close();
            cThreads.remove(this);
            send_all("Goodbye!");
            buffIn.close();
            buffOut.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public ClientThread(Socket that) {
        InputStreamReader in;
        OutputStreamWriter out;

        this.skt = that;
        try {
            in = new InputStreamReader(skt.getInputStream());
            out = new OutputStreamWriter(skt.getOutputStream());
            buffIn = new BufferedWriter(out);
            buffOut = new BufferedReader(in);   
            // get username from client
            user = buffOut.readLine();
            System.out.println("User \"" + user + "\" has joined chat.");

            send_all("Hi, I've joined the chat.");
            cThreads.add(this);
        } catch (IOException e) {
            System.out.println("Error: Could not intialise socket stream:\n." + skt);
            e.printStackTrace();
            return;
        }
    }

    @Override
    public void run() {
        String s;
        while (!skt.isClosed()) {
            try {
                s = buffOut.readLine();
                send_all(s);
            } catch (IOException e) {
                leave();
            }
        }
        // Socket connection dropped
        try {
            //buffIn.close();
            //buffOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
