package banksystem;

import java.sql.*;
import javax.swing.*;
public class MoneyTransfer1 extends javax.swing.JFrame {

    public static String u;
    public MoneyTransfer1() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void set(String s1)
    {
       jLabelAccount1.setText(s1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        Welcome2 = new javax.swing.JTextField();
        jLabelClose2 = new javax.swing.JLabel();
        jLabelMin2 = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        jLabelAccountNo = new javax.swing.JLabel();
        jLabelAmount = new javax.swing.JLabel();
        jLabelAccount1 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField();
        jButtonProceed = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jTextFieldBeneficiaryAccountNo = new javax.swing.JTextField();
        jLabelBeneficiaryAccountNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 60, 98));

        Welcome2.setBackground(new java.awt.Color(0, 60, 98));
        Welcome2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Welcome2.setForeground(new java.awt.Color(250, 250, 250));
        Welcome2.setText("Money Transfer");
        Welcome2.setBorder(null);
        Welcome2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome2ActionPerformed(evt);
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
                .addComponent(Welcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(Welcome2, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelClose2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background2.setMaximumSize(new java.awt.Dimension(400, 400));
        background2.setMinimumSize(new java.awt.Dimension(400, 400));
        background2.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabelAccountNo.setBackground(new java.awt.Color(236, 240, 241));
        jLabelAccountNo.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelAccountNo.setForeground(new java.awt.Color(0, 60, 98));
        jLabelAccountNo.setText("ACCOUNT NUMBER:");

        jLabelAmount.setBackground(new java.awt.Color(236, 240, 241));
        jLabelAmount.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelAmount.setForeground(new java.awt.Color(0, 60, 98));
        jLabelAmount.setText("AMOUNT:");

        jLabelAccount1.setFont(new java.awt.Font("Ubuntu Medium", 1, 18)); // NOI18N
        jLabelAccount1.setForeground(new java.awt.Color(0, 60, 98));
        jLabelAccount1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabelAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAccount1MouseClicked(evt);
            }
        });

        jTextFieldAmount.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldAmount.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldAmount.setForeground(new java.awt.Color(0, 60, 98));
        jTextFieldAmount.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTextFieldAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAmountActionPerformed(evt);
            }
        });

        jButtonProceed.setBackground(new java.awt.Color(0, 119, 182));
        jButtonProceed.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jButtonProceed.setForeground(new java.awt.Color(254, 254, 254));
        jButtonProceed.setText("PROCEED");
        jButtonProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProceedActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(242, 38, 19));
        jButton1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(254, 254, 254));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextFieldBeneficiaryAccountNo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldBeneficiaryAccountNo.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldBeneficiaryAccountNo.setForeground(new java.awt.Color(0, 60, 98));

        jLabelBeneficiaryAccountNo.setBackground(new java.awt.Color(236, 240, 241));
        jLabelBeneficiaryAccountNo.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        jLabelBeneficiaryAccountNo.setForeground(new java.awt.Color(0, 60, 98));
        jLabelBeneficiaryAccountNo.setText("BENEFICIARY ACC NUMBER:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelAccountNo)
                    .addComponent(jLabelBeneficiaryAccountNo)
                    .addComponent(jLabelAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(41, 41, 41)
                        .addComponent(jButtonProceed))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldAmount, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldBeneficiaryAccountNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                        .addComponent(jLabelAccount1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelAccountNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelAccount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBeneficiaryAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBeneficiaryAccountNo))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAmount)
                            .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonProceed)
                            .addComponent(jButton1))))
                .addGap(0, 82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Welcome2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Welcome2ActionPerformed

    private void jLabelClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose2MouseClicked

    private void jLabelMin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin2MouseClicked

    private void jTextFieldAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAmountActionPerformed

    private void jButtonProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProceedActionPerformed
        int Account_no=0,BenificiaryAccount_No=0,Amount=0;

        try
        {
            int flag=0;
            try
            {
                Account_no=Integer.parseInt(jLabelAccount1.getText());
                //BenificiaryAccount_No=Integer.parseInt(jTextFieldBeneficiaryAccountNo.getText());
                Amount=Integer.parseInt(jTextFieldAmount.getText());
                //  System.out.println("text is accepted and converted");
                BenificiaryAccount_No=Integer.parseInt(jTextFieldBeneficiaryAccountNo.getText());
                // System.out.println("Account_no"+Account_no+"BenificiaryAccountNo"+BenificiaryAccount_No+"Amount"+Amount);
            }catch(NumberFormatException ex)
            {

            }

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=convertToNull","root","");
            con.setAutoCommit(false);

            Statement stmt;
            stmt=con.createStatement();
            String sql="select * from account";
            ResultSet rs,rs1,rs2;
            rs=stmt.executeQuery(sql);
            while(rs.next())
            {
                int Account;

                if(Account_no==rs.getInt("Account_no") )
                {
                    flag=1;
                }

            }rs.close();

            if(flag==1)
            {
              String sql1="insert into transactions (Account_no, BenificiaryAccount_no, Amount) values ('"+Account_no+"','"+BenificiaryAccount_No+"','"+Amount+"')";
              PreparedStatement pst ;
              pst= con.prepareStatement(sql1);
              int r=pst.executeUpdate(sql1);
                              
              String sql2="select Balance from account where Account_no='"+Account_no+"'";
              rs1=stmt.executeQuery(sql2);
              rs1.next();
              int num1=rs1.getInt("Balance");
              
               String sql3="select Balance from account where Account_no='"+BenificiaryAccount_No+"'";
               rs2=stmt.executeQuery(sql3);
               rs2.next();
               int num2=rs2.getInt("Balance");
                 
                   
               int numD=num2+Amount;
               int numW=num1-Amount;
               
               System.out.println(" Numw "+numW+" NumD "+numD);
                
               
               String WA="update Account set Balance="+numW+" where Account_no="+Account_no+"";

                 // PreparedStatement pst1;
               pst=con.prepareStatement(WA);
               pst.executeUpdate(WA);
              // pst1.close();
               
             //  PreparedStatement pst2 ;          
             
                String DA="update Account set Balance="+numD+" where Account_no="+BenificiaryAccount_No+"";
                
                pst=con.prepareStatement(DA);

                pst.executeUpdate(DA);
              
                pst.close();
                               
                JOptionPane.showMessageDialog(null, "Transactions completed successfully");
                JOptionPane.showMessageDialog(null, "Your balance is "+numW);

                DetailsInfo df = new DetailsInfo ();
                df.setVisible(true);
                df.pack();
                df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();

            }
            con.commit();
            con.close();
        }
        catch(Exception e)
        {
            // con.rollback();

            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonProceedActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DetailsInfo di=new DetailsInfo();
        try
        {
            Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=convertToNull","root","");
            String s1="";
            String y=("Select FName from customer where username ='"+u+"' ");
            Statement smt=mycon.createStatement();
            PreparedStatement ps=mycon.prepareStatement(y);
            ResultSet r=ps.executeQuery();
            if(r.next())
            {
                s1=r.getString("FName");
            }
            di.set(s1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        di.setVisible(true);
        di.pack();
        di.setLocationRelativeTo(null);
        di.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabelAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAccount1MouseClicked
        Registration rf=new Registration();
        rf.setVisible(true);
        rf.pack();
        rf.setLocationRelativeTo(null);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelAccount1MouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoneyTransfer1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Welcome2;
    private javax.swing.JLabel background2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonProceed;
    private javax.swing.JLabel jLabelAccount1;
    private javax.swing.JLabel jLabelAccountNo;
    private javax.swing.JLabel jLabelAmount;
    private javax.swing.JLabel jLabelBeneficiaryAccountNo;
    private javax.swing.JLabel jLabelClose2;
    private javax.swing.JLabel jLabelMin2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldAmount;
    private javax.swing.JTextField jTextFieldBeneficiaryAccountNo;
    // End of variables declaration//GEN-END:variables
}
