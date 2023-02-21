
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicScrollBarUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author neilb
 */
public class GUI extends javax.swing.JFrame {

    public String userMessage = "";
    public Client client;

    /**
     * Creates new form GUI
     */
    public GUI(Client client) {
        this.client = client;
        initComponents();
//        onlineClientsScrollPane.setVisible(false);
//        onlineClientsTextArea.setVisible(false);
//        ImageIcon sendMessage = new ImageIcon(getC);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GUILayeredPane = new javax.swing.JLayeredPane();
        mainPanel = new javax.swing.JPanel();
        nicknamePane = new javax.swing.JPanel();
        nicknameLabel = new javax.swing.JLabel();
        onlineClientsButtonPane = new javax.swing.JPanel();
        onlineClientsButton = new javax.swing.JButton();
        userMessagePanel = new javax.swing.JPanel();
        userMessageScrollPane = new javax.swing.JScrollPane();
        userMessageTextArea = new javax.swing.JTextArea();
        sendButtonPanel = new javax.swing.JPanel();
        sendMessageButton = new javax.swing.JButton();
        otherClientMessagesPanel = new javax.swing.JPanel();
        otherClientMessagesScrollPane = new javax.swing.JScrollPane();
        otherClientMessagesTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nicknameLabel.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        nicknameLabel.setText("Nickname");

        javax.swing.GroupLayout nicknamePaneLayout = new javax.swing.GroupLayout(nicknamePane);
        nicknamePane.setLayout(nicknamePaneLayout);
        nicknamePaneLayout.setHorizontalGroup(
            nicknamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nicknamePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nicknameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        nicknamePaneLayout.setVerticalGroup(
            nicknamePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nicknamePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nicknameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        onlineClientsButton.setText("-");
        onlineClientsButton.setFocusable(false);
        onlineClientsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlineClientsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout onlineClientsButtonPaneLayout = new javax.swing.GroupLayout(onlineClientsButtonPane);
        onlineClientsButtonPane.setLayout(onlineClientsButtonPaneLayout);
        onlineClientsButtonPaneLayout.setHorizontalGroup(
            onlineClientsButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlineClientsButtonPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(onlineClientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );
        onlineClientsButtonPaneLayout.setVerticalGroup(
            onlineClientsButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(onlineClientsButtonPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(onlineClientsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        userMessageScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        userMessageTextArea.setColumns(20);
        userMessageTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        userMessageTextArea.setLineWrap(true);
        userMessageTextArea.setRows(5);
        userMessageTextArea.setWrapStyleWord(true);
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
                .addComponent(userMessageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                .addContainerGap())
        );
        userMessagePanelLayout.setVerticalGroup(
            userMessagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userMessagePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userMessageScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addContainerGap())
        );

        sendMessageButton.setText("->");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendMessageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        sendButtonPanelLayout.setVerticalGroup(
            sendButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sendMessageButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        otherClientMessagesScrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        otherClientMessagesTextArea.setEditable(false);
        otherClientMessagesTextArea.setColumns(20);
        otherClientMessagesTextArea.setFont(new java.awt.Font("Yu Gothic UI", 0, 17)); // NOI18N
        otherClientMessagesTextArea.setLineWrap(true);
        otherClientMessagesTextArea.setRows(5);
        otherClientMessagesTextArea.setWrapStyleWord(true);
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
                .addComponent(otherClientMessagesScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
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
                        .addComponent(nicknamePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(onlineClientsButtonPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(userMessagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nicknamePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(onlineClientsButtonPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(otherClientMessagesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(userMessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(sendButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void onlineClientsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlineClientsButtonActionPerformed
        // TODO add your handling code here:
//        onlineClientsScrollPane.setVisible(true);
//        onlineClientsTextArea.setVisible(true);
//onlineClientsPane.setBackground(new Color(0,0,0,0));
        this.revalidate();
        this.repaint();
    }

        //        new Timer(1, new ActionListener() {
        //            @Override
        //            public void actionPerformed(ActionEvent ae) {
        //                otherClientsPanel.setLocation(otherClientsPanel.getX() - 1, 0);
        //                if (otherClientsPanel.getX() + otherClientsPanel.getWidth() == 0) {
        //                    ((Timer) ae.getSource()).stop();
        //                    System.out.println("Timer stopped");
        //                }
        //            }
        //        }).start();
//    new Timer(1, new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent ae) {
//            otherClientsScrollPane.setLocation(otherClientsScrollPane.getX() - 3, 0);
//            if (otherClientsScrollPane.getX() <= 3) {
//                ((Timer) ae.getSouclientButtonActionPerformed

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        // TODO add your handling code here:
        userMessage = userMessageTextArea.getText();
        userMessageTextArea.setText("");
        client.messageToThread(userMessage + "\n");

    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void userMessageTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userMessageTextAreaKeyTyped
        // TODO add your handling code here:
        if (evt.getKeyChar() == '\n') {
            userMessage = userMessageTextArea.getText();
            userMessageTextArea.setText("");
            client.messageToThread(userMessage);
        }
    }//GEN-LAST:event_userMessageTextAreaKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane GUILayeredPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JPanel nicknamePane;
    private javax.swing.JButton onlineClientsButton;
    private javax.swing.JPanel onlineClientsButtonPane;
    private javax.swing.JPanel otherClientMessagesPanel;
    private javax.swing.JScrollPane otherClientMessagesScrollPane;
    public javax.swing.JTextArea otherClientMessagesTextArea;
    private javax.swing.JPanel sendButtonPanel;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JPanel userMessagePanel;
    private javax.swing.JScrollPane userMessageScrollPane;
    private javax.swing.JTextArea userMessageTextArea;
    // End of variables declaration//GEN-END:variables
}
