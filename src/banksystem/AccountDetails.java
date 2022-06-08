package banksystem;

import java.sql.*;
import javax.swing.*;

public class AccountDetails extends javax.swing.JFrame {

        public AccountDetails() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jTextFieldAccType = new javax.swing.JTextField();
        jTextFieldBal1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1Cancel = new javax.swing.JButton();
        jButton2Submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 60, 98));

        Welcome.setBackground(new java.awt.Color(0, 60, 98));
        Welcome.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Welcome.setForeground(new java.awt.Color(250, 250, 250));
        Welcome.setText("Account Details");
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
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel7.setBackground(new java.awt.Color(236, 240, 241));
        jLabel7.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 60, 98));
        jLabel7.setText("ACCOUNT TYPE:");

        jTextFieldAccType.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldAccType.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldAccType.setForeground(new java.awt.Color(0, 60, 98));

        jTextFieldBal1.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldBal1.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldBal1.setForeground(new java.awt.Color(0, 60, 98));

        jLabel8.setBackground(new java.awt.Color(236, 240, 241));
        jLabel8.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 60, 98));
        jLabel8.setText("BALANCE:");

        jButton1Cancel.setBackground(new java.awt.Color(242, 38, 19));
        jButton1Cancel.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButton1Cancel.setForeground(new java.awt.Color(253, 251, 251));
        jButton1Cancel.setText("CANCEL");
        jButton1Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1CancelMouseClicked(evt);
            }
        });
        jButton1Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CancelActionPerformed(evt);
            }
        });

        jButton2Submit.setBackground(new java.awt.Color(0, 60, 98));
        jButton2Submit.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButton2Submit.setForeground(new java.awt.Color(253, 251, 251));
        jButton2Submit.setText("SUBMIT");
        jButton2Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2SubmitMouseClicked(evt);
            }
        });
        jButton2Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2SubmitActionPerformed(evt);
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
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jTextFieldAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldBal1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jButton2Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAccType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldBal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2Submit)
                            .addComponent(jButton1Cancel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Connection getConnection()
    {
        Connection con;
        try
        {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=convertToNull", "root", "");
            return con;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            return null;
        }
    }
    
       public void executeSqlQuery(String query,String message)
    {
        Connection con=getConnection();
        Statement st;
        try
        {
            st=con.createStatement();
            if(st.executeUpdate(query)==1)
            {
                JOptionPane.showMessageDialog(null,message +" ENTERED SUCCESSFULLY");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"PROBLEM !!! CHECK YOUR "+message );
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void nextPage()
    {
        LoginPage lp= new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.dispose();
    }
   
    public void insertInAccount()
    {
        int Balance=Integer.parseInt(jTextFieldBal1.getText());
        if(Balance< 10000)
            JOptionPane.showMessageDialog(this,"To create an account there should be a minimum balance of 3000 pesos.");
        else
        {
        String query ="insert into account (Account_type, Balance) values ('"+jTextFieldAccType.getText()+"','"+Balance+"')";
        executeSqlQuery(query,"ACCOUNT DETAILS");}
    }
    
    private void WelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WelcomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WelcomeActionPerformed

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButton1CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1CancelMouseClicked

    }//GEN-LAST:event_jButton1CancelMouseClicked

    private void jButton1CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CancelActionPerformed

        AccountDetails ad=new AccountDetails();
        ad.setVisible(true);
        ad.pack();
        ad.setLocationRelativeTo(null);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1CancelActionPerformed

    private void jButton2SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2SubmitMouseClicked

    }//GEN-LAST:event_jButton2SubmitMouseClicked

    private void jButton2SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2SubmitActionPerformed

        insertInAccount();
        nextPage();
    }//GEN-LAST:event_jButton2SubmitActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccountDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Welcome;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1Cancel;
    private javax.swing.JButton jButton2Submit;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAccType;
    private javax.swing.JTextField jTextFieldBal1;
    // End of variables declaration//GEN-END:variables
}
