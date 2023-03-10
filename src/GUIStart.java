import java.net.*;
import java.io.*;
import java.awt.*;

/**
 * A simple starting GUI that will get the user's desired
 * nickname as well as port and IP they want to connect to.
 */
public class GUIStart extends javax.swing.JFrame {
    
    private String nickname;
    private String port;
    private String IP;
    private final int maxCharCount = 19;

    /**
     * Creates a new GUIStart
     */
    public GUIStart() {
        initComponents();
    }

     /**
     * Process to initialize all the components for the GUIStart.
     */
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        nicknameLabelPanel = new javax.swing.JPanel();
        nicknameLabel = new javax.swing.JLabel();
        portLabelPanel = new javax.swing.JPanel();
        portLabel = new javax.swing.JLabel();
        IPLabelPanel = new javax.swing.JPanel();
        IPLabel = new javax.swing.JLabel();
        nicknameTextField = new javax.swing.JTextField();
        portTextField = new javax.swing.JTextField();
        IPTextField = new javax.swing.JTextField();
        connectButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        errorMessageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new Color(0, 0, 0));
        mainPanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        mainPanel.setForeground(new Color(255, 255, 255));

        nicknameLabelPanel.setBackground(new Color(0, 0, 0));
        nicknameLabelPanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));

        nicknameLabel.setBackground(new Color(0, 0, 0));
        nicknameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        nicknameLabel.setForeground(new Color(255, 255, 255));
        nicknameLabel.setText("Nickname:");

        javax.swing.GroupLayout nicknameLabelPanelLayout = new javax.swing.GroupLayout(nicknameLabelPanel);
        nicknameLabelPanel.setLayout(nicknameLabelPanelLayout);
        nicknameLabelPanelLayout.setHorizontalGroup(
            nicknameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nicknameLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nicknameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        nicknameLabelPanelLayout.setVerticalGroup(
            nicknameLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nicknameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        portLabelPanel.setBackground(new Color(0, 0, 0));
        portLabelPanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));

        portLabel.setBackground(new Color(0, 0, 0));
        portLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        portLabel.setForeground(new Color(255, 255, 255));
        portLabel.setText("Port:");

        javax.swing.GroupLayout portLabelPanelLayout = new javax.swing.GroupLayout(portLabelPanel);
        portLabelPanel.setLayout(portLabelPanelLayout);
        portLabelPanelLayout.setHorizontalGroup(
            portLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, portLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(portLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        portLabelPanelLayout.setVerticalGroup(
            portLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(portLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        IPLabelPanel.setBackground(new Color(0, 0, 0));
        IPLabelPanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        IPLabelPanel.setForeground(new Color(255, 255, 255));

        IPLabel.setBackground(new Color(51, 51, 51));
        IPLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        IPLabel.setForeground(new Color(255, 255, 255));
        IPLabel.setText("IP:");

        javax.swing.GroupLayout IPLabelPanelLayout = new javax.swing.GroupLayout(IPLabelPanel);
        IPLabelPanel.setLayout(IPLabelPanelLayout);
        IPLabelPanelLayout.setHorizontalGroup(
            IPLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IPLabelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );
        IPLabelPanelLayout.setVerticalGroup(
            IPLabelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IPLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        nicknameTextField.setBackground(new Color(0, 0, 0));
        nicknameTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        nicknameTextField.setForeground(new Color(255, 255, 255));
        nicknameTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        nicknameTextField.setCaretColor(new Color(255, 255, 255));
	  nicknameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicknameTextFieldKeyTyped(evt);
            }
        });
	  nicknameTextField.setTransferHandler(null);

        portTextField.setBackground(new Color(0, 0, 0));
        portTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        portTextField.setForeground(new Color(255, 255, 255));
        portTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        portTextField.setCaretColor(new Color(255, 255, 255));

        IPTextField.setBackground(new Color(0, 0, 0));
        IPTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        IPTextField.setForeground(new Color(255, 255, 255));
        IPTextField.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        IPTextField.setCaretColor(new Color(255, 255, 255));

        connectButton.setBackground(new Color(0, 0, 0));
        connectButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        connectButton.setForeground(new Color(255, 255, 255));
        connectButton.setText("Connect");
        connectButton.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new Color(0, 0, 0));
        cancelButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        cancelButton.setForeground(new Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
	  cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        errorMessageLabel.setBackground(new Color(0, 0, 0));
        errorMessageLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        errorMessageLabel.setForeground(new Color(255, 255, 255));
        errorMessageLabel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        errorMessageLabel.setVisible(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(nicknameLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nicknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(portLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(IPLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(errorMessageLabel)))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nicknameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(nicknameLabelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(portLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(portTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IPLabelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IPTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(connectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorMessageLabel)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    /**
     * Allows a user to connect to the appropriate port and IP for the server on button press.
     *
     * @param evt event generated by button press
     */
    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (!nicknameTextField.getText().equals("") && !portTextField.getText().equals("") && !IPTextField.getText().equals("")) {
            nickname = nicknameTextField.getText();
            port = portTextField.getText();
            IP = IPTextField.getText();

            try {
                Socket skt = new Socket(IP, Integer.parseInt(port)); 
                ObjectOutputStream objectOut = new ObjectOutputStream(skt.getOutputStream());
                objectOut.flush();
                ObjectInputStream objectIn = new ObjectInputStream(skt.getInputStream());
                objectOut.writeObject(new Message(Message.MessageType.CLIENT, nickname));
                objectOut.flush();
                Message message = (Message) objectIn.readObject();
                if (message.getMessage().equals("unique")) {
                    finishSetup(skt, nickname, objectIn, objectOut);
                } else {
                    errorMessageLabel.setText("Username already taken");
                    errorMessageLabel.setVisible(true);
                    skt.close();
                }
            } catch (Exception e) {
                errorMessageLabel.setText("Incorrect IP or port...");
		    errorMessageLabel.setVisible(true);
            }
        } else if (nicknameTextField.getText().equals("")) {
            errorMessageLabel.setText("Please enter a valid nickname");
            errorMessageLabel.setVisible(true);
        } else if (portTextField.getText().equals("")) {
            errorMessageLabel.setText("Please enter a valid port number");
            errorMessageLabel.setVisible(true);
        } else {
            errorMessageLabel.setText("Please enter a valid IP address");
            errorMessageLabel.setVisible(true);
        }
    }

    /**
     * Makes sure the user's nickname has no spaces in it
     * and caps it to a certain amount of characters.
     *
     * @param evt event generated by key press
     */
    private void nicknameTextFieldKeyTyped(java.awt.event.KeyEvent evt) {                                           
        if (nicknameTextField.getText().length() >= maxCharCount || evt.getKeyChar() == ' ') {
            evt.consume();
        }
    }

    /**
     * Finishes the setup to connect to the socket and make the main GUI visible.
     *
     * @param skt Socket of client/server connection
     * @param nickname Nickname of user
     * @param objectIn ObjectInputStream that reads Message objects from input stream
     * @param objectOut ObjectOutputStream that writes Message objects to output stream
     */
    private void finishSetup(Socket skt, String nickname, ObjectInputStream objectIn, ObjectOutputStream objectOut) {
        GUI gui;
        Client client = new Client(skt, nickname, objectIn, objectOut);
        gui = new GUI(client);
        client.setGUI(gui); 
        client.readMessage();
        gui.nicknameLabel.setText(nickname);
        gui.setVisible(true);
        this.setVisible(false);
    }

    /**
     * Closes the program when the cancel button is pressed.
     *
     * @param evt event generated by button press
     */
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIStart().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JLabel IPLabel;
    private javax.swing.JPanel IPLabelPanel;
    public javax.swing.JTextField IPTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton connectButton;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JPanel nicknameLabelPanel;
    public javax.swing.JTextField nicknameTextField;
    private javax.swing.JLabel portLabel;
    private javax.swing.JPanel portLabelPanel;
    public javax.swing.JTextField portTextField;
    // End of variables declaration
}
