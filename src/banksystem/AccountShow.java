package banksystem;

import java.sql.*;
import javax.swing.*;

public class AccountShow extends javax.swing.JFrame {

    
    public AccountShow() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void setA(String s1,String s2,String s3)
    {
        
        jLabelAccountNumber.setText(s1);
        jLabelAccountType.setText(s2);
        jLabelBalance.setText(s3);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JTextField();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelAccountNumber = new javax.swing.JLabel();
        jLabelAccountType = new javax.swing.JLabel();
        jLabelBalance = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 60, 98));

        Welcome.setBackground(new java.awt.Color(0, 60, 98));
        Welcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(250, 250, 250));
        Welcome.setText("Account");
        Welcome.setBorder(null);
        Welcome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WelcomeActionPerformed(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(254, 254, 254));
        jLabelClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 250, 250));
        jLabelMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 800, Short.MAX_VALUE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelClose)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 60, 98));
        jLabel7.setText("ACCOUNT NO:");

        jLabel8.setBackground(new java.awt.Color(236, 240, 241));
        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 60, 98));
        jLabel8.setText("ACCOUNT TYPE:");

        jLabel9.setBackground(new java.awt.Color(236, 240, 241));
        jLabel9.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 60, 98));
        jLabel9.setText("BALANCE:");

        jLabelAccountNumber.setBackground(new java.awt.Color(236, 240, 241));
        jLabelAccountNumber.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelAccountNumber.setForeground(new java.awt.Color(0, 60, 98));

        jLabelAccountType.setBackground(new java.awt.Color(236, 240, 241));
        jLabelAccountType.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelAccountType.setForeground(new java.awt.Color(0, 60, 98));

        jLabelBalance.setBackground(new java.awt.Color(236, 240, 241));
        jLabelBalance.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelBalance.setForeground(new java.awt.Color(0, 60, 98));

        jButton2.setBackground(new java.awt.Color(0, 119, 182));
        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(254, 254, 254));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabelAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(48, 48, 48)
                        .addComponent(jButton2)))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WelcomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WelcomeActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DetailsInfo di=new DetailsInfo();
        di.setVisible(true);
        di.pack();
        di.setLocationRelativeTo(null);
        di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountShow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Welcome;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAccountNumber;
    private javax.swing.JLabel jLabelAccountType;
    private javax.swing.JLabel jLabelBalance;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
