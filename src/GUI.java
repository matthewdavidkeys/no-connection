
public class GUI extends javax.swing.JFrame {

    public String userMessage = "";
    public Client client;

    /**
     * Creates new form GUI
     * @param client The client currently connected
     */
    public GUI(Client client) {
        this.client = client;
        initComponents();
//        onlineClientsScrollPane.setVisible(false);
//        onlineClientsTextArea.setVisible(false);

        sendMessageButton.setOpaque(false);
        sendMessageButton.setContentAreaFilled(false);
        onlineClientsButton.setOpaque(false);
        onlineClientsButton.setContentAreaFilled(false);
        
        // Will be removed later, only for testing
        onlineClientsButtonOld.setOpaque(false);
        onlineClientsButtonOld.setContentAreaFilled(false);
        onlineClientsButtonOld.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        GUILayeredPane = new javax.swing.JLayeredPane();
        mainPanel = new javax.swing.JPanel();
        nicknamePane = new javax.swing.JPanel();
        nicknameLabel = new javax.swing.JLabel();
        onlineClientsButtonPane = new javax.swing.JPanel();
        onlineClientsButton = new javax.swing.JToggleButton();
        userMessagePanel = new javax.swing.JPanel();
        userMessageScrollPane = new javax.swing.JScrollPane();
        userMessageTextArea = new javax.swing.JTextArea();
        sendButtonPanel = new javax.swing.JPanel();
        sendMessageButton = new javax.swing.JButton();
        otherClientMessagesPanel = new javax.swing.JPanel();
        otherClientMessagesScrollPane = new javax.swing.JScrollPane();
        otherClientMessagesTextArea = new javax.swing.JTextArea();
        onlineClientsLabel = new javax.swing.JLabel();
        formattingLabel = new javax.swing.JLabel();
        vulnerableGhost2 = new javax.swing.JLabel();
        vulnerableGhost1 = new javax.swing.JLabel();
        inky = new javax.swing.JLabel();
        pinky = new javax.swing.JLabel();
        blinky = new javax.swing.JLabel();
        clyde = new javax.swing.JLabel();
        cherry = new javax.swing.JLabel();
        onlineClientsButtonOld = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        GUILayeredPane.setBackground(new java.awt.Color(255, 255, 255));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nicknamePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nicknameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
        );
        nicknamePaneLayout.setVerticalGroup(
            nicknamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nicknameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        onlineClientsButtonPane.setBackground(new java.awt.Color(0, 0, 0));
        onlineClientsButtonPane.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        onlineClientsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/onlineClients.jpg"))); // NOI18N
        onlineClientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineClientsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout onlineClientsButtonPaneLayout = new javax.swing.GroupLayout(onlineClientsButtonPane);
        onlineClientsButtonPane.setLayout(onlineClientsButtonPaneLayout);
        onlineClientsButtonPaneLayout.setHorizontalGroup(
            onlineClientsButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onlineClientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        onlineClientsButtonPaneLayout.setVerticalGroup(
            onlineClientsButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(onlineClientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(userMessageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
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

        sendMessageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sendMessage.jpg"))); // NOI18N
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
            .addGroup(sendButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendMessageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        onlineClientsLabel.setBackground(new java.awt.Color(0, 0, 0));
        onlineClientsLabel.setForeground(new java.awt.Color(255, 255, 255));
        onlineClientsLabel.setText(" Online Clients");
        onlineClientsLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 4, true));

        formattingLabel.setBackground(new java.awt.Color(255, 255, 255));

        vulnerableGhost2.setBackground(new java.awt.Color(0, 0, 0));
        vulnerableGhost2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vulnerableGhost.jpg"))); // NOI18N

        vulnerableGhost1.setBackground(new java.awt.Color(0, 0, 0));
        vulnerableGhost1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        vulnerableGhost1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vulnerableGhost.jpg"))); // NOI18N

        inky.setBackground(new java.awt.Color(0, 0, 0));
        inky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inky.jpg"))); // NOI18N

        pinky.setBackground(new java.awt.Color(0, 0, 0));
        pinky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pinky.jpg"))); // NOI18N
        pinky.setText("jLabel1");

        blinky.setBackground(new java.awt.Color(0, 0, 0));
        blinky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/blinky.jpg"))); // NOI18N
        blinky.setText("jLabel1");

        clyde.setBackground(new java.awt.Color(0, 0, 0));
        clyde.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clyde.jpg"))); // NOI18N
        clyde.setText("jLabel1");

        cherry.setBackground(new java.awt.Color(0, 0, 0));
        cherry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cherry.jpg"))); // NOI18N

        onlineClientsButtonOld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/onlineClients.jpg"))); // NOI18N
        onlineClientsButtonOld.setFocusable(false);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(formattingLabel)
                                .addGap(36, 36, 36)
                                .addComponent(vulnerableGhost1))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(nicknamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109)
                                .addComponent(pinky, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cherry)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(inky)
                                .addGap(95, 95, 95))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(clyde, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(124, 124, 124)
                                .addComponent(blinky, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))
                        .addGap(25, 25, 25)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(onlineClientsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(onlineClientsButtonPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                        .addContainerGap())))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(462, 462, 462)
                .addComponent(onlineClientsButtonOld, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(264, 264, 264))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(onlineClientsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pinky)
                                    .addComponent(blinky))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(onlineClientsButtonPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nicknamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(clyde)))
                                .addGap(9, 9, 9)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(formattingLabel)
                                    .addComponent(vulnerableGhost1)
                                    .addComponent(inky, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(cherry)
                        .addGap(18, 18, 18)))
                .addComponent(otherClientMessagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(sendButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(vulnerableGhost2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(onlineClientsButtonOld, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
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
    }// </editor-fold>                        

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        userMessage = userMessageTextArea.getText();
        userMessageTextArea.setText("");
        client.messageToThread(userMessage + "\n");
    }                                                 

    private void userMessageTextAreaKeyTyped(java.awt.event.KeyEvent evt) {                                             
        if (evt.getKeyChar() == '\n') {
            userMessage = userMessageTextArea.getText();
            userMessageTextArea.setText("");
            client.messageToThread(userMessage);
        }
    }                                            

    private void onlineClientsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // Need to finish
    }                                                   

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
//                new GUI(client).setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLayeredPane GUILayeredPane;
    private javax.swing.JLabel blinky;
    private javax.swing.JLabel cherry;
    private javax.swing.JLabel clyde;
    private javax.swing.JLabel formattingLabel;
    private javax.swing.JLabel inky;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JPanel nicknamePane;
    private javax.swing.JToggleButton onlineClientsButton;
    private javax.swing.JButton onlineClientsButtonOld;
    private javax.swing.JPanel onlineClientsButtonPane;
    private javax.swing.JLabel onlineClientsLabel;
    private javax.swing.JPanel otherClientMessagesPanel;
    private javax.swing.JScrollPane otherClientMessagesScrollPane;
    public javax.swing.JTextArea otherClientMessagesTextArea;
    private javax.swing.JLabel pinky;
    private javax.swing.JPanel sendButtonPanel;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JPanel userMessagePanel;
    private javax.swing.JScrollPane userMessageScrollPane;
    private javax.swing.JTextArea userMessageTextArea;
    private javax.swing.JLabel vulnerableGhost1;
    private javax.swing.JLabel vulnerableGhost2;
    // End of variables declaration                   
}
