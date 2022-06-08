package banksystem;

import java.sql.*;
import javax.swing.*;

public class CustomerDetails extends javax.swing.JFrame {

       public CustomerDetails() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
      
        public void perform(String fn,String ln,String ad,String em,String ph,String ge,String un,String dob)
    {
        jLabelFName.setText(fn);
        jLabelLName.setText(ln);
        jLabelAddress.setText(ad);
        jLabelEmail.setText(em);
        jLabelPhone.setText(ph);
        jLabelGender.setText(ge);
        jLabelUserName.setText(un);
        jLabelDOB.setText(dob);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome = new javax.swing.JTextField();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelFName = new javax.swing.JLabel();
        jLabelLName = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPhone = new javax.swing.JLabel();
        jLabelDOB = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 60, 98));

        Welcome.setBackground(new java.awt.Color(0, 60, 98));
        Welcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(250, 250, 250));
        Welcome.setText("Personal Details");
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
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background2.setMaximumSize(new java.awt.Dimension(400, 400));
        background2.setMinimumSize(new java.awt.Dimension(400, 400));
        background2.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel6.setBackground(new java.awt.Color(236, 240, 241));
        jLabel6.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 60, 98));
        jLabel6.setText("NAME:");

        jLabel11.setBackground(new java.awt.Color(236, 240, 241));
        jLabel11.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 60, 98));
        jLabel11.setText("USERNAME:");

        jLabel14.setBackground(new java.awt.Color(236, 240, 241));
        jLabel14.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 60, 98));
        jLabel14.setText("ADDRESS:");

        jLabel15.setBackground(new java.awt.Color(236, 240, 241));
        jLabel15.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 60, 98));
        jLabel15.setText("EMAIL:");

        jLabel16.setBackground(new java.awt.Color(236, 240, 241));
        jLabel16.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 60, 98));
        jLabel16.setText("PHONE NO:");

        jLabel17.setBackground(new java.awt.Color(236, 240, 241));
        jLabel17.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 60, 98));
        jLabel17.setText("DATE OF BIRTH:");

        jLabel18.setBackground(new java.awt.Color(236, 240, 241));
        jLabel18.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 60, 98));
        jLabel18.setText("GENDER:");

        jLabelUserName.setBackground(new java.awt.Color(236, 240, 241));
        jLabelUserName.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelUserName.setForeground(new java.awt.Color(0, 60, 98));

        jLabelFName.setBackground(new java.awt.Color(236, 240, 241));
        jLabelFName.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelFName.setForeground(new java.awt.Color(0, 60, 98));

        jLabelLName.setBackground(new java.awt.Color(236, 240, 241));
        jLabelLName.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelLName.setForeground(new java.awt.Color(0, 60, 98));

        jLabelAddress.setBackground(new java.awt.Color(236, 240, 241));
        jLabelAddress.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelAddress.setForeground(new java.awt.Color(0, 60, 98));

        jLabelEmail.setBackground(new java.awt.Color(236, 240, 241));
        jLabelEmail.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelEmail.setForeground(new java.awt.Color(0, 60, 98));

        jLabelPhone.setBackground(new java.awt.Color(236, 240, 241));
        jLabelPhone.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelPhone.setForeground(new java.awt.Color(0, 60, 98));

        jLabelDOB.setBackground(new java.awt.Color(236, 240, 241));
        jLabelDOB.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelDOB.setForeground(new java.awt.Color(0, 60, 98));

        jLabelGender.setBackground(new java.awt.Color(236, 240, 241));
        jLabelGender.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelGender.setForeground(new java.awt.Color(0, 60, 98));

        jButton1.setBackground(new java.awt.Color(0, 119, 182));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelFName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabelLName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabelPhone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(jLabel18)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(372, 372, 372)
                        .addComponent(jButton1))
                    .addComponent(jLabel11))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jLabel6)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel14)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel15)
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelFName, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                                            .addComponent(jLabelLName, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabelGender, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)))
                .addContainerGap(82, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DetailsInfo di=new DetailsInfo();
        di.setVisible(true);
        di.pack();
        di.setLocationRelativeTo(null);
        di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Welcome;
    private javax.swing.JLabel background2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelDOB;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelLName;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JLabel jLabelPhone;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
