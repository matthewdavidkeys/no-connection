import java.awt.*;
/**
 * A simple main GUI customized with icons and will
 * allow users to send and receive messages
 */
public class GUI extends javax.swing.JFrame {

    private String userMessage = "";
    private Client client;
    private final int maxCharCount = 5000;
    private String imageFolder;

    /**
     * Creates a new GUI linked with the current client connected.
     *
     * @param client The client currently connected
     */
    public GUI(Client client) {
        this.client = client;
        initComponents();
    }

    /**
     * Process to initialize all the components for the GUI.
     */                  
    private void initComponents() {

        GUILayeredPane = new javax.swing.JLayeredPane();
        mainPanel = new javax.swing.JPanel();
        nicknamePane = new javax.swing.JPanel();
        nicknameLabel = new javax.swing.JLabel();
        userMessagePanel = new javax.swing.JPanel();
        userMessageScrollPane = new javax.swing.JScrollPane();
        userMessageTextArea = new javax.swing.JTextArea();
        sendButtonPanel = new javax.swing.JPanel();
        sendMessageButton = new javax.swing.JButton();
        otherClientMessagesPanel = new javax.swing.JPanel();
        otherClientMessagesScrollPane = new javax.swing.JScrollPane();
        otherClientMessagesTextArea = new javax.swing.JTextArea();
        formattingLabel = new javax.swing.JLabel();
        vulnerableGhost = new javax.swing.JLabel();
        inky = new javax.swing.JLabel();
        pinky = new javax.swing.JLabel();
        blinky = new javax.swing.JLabel();
        clyde = new javax.swing.JLabel();
        cherry = new javax.swing.JLabel();
        onlineClientsPanel = new javax.swing.JPanel();
        onlineClientsScrollPane = new javax.swing.JScrollPane();
        onlineClientsTextArea = new javax.swing.JTextArea();

	  /**
	   * Determines if the user is working on Linux or Windows
	   * and sets the correct file path for the images
	   */
	  if (System.getProperty("os.name").contains("Windows")) {
            imageFolder = System.getProperty("user.dir") + "/Images";
        } else if (System.getProperty("os.name").contains("Linux")) {
            imageFolder = System.getProperty("user.dir") + "/../Images";
        }

        sendMessageButton.setIcon(new javax.swing.ImageIcon(imageFolder + "/sendMessage.jpg"));
        vulnerableGhost.setIcon(new javax.swing.ImageIcon(imageFolder + "/vulnerableGhost.jpg"));
        cherry.setIcon(new javax.swing.ImageIcon(imageFolder + "/cherry.jpg"));
        inky.setIcon(new javax.swing.ImageIcon(imageFolder + "/inky.jpg"));
        pinky.setIcon(new javax.swing.ImageIcon(imageFolder + "/pinky.jpg"));
        blinky.setIcon(new javax.swing.ImageIcon(imageFolder + "/blinky.jpg"));
        clyde.setIcon(new javax.swing.ImageIcon(imageFolder + "/clyde.jpg"));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GUILayeredPane.setBackground(new Color(255, 255, 255));

        mainPanel.setBackground(new Color(0, 0, 0));

        nicknamePane.setBackground(new Color(0, 0, 0));
        nicknamePane.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));

        nicknameLabel.setBackground(new Color(0, 0, 0));
        nicknameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        nicknameLabel.setForeground(new Color(255, 255, 255));
        nicknameLabel.setText("Nickname");

        javax.swing.GroupLayout nicknamePaneLayout = new javax.swing.GroupLayout(nicknamePane);
        nicknamePane.setLayout(nicknamePaneLayout);
        nicknamePaneLayout.setHorizontalGroup(
            nicknamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nicknameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        nicknamePaneLayout.setVerticalGroup(
            nicknamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nicknameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        userMessagePanel.setBackground(new Color(0, 0, 0));
        userMessagePanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));

        userMessageScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        userMessageTextArea.setBackground(new Color(0, 0, 0));
        userMessageTextArea.setColumns(20);
        userMessageTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        userMessageTextArea.setForeground(new Color(255, 255, 255));
        userMessageTextArea.setLineWrap(true);
        userMessageTextArea.setRows(5);
        userMessageTextArea.setWrapStyleWord(true);
        userMessageTextArea.setBorder(null);
        userMessageTextArea.setCaretColor(new Color(255, 255, 255));
        userMessageTextArea.setMargin(new java.awt.Insets(5, 5, 5, 5));
        userMessageTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userMessageTextAreaKeyTyped(evt);
            }
        });
        userMessageScrollPane.setViewportView(userMessageTextArea);

        javax.swing.GroupLayout userMessagePanelLayout = new javax.swing.GroupLayout(userMessagePanel);
        userMessagePanel.setLayout(userMessagePanelLayout);
        userMessagePanelLayout.setHorizontalGroup(
            userMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userMessageScrollPane)
                .addContainerGap())
        );
        userMessagePanelLayout.setVerticalGroup(
            userMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userMessagePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userMessageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        sendButtonPanel.setBackground(new Color(0, 0, 0));
        sendButtonPanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));

        sendMessageButton.setFocusPainted(false);
        sendMessageButton.setFocusable(false);
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });
        sendMessageButton.setOpaque(false);
        sendMessageButton.setContentAreaFilled(false);

        javax.swing.GroupLayout sendButtonPanelLayout = new javax.swing.GroupLayout(sendButtonPanel);
        sendButtonPanel.setLayout(sendButtonPanelLayout);
        sendButtonPanelLayout.setHorizontalGroup(
            sendButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sendMessageButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sendButtonPanelLayout.setVerticalGroup(
            sendButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sendMessageButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        otherClientMessagesPanel.setBackground(new Color(0, 0, 0));
        otherClientMessagesPanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));

        otherClientMessagesScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        otherClientMessagesTextArea.setEditable(false);
        otherClientMessagesTextArea.setBackground(new Color(0, 0, 0));
        otherClientMessagesTextArea.setColumns(20);
        otherClientMessagesTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        otherClientMessagesTextArea.setForeground(new Color(255, 255, 255));
        otherClientMessagesTextArea.setLineWrap(true);
        otherClientMessagesTextArea.setRows(5);
        otherClientMessagesTextArea.setWrapStyleWord(true);
        otherClientMessagesTextArea.setBorder(null);
        otherClientMessagesTextArea.setCaretColor(new Color(255, 255, 255));
        otherClientMessagesTextArea.setMargin(new java.awt.Insets(5, 5, 5, 5));
        otherClientMessagesScrollPane.setViewportView(otherClientMessagesTextArea);

        javax.swing.GroupLayout otherClientMessagesPanelLayout = new javax.swing.GroupLayout(otherClientMessagesPanel);
        otherClientMessagesPanel.setLayout(otherClientMessagesPanelLayout);
        otherClientMessagesPanelLayout.setHorizontalGroup(
            otherClientMessagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherClientMessagesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(otherClientMessagesScrollPane)
                .addContainerGap())
        );
        otherClientMessagesPanelLayout.setVerticalGroup(
            otherClientMessagesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(otherClientMessagesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(otherClientMessagesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addContainerGap())
        );

        formattingLabel.setBackground(new Color(255, 255, 255));

        vulnerableGhost.setBackground(new Color(0, 0, 0));
        vulnerableGhost.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);

        inky.setBackground(new Color(0, 0, 0));

        pinky.setBackground(new Color(0, 0, 0));

        blinky.setBackground(new Color(0, 0, 0));

        clyde.setBackground(new Color(0, 0, 0));

        cherry.setBackground(new Color(0, 0, 0));

        onlineClientsPanel.setBackground(new Color(0, 0, 0));
        onlineClientsPanel.setBorder(new javax.swing.border.LineBorder(new Color(0, 0, 255), 4, true));
        onlineClientsPanel.setForeground(new Color(255, 255, 255));

        onlineClientsTextArea.setEditable(false);
        onlineClientsTextArea.setBackground(new Color(0, 0, 0));
        onlineClientsTextArea.setColumns(20);
        onlineClientsTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        onlineClientsTextArea.setForeground(new Color(255, 255, 255));
        onlineClientsTextArea.setLineWrap(true);
        onlineClientsTextArea.setRows(5);
        onlineClientsTextArea.setText("/online to display online\nusers\n\n@username to whisper to a user");
        onlineClientsTextArea.setCaretColor(new Color(255, 255, 255));
        onlineClientsScrollPane.setViewportView(onlineClientsTextArea);

        javax.swing.GroupLayout onlineClientsPanelLayout = new javax.swing.GroupLayout(onlineClientsPanel);
        onlineClientsPanel.setLayout(onlineClientsPanelLayout);
        onlineClientsPanelLayout.setHorizontalGroup(
            onlineClientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onlineClientsScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );
        onlineClientsPanelLayout.setVerticalGroup(
            onlineClientsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onlineClientsScrollPane)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(otherClientMessagesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(userMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nicknamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(formattingLabel)
                                .addGap(36, 36, 36)
                                .addComponent(vulnerableGhost)))
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(cherry)
                                        .addGap(152, 152, 152)
                                        .addComponent(inky))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(pinky, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201)
                                        .addComponent(clyde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(blinky, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)))
                        .addComponent(onlineClientsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(clyde))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(pinky)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blinky)
                        .addGap(6, 6, 6)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(cherry)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(inky)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(formattingLabel)
                                            .addComponent(vulnerableGhost)))
                                    .addComponent(nicknamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(onlineClientsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(otherClientMessagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(sendButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );

        GUILayeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout GUILayeredPaneLayout = new javax.swing.GroupLayout(GUILayeredPane);
        GUILayeredPane.setLayout(GUILayeredPaneLayout);
        GUILayeredPaneLayout.setHorizontalGroup(
            GUILayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        GUILayeredPaneLayout.setVerticalGroup(
            GUILayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUILayeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GUILayeredPane)
        );

        pack();
    }          

    /**
     * Gets the user's message and sends it to Client.java on button press.
     *
     * @param evt event generated by button press
     */
    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        userMessage = userMessageTextArea.getText();
        userMessageTextArea.setText("");
        Message message;
        if (!userMessage.isBlank() && userMessage.charAt(0) == '@') {
            message = new Message(Message.MessageType.WHISPER, userMessage + "\n");
        } else if (userMessage.equals("/online")) {
            message = new Message(Message.MessageType.ONLINE, userMessage);
        } else {
            message = new Message(Message.MessageType.MESSAGE, userMessage + "\n");
        }
        client.messageToThread(message);
    }                                                 

    /**
     * Gets the user's message and sends it to Client.java when the enter key is pressed.
     * Limits the user to only send a message which has less characters than the @maxCharCount.
     *
     * @param evt event generated by key press
     */
    private void userMessageTextAreaKeyTyped(java.awt.event.KeyEvent evt) {                                             
        if (userMessageTextArea.getText().length() > maxCharCount && evt.getKeyChar() != '\n') {
            evt.consume();
            String shortenedText = userMessageTextArea.getText().substring(0, maxCharCount);
            userMessageTextArea.setText(shortenedText);
        }
        if (evt.getKeyChar() == '\n' && !evt.isShiftDown()) {
            userMessage = userMessageTextArea.getText();
            userMessageTextArea.setText("");
            Message message;
        if (!userMessage.isBlank() && userMessage.charAt(0) == '@') {
            message = new Message(Message.MessageType.WHISPER, userMessage);
        } else if (userMessage.equals("/online\n")) {
            message = new Message(Message.MessageType.ONLINE, userMessage);
        } else {
            message = new Message(Message.MessageType.MESSAGE, userMessage);
        }
        client.messageToThread(message);
        }
    }                                            

    // Variables declaration
    private javax.swing.JLayeredPane GUILayeredPane;
    private javax.swing.JLabel blinky;
    private javax.swing.JLabel cherry;
    private javax.swing.JLabel clyde;
    private javax.swing.JLabel formattingLabel;
    private javax.swing.JLabel inky;
    private javax.swing.JPanel mainPanel;
    public javax.swing.JLabel nicknameLabel;
    private javax.swing.JPanel nicknamePane;
    private javax.swing.JPanel onlineClientsPanel;
    private javax.swing.JScrollPane onlineClientsScrollPane;
    public javax.swing.JTextArea onlineClientsTextArea;
    private javax.swing.JPanel otherClientMessagesPanel;
    private javax.swing.JScrollPane otherClientMessagesScrollPane;
    public javax.swing.JTextArea otherClientMessagesTextArea;
    private javax.swing.JLabel pinky;
    private javax.swing.JPanel sendButtonPanel;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JPanel userMessagePanel;
    private javax.swing.JScrollPane userMessageScrollPane;
    private javax.swing.JTextArea userMessageTextArea;
    private javax.swing.JLabel vulnerableGhost;
    // End of variables declaration                   
}
