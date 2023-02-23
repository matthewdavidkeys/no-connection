
public class GUI extends javax.swing.JFrame {

    public String userMessage = "";
    public String port;
    public String nickname;
    public Client client;
    int maxCharCount = 5000;

    /**
     * Creates new form GUI
     * @param client The client currently connected
     */
    public GUI(Client client) {
//      public GUI() {
        this.client = client;
        initComponents();
//        onlineClientsScrollPane.setVisible(false);
//        onlineClientsTextArea.setVisible(false);

        sendMessageButton.setOpaque(false);
        sendMessageButton.setContentAreaFilled(false);
        
        mainPanel.setVisible(false);
        errorMessageLabel.setVisible(false);

	  String imageFolder = System.getProperty("user.dir") + "/../Images";
	  sendMessageButton.setIcon(new javax.swing.ImageIcon(imageFolder + "/sendMessage.jpg"));
        vulnerableGhost1.setIcon(new javax.swing.ImageIcon(imageFolder + "/vulnerableGhost.jpg"));
        vulnerableGhost2.setIcon(new javax.swing.ImageIcon(imageFolder + "/vulnerableGhost.jpg"));
        cherry.setIcon(new javax.swing.ImageIcon(imageFolder + "/cherry.jpg"));
        inky.setIcon(new javax.swing.ImageIcon(imageFolder + "/inky.jpg"));
        pinky.setIcon(new javax.swing.ImageIcon(imageFolder + "/pinky.jpg"));
        blinky.setIcon(new javax.swing.ImageIcon(imageFolder + "/blinky.jpg"));
        clyde.setIcon(new javax.swing.ImageIcon(imageFolder + "/clyde.jpg"));
        
    }

    @SuppressWarnings("unchecked")
    /**
     * Code for the layout of the GUI
    */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GUILayeredPane = new javax.swing.JLayeredPane();
        startPanel = new javax.swing.JPanel();
        nicknameTextField = new javax.swing.JTextField();
        portTextField = new javax.swing.JTextField();
        nicknameStartPanel = new javax.swing.JPanel();
        nicknameStartLabel = new javax.swing.JLabel();
        portStartPanel = new javax.swing.JPanel();
        portStartLabel = new javax.swing.JLabel();
        cancelButtonPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        connectBbuttonPanel = new javax.swing.JPanel();
        connectButton = new javax.swing.JButton();
        errorMessageLabel = new javax.swing.JLabel();
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
        vulnerableGhost2 = new javax.swing.JLabel();
        vulnerableGhost1 = new javax.swing.JLabel();
        inky = new javax.swing.JLabel();
        pinky = new javax.swing.JLabel();
        blinky = new javax.swing.JLabel();
        clyde = new javax.swing.JLabel();
        cherry = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GUILayeredPane.setBackground(new java.awt.Color(255, 255, 255));

        startPanel.setBackground(new java.awt.Color(0, 0, 0));

        nicknameTextField.setBackground(new java.awt.Color(0, 0, 0));
        nicknameTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        nicknameTextField.setForeground(new java.awt.Color(255, 255, 255));
        nicknameTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        nicknameTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        portTextField.setBackground(new java.awt.Color(0, 0, 0));
        portTextField.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        portTextField.setForeground(new java.awt.Color(255, 255, 255));
        portTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        portTextField.setCaretColor(new java.awt.Color(255, 255, 255));

        nicknameStartPanel.setBackground(new java.awt.Color(0, 0, 0));
        nicknameStartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        nicknameStartLabel.setBackground(new java.awt.Color(0, 0, 0));
        nicknameStartLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        nicknameStartLabel.setForeground(new java.awt.Color(255, 255, 255));
        nicknameStartLabel.setText("Nickname:");

