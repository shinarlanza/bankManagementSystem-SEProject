package banksystem;

import java.sql.*;
import javax.swing.*;
import java.awt.*;

public class Welcome extends javax.swing.JFrame {

        public Welcome() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JTextField();
        closeWelcome = new javax.swing.JLabel();
        minimizeWelcome = new javax.swing.JLabel();
        WelcomeBG = new javax.swing.JLabel();
        bankOfWVSU = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jButtonSignup = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 600));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel1.setBackground(new java.awt.Color(0, 60, 98));

        Welcome.setBackground(new java.awt.Color(0, 60, 98));
        Welcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(250, 250, 250));
        Welcome.setText("Welcome");
        Welcome.setBorder(null);
        Welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WelcomeActionPerformed(evt);
            }
        });

        closeWelcome.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        closeWelcome.setForeground(new java.awt.Color(254, 254, 254));
        closeWelcome.setText("X");
        closeWelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeWelcomeMouseClicked(evt);
            }
        });

        minimizeWelcome.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        minimizeWelcome.setForeground(new java.awt.Color(255, 250, 250));
        minimizeWelcome.setText("-");
        minimizeWelcome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeWelcome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeWelcomeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeWelcome)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(closeWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(minimizeWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        WelcomeBG.setBackground(new java.awt.Color(236, 240, 241));
        WelcomeBG.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        WelcomeBG.setForeground(new java.awt.Color(0, 60, 98));
        WelcomeBG.setText("WELCOME");

        bankOfWVSU.setBackground(new java.awt.Color(236, 240, 241));
        bankOfWVSU.setFont(new java.awt.Font("Arial", 1, 46)); // NOI18N
        bankOfWVSU.setForeground(new java.awt.Color(0, 60, 98));
        bankOfWVSU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bankOfWVSU.setText("BANK OF WVSU-CICT");
        bankOfWVSU.setToolTipText("");
        bankOfWVSU.setPreferredSize(new java.awt.Dimension(252, 32));

        login.setBackground(new java.awt.Color(0, 119, 182));
        login.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(0, 119, 182));
        login.setText("LOG  IN");
        login.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 119, 182)));
        login.setContentAreaFilled(false);
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        jButtonSignup.setBackground(new java.awt.Color(0, 119, 182));
        jButtonSignup.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButtonSignup.setForeground(new java.awt.Color(253, 251, 251));
        jButtonSignup.setText("SIGN UP");
        jButtonSignup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSignupMouseClicked(evt);
            }
        });
        jButtonSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bankOfWVSU, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(WelcomeBG))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(WelcomeBG, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bankOfWVSU, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(82, 82, 82))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WelcomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WelcomeActionPerformed

    private void closeWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeWelcomeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeWelcomeMouseClicked

    private void minimizeWelcomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeWelcomeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeWelcomeMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

    private void jButtonSignupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSignupMouseClicked

    }//GEN-LAST:event_jButtonSignupMouseClicked

    private void jButtonSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupActionPerformed
        Registration rf=new Registration();
        rf.setVisible(true);
        rf.pack();
        rf.setLocationRelativeTo(null);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonSignupActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden
    
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
                Welcome wp = new Welcome();
                wp.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Welcome;
    private javax.swing.JLabel WelcomeBG;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bankOfWVSU;
    private javax.swing.JLabel closeWelcome;
    private javax.swing.JButton jButtonSignup;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel minimizeWelcome;
    // End of variables declaration//GEN-END:variables
}
