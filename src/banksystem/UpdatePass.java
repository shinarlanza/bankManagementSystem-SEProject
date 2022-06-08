package banksystem;

import java.sql.*;
import javax.swing.*;

public class UpdatePass extends javax.swing.JFrame {

    public static String u;
    
    public UpdatePass() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=convertToNull", "root", "");
            return con;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
   
        public void executeSqlQuery(String query, String message) {
        Connection con = getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if (st.executeUpdate(query) == 1) {
                JOptionPane.showMessageDialog(null, "PASSWORD " + message + " SUCCESSFULLY");
            } else {
                JOptionPane.showMessageDialog(null, "PASSWORD NOT " + message);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
        public void Update() {
        String p = jPasswordFieldPass.getText();
        String s2 = jPasswordFieldPass1.getText();
        String u = jTextFieldUsername.getText();
        if (p.equals(s2)) 
        {
            String query1 = "Update user Set password='" + p + "' where username= '" + u + "'";
            executeSqlQuery(query1, "UPDATED");
            LoginPage lp = new LoginPage();
            lp.setVisible(true);
            lp.pack();
            lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } 
        else 
        {
            JOptionPane.showMessageDialog(null, "Please type correct password");
            UpdatePass up = new UpdatePass();
            up.setVisible(true);
            up.pack();
            up.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        forgotPaawordText = new javax.swing.JTextField();
        jLabelClose2 = new javax.swing.JLabel();
        jLabelMin2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jPasswordFieldPass1 = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 60, 98));

        forgotPaawordText.setBackground(new java.awt.Color(0, 60, 98));
        forgotPaawordText.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        forgotPaawordText.setForeground(new java.awt.Color(250, 250, 250));
        forgotPaawordText.setText("Forgot Password");
        forgotPaawordText.setBorder(null);
        forgotPaawordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPaawordTextActionPerformed(evt);
            }
        });

        jLabelClose2.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelClose2.setForeground(new java.awt.Color(254, 254, 254));
        jLabelClose2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose2.setText("X");
        jLabelClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose2MouseClicked(evt);
            }
        });

        jLabelMin2.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelMin2.setForeground(new java.awt.Color(255, 250, 250));
        jLabelMin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin2.setText("-");
        jLabelMin2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(forgotPaawordText, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelClose2)
                .addGap(25, 25, 25))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forgotPaawordText, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelClose2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 60, 98));
        jLabel6.setText("USERNAME:");

        jLabel3.setBackground(new java.awt.Color(236, 240, 241));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 60, 98));
        jLabel3.setText("PASSWORD:");

        jLabel4.setBackground(new java.awt.Color(236, 240, 241));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 60, 98));
        jLabel4.setText("RE-TYPE PASSWORD:");

        jTextFieldUsername.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldUsername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(0, 60, 98));

        jPasswordFieldPass.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordFieldPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordFieldPass.setForeground(new java.awt.Color(0, 60, 98));
        jPasswordFieldPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldPassActionPerformed(evt);
            }
        });

        jPasswordFieldPass1.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordFieldPass1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jPasswordFieldPass1.setForeground(new java.awt.Color(0, 60, 98));

        jButtonLogin.setBackground(new java.awt.Color(0, 119, 182));
        jButtonLogin.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(254, 254, 254));
        jButtonLogin.setText("SUBMIT");
        jButtonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonLoginMouseClicked(evt);
            }
        });
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonCancel.setBackground(new java.awt.Color(242, 38, 19));
        jButtonCancel.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(253, 251, 251));
        jButtonCancel.setText("CANCEL");
        jButtonCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelMouseClicked(evt);
            }
        });
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jButtonLogin))
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldPass1)
                    .addComponent(jTextFieldUsername))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jPasswordFieldPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonLogin)
                            .addComponent(jButtonCancel))))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgotPaawordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPaawordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forgotPaawordTextActionPerformed

    private void jLabelClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose2MouseClicked

    private void jLabelMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin2MouseClicked

    private void jPasswordFieldPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldPassActionPerformed

    private void jButtonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonLoginMouseClicked

    }//GEN-LAST:event_jButtonLoginMouseClicked

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        Update();

    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked

    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        LoginPage lp = new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField forgotPaawordText;
    private javax.swing.JButton jButtonCancel;
    public javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelClose2;
    private javax.swing.JLabel jLabelMin2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JPasswordField jPasswordFieldPass1;
    public javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