        javax.swing.GroupLayout nicknameStartPanelLayout = new javax.swing.GroupLayout(nicknameStartPanel);
        nicknameStartPanel.setLayout(nicknameStartPanelLayout);
        nicknameStartPanelLayout.setHorizontalGroup(
            nicknameStartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nicknameStartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        nicknameStartPanelLayout.setVerticalGroup(
            nicknameStartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nicknameStartLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        portStartPanel.setBackground(new java.awt.Color(0, 0, 0));
        portStartPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        portStartLabel.setBackground(new java.awt.Color(0, 0, 0));
        portStartLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        portStartLabel.setForeground(new java.awt.Color(255, 255, 255));
        portStartLabel.setText("Port:");

        javax.swing.GroupLayout portStartPanelLayout = new javax.swing.GroupLayout(portStartPanel);
        portStartPanel.setLayout(portStartPanelLayout);
        portStartPanelLayout.setHorizontalGroup(
            portStartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(portStartLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        portStartPanelLayout.setVerticalGroup(
            portStartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(portStartLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );

        cancelButtonPanel.setBackground(new java.awt.Color(0, 0, 0));
        cancelButtonPanel.setForeground(new java.awt.Color(255, 255, 255));

        cancelButton.setBackground(new java.awt.Color(0, 0, 0));
        cancelButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        javax.swing.GroupLayout cancelButtonPanelLayout = new javax.swing.GroupLayout(cancelButtonPanel);
        cancelButtonPanel.setLayout(cancelButtonPanelLayout);
        cancelButtonPanelLayout.setHorizontalGroup(
            cancelButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        cancelButtonPanelLayout.setVerticalGroup(
            cancelButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelButton)
        );

        connectBbuttonPanel.setBackground(new java.awt.Color(0, 0, 0));
        connectBbuttonPanel.setForeground(new java.awt.Color(255, 255, 255));

        connectButton.setBackground(new java.awt.Color(0, 0, 0));
        connectButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        connectButton.setForeground(new java.awt.Color(255, 255, 255));
        connectButton.setText("Connect");
        connectButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout connectBbuttonPanelLayout = new javax.swing.GroupLayout(connectBbuttonPanel);
        connectBbuttonPanel.setLayout(connectBbuttonPanelLayout);
        connectBbuttonPanelLayout.setHorizontalGroup(
            connectBbuttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(connectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
        );
        connectBbuttonPanelLayout.setVerticalGroup(
            connectBbuttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(connectButton)
        );

        errorMessageLabel.setBackground(new java.awt.Color(255, 255, 255));
        errorMessageLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        errorMessageLabel.setForeground(new java.awt.Color(255, 255, 255));
        errorMessageLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        javax.swing.GroupLayout startPanelLayout = new javax.swing.GroupLayout(startPanel);
        startPanel.setLayout(startPanelLayout);
        startPanelLayout.setHorizontalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addComponent(connectBbuttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(366, 366, 366)
                        .addComponent(cancelButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(startPanelLayout.createSequentialGroup()
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nicknameStartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(portStartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(portTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                            .addComponent(nicknameTextField)
                            .addComponent(errorMessageLabel))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        startPanelLayout.setVerticalGroup(
            startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(startPanelLayout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nicknameStartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nicknameTextField))
                .addGap(41, 41, 41)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(portStartPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(portTextField))
                .addGap(69, 69, 69)
                .addGroup(startPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(connectBbuttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(errorMessageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(0, 0, 0));

        nicknamePane.setBackground(new java.awt.Color(0, 0, 0));
        nicknamePane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        nicknameLabel.setBackground(new java.awt.Color(0, 0, 0));
        nicknameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        nicknameLabel.setForeground(new java.awt.Color(255, 255, 255));
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

        userMessagePanel.setBackground(new java.awt.Color(0, 0, 0));
        userMessagePanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        userMessageScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        userMessageTextArea.setBackground(new java.awt.Color(0, 0, 0));
        userMessageTextArea.setColumns(20);
        userMessageTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        userMessageTextArea.setForeground(new java.awt.Color(255, 255, 255));
        userMessageTextArea.setLineWrap(true);
        userMessageTextArea.setRows(5);
        userMessageTextArea.setWrapStyleWord(true);
        userMessageTextArea.setBorder(null);
        userMessageTextArea.setCaretColor(new java.awt.Color(255, 255, 255));
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

        sendButtonPanel.setBackground(new java.awt.Color(0, 0, 0));
        sendButtonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        sendMessageButton.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\sendMessage.jpg")); // NOI18N
        sendMessageButton.setFocusPainted(false);
        sendMessageButton.setFocusable(false);
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

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

        otherClientMessagesPanel.setBackground(new java.awt.Color(0, 0, 0));
        otherClientMessagesPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        otherClientMessagesScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        otherClientMessagesTextArea.setEditable(false);
        otherClientMessagesTextArea.setBackground(new java.awt.Color(0, 0, 0));
        otherClientMessagesTextArea.setColumns(20);
        otherClientMessagesTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        otherClientMessagesTextArea.setForeground(new java.awt.Color(255, 255, 255));
        otherClientMessagesTextArea.setLineWrap(true);
        otherClientMessagesTextArea.setRows(5);
        otherClientMessagesTextArea.setWrapStyleWord(true);
        otherClientMessagesTextArea.setBorder(null);
        otherClientMessagesTextArea.setCaretColor(new java.awt.Color(255, 255, 255));
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

        formattingLabel.setBackground(new java.awt.Color(255, 255, 255));

        vulnerableGhost2.setBackground(new java.awt.Color(0, 0, 0));
        vulnerableGhost2.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\vulnerableGhost.jpg")); // NOI18N

        vulnerableGhost1.setBackground(new java.awt.Color(0, 0, 0));
        vulnerableGhost1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        vulnerableGhost1.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\vulnerableGhost.jpg")); // NOI18N

        inky.setBackground(new java.awt.Color(0, 0, 0));
        inky.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\inky.jpg")); // NOI18N

        pinky.setBackground(new java.awt.Color(0, 0, 0));
        pinky.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\pinky.jpg")); // NOI18N

        blinky.setBackground(new java.awt.Color(0, 0, 0));
        blinky.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\blinky.jpg")); // NOI18N
        blinky.setText("jLabel1");

        clyde.setBackground(new java.awt.Color(0, 0, 0));
        clyde.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\clyde.jpg")); // NOI18N
        clyde.setText("jLabel1");

        cherry.setBackground(new java.awt.Color(0, 0, 0));
        cherry.setIcon(new javax.swing.ImageIcon("D:\\UNI\\Third Year\\CS 313\\JavaApplication26\\Images\\cherry.jpg")); // NOI18N

        jComboBox2.setForeground(new java.awt.Color(255, 102, 0));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(nicknamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(pinky, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(blinky, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clyde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otherClientMessagesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(userMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sendButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(vulnerableGhost2)))))
                        .addContainerGap())
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(formattingLabel)
                        .addGap(36, 36, 36)
                        .addComponent(vulnerableGhost1)
                        .addGap(183, 183, 183)
                        .addComponent(cherry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                        .addComponent(inky)
                        .addGap(237, 237, 237))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(blinky)
                                .addGap(21, 21, 21)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(formattingLabel)
                                    .addComponent(vulnerableGhost1)))
                            .addComponent(nicknamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pinky)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(clyde))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(cherry)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(inky)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))))
                .addComponent(otherClientMessagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(sendButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(vulnerableGhost2)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        GUILayeredPane.setLayer(startPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        GUILayeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout GUILayeredPaneLayout = new javax.swing.GroupLayout(GUILayeredPane);
        GUILayeredPane.setLayout(GUILayeredPaneLayout);
        GUILayeredPaneLayout.setHorizontalGroup(
            GUILayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GUILayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(startPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GUILayeredPaneLayout.setVerticalGroup(
            GUILayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GUILayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(startPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        userMessage = userMessageTextArea.getText();
        userMessageTextArea.setText("");
        client.messageToThread(userMessage + "\n");
//        otherClientMessagesTextArea.append(userMessage + "\n");
    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void userMessageTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userMessageTextAreaKeyTyped
        if (userMessageTextArea.getText().length() >= maxCharCount) {
            evt.consume();
            String shortenedText = userMessageTextArea.getText().substring(0, maxCharCount);
            userMessageTextArea.setText(shortenedText);
        }
        if (evt.getKeyChar() == '\n') {
            userMessage = userMessageTextArea.getText();
            userMessageTextArea.setText("");
            client.messageToThread(userMessage);
//            otherClientMessagesTextArea.append(userMessage);
        }
    }//GEN-LAST:event_userMessageTextAreaKeyTyped

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        userMessageTextArea.setText("@" + jComboBox2.getSelectedItem() + " ");
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        if (!nicknameTextField.getText().equals("") && !portTextField.getText().equals("")) {
            nickname = nicknameTextField.getText();
            port = portTextField.getText();
            nicknameLabel.setText(nicknameTextField.getText());
            startPanel.setVisible(false);
            mainPanel.setVisible(true);
        } else if (nicknameTextField.getText().equals("")) {
            errorMessageLabel.setText("Please enter a valid nickname");
            errorMessageLabel.setVisible(true);
        } else {
            errorMessageLabel.setText("Please enter a valid port number");
            errorMessageLabel.setVisible(true);
        }
    }//GEN-LAST:event_connectButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new GUI().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane GUILayeredPane;
    private javax.swing.JLabel blinky;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel cancelButtonPanel;
    private javax.swing.JLabel cherry;
    private javax.swing.JLabel clyde;
    private javax.swing.JPanel connectBbuttonPanel;
    private javax.swing.JButton connectButton;
    private javax.swing.JLabel errorMessageLabel;
    private javax.swing.JLabel formattingLabel;
    private javax.swing.JLabel inky;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JPanel nicknamePane;
    private javax.swing.JLabel nicknameStartLabel;
    private javax.swing.JPanel nicknameStartPanel;
    public javax.swing.JTextField nicknameTextField;
    private javax.swing.JPanel otherClientMessagesPanel;
    private javax.swing.JScrollPane otherClientMessagesScrollPane;
    public javax.swing.JTextArea otherClientMessagesTextArea;
    private javax.swing.JLabel pinky;
    private javax.swing.JLabel portStartLabel;
    private javax.swing.JPanel portStartPanel;
    public javax.swing.JTextField portTextField;
    private javax.swing.JPanel sendButtonPanel;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JPanel startPanel;
    private javax.swing.JPanel userMessagePanel;
    private javax.swing.JScrollPane userMessageScrollPane;
    private javax.swing.JTextArea userMessageTextArea;
    private javax.swing.JLabel vulnerableGhost1;
    private javax.swing.JLabel vulnerableGhost2;
    // End of variables declaration//GEN-END:variables
}
