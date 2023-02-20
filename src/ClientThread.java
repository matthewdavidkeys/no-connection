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

    private void send_whisper(String message, String recipientNick) throws IOException {
        ClientThread recipient = null;
        // find object of recipient
        for (ClientThread cThread : cThreads) {
            if (cThread.user.equals(recipientNick)) {
                recipient = cThread;
                break;
            }
        }
        // invalid user
        if (recipient == null) {
            buffIn.write(recipientNick + " is not a valid user.\n");
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

    public void closeConnections(Socket skt, BufferedWriter buffIn, BufferedReader buffOut) {
        leave();
        try {
            if (skt != null) {
                skt.close();
            }

            if (buffOut != null) {
                buffOut.close();
            }

            if (buffIn != null) {
                buffIn.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ClientThread(Socket that) {
        InputStreamReader in;
        OutputStreamWriter out;
        boolean userExists=false;

        this.skt = that;
        try {
            in = new InputStreamReader(skt.getInputStream());
            out = new OutputStreamWriter(skt.getOutputStream());
            buffIn = new BufferedWriter(out);
            buffOut = new BufferedReader(in);   
            // get username from client
            user = buffOut.readLine();

            for (ClientThread cThread : cThreads) {
                System.out.println(cThread.user);
                if (cThread.user.equals(user)) {
                    userExists = true;
                    break;
                }
            }
            if (userExists){
                //this won't write back but
                System.out.println("this username is already chosen");
                buffIn.write("This username is already chosen");
                buffIn.flush();
            } else {
                System.out.println("User \"" + user + "\" has joined chat.");
                send_all("Hi, I've joined the chat.");
                cThreads.add(this);
            }
        } catch (IOException e) {
            System.out.println("Error: Could not intialise socket stream:\n." + skt);
            e.printStackTrace();
            closeConnections(that, buffIn, buffOut);
        }
    }

    @Override
    public void run() {
        String s, whisperUser, restOfMsg;
        while (!skt.isClosed()) {
            try {
                s = buffOut.readLine();
                if (s.charAt(0) == '@') {
                    whisperUser = s.substring(1, s.indexOf(' ')); //gets whisper username
                    restOfMsg = s.substring(s.indexOf(' ') + 1);
                    send_whisper(restOfMsg, whisperUser);
                } else {
                    send_all(s);
                }
            } catch (IOException e) {
                closeConnections(skt, buffIn, buffOut);
                break;
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
