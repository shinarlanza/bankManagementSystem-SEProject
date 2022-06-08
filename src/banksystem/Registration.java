package banksystem;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Registration extends javax.swing.JFrame {

    public Registration() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public Connection getConnection()
    {
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=convertToNull", "root", "");
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
                JOptionPane.showMessageDialog(null, "PROBLEM!!! CHECK YOUR "+ message );
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void insertInCustomer()
    {      
        String query="INSERT INTO `customer` (`FName`, `LName`, `Address`, `Email`, `Phone_no`, `DOB`, `Gender`, `username`) VALUES ('"+FName.getText()+"','"+LName.getText()+"','"+AreaAddress.getText()+"','"+jTextFieldEmail.getText()+"','"+jTextFieldPhone.getText()+"','"+jTextFieldDob.getText()+"','"+jTextFieldGender.getText()+"','"+jTextFieldUser.getText()+"')";
        executeSqlQuery(query,"PERSONAL DETAILS");
        AccountDetails ac= new AccountDetails();        
        ac.setVisible(true);
        ac.pack();
        ac.setLocationRelativeTo(null);
        ac.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    } 
    
    public void insertInUser()
    {
        String query1 = "insert into user(username, password) values ('"+jTextFieldUser.getText()+"', '"+jPasswordFieldPass1.getText()+"')";
        executeSqlQuery(query1,"USER DETAILS");
    }
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Welcome1 = new javax.swing.JTextField();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        FirstName = new javax.swing.JLabel();
        LastName = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        emailAdd = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        LName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaAddress = new javax.swing.JTextArea();
        jTextFieldEmail = new javax.swing.JTextField();
        phoneNo = new javax.swing.JLabel();
        dateOB = new javax.swing.JLabel();
        Gender = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        confirmPass = new javax.swing.JLabel();
        jTextFieldPhone = new javax.swing.JTextField();
        jTextFieldDob = new javax.swing.JTextField();
        jTextFieldGender = new javax.swing.JTextField();
        jTextFieldUser = new javax.swing.JTextField();
        jPasswordFieldPass1 = new javax.swing.JPasswordField();
        jPasswordFieldPass2 = new javax.swing.JPasswordField();
        jButtonSubmit = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelALogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 60, 98));

        Welcome1.setBackground(new java.awt.Color(0, 60, 98));
        Welcome1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Welcome1.setForeground(new java.awt.Color(250, 250, 250));
        Welcome1.setText("Registration");
        Welcome1.setBorder(null);
        Welcome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Welcome1ActionPerformed(evt);
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

        jLabelClose.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(254, 254, 254));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Welcome1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(Welcome1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addContainerGap())
        );

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(400, 400));

        FirstName.setBackground(new java.awt.Color(236, 240, 241));
        FirstName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        FirstName.setForeground(new java.awt.Color(0, 60, 98));
        FirstName.setText("FIRST NAME:");

        LastName.setBackground(new java.awt.Color(236, 240, 241));
        LastName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LastName.setForeground(new java.awt.Color(0, 60, 98));
        LastName.setText("LAST NAME:");

        Address.setBackground(new java.awt.Color(236, 240, 241));
        Address.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Address.setForeground(new java.awt.Color(0, 60, 98));
        Address.setText("ADDRESS:");

        emailAdd.setBackground(new java.awt.Color(236, 240, 241));
        emailAdd.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        emailAdd.setForeground(new java.awt.Color(0, 60, 98));
        emailAdd.setText("EMAIL ADD:");

        FName.setBackground(new java.awt.Color(240, 240, 240));
        FName.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        FName.setForeground(new java.awt.Color(0, 60, 98));

        LName.setBackground(new java.awt.Color(240, 240, 240));
        LName.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        LName.setForeground(new java.awt.Color(0, 60, 98));

        AreaAddress.setBackground(new java.awt.Color(240, 240, 240));
        AreaAddress.setColumns(20);
        AreaAddress.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        AreaAddress.setForeground(new java.awt.Color(0, 60, 98));
        AreaAddress.setRows(5);
        jScrollPane1.setViewportView(AreaAddress);

        jTextFieldEmail.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldEmail.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(0, 60, 98));

        phoneNo.setBackground(new java.awt.Color(236, 240, 241));
        phoneNo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        phoneNo.setForeground(new java.awt.Color(0, 60, 98));
        phoneNo.setText("PHONE NO.:");

        dateOB.setBackground(new java.awt.Color(236, 240, 241));
        dateOB.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dateOB.setForeground(new java.awt.Color(0, 60, 98));
        dateOB.setText("DATE OF BIRTH:");

        Gender.setBackground(new java.awt.Color(236, 240, 241));
        Gender.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Gender.setForeground(new java.awt.Color(0, 60, 98));
        Gender.setText("GENDER:");

        Username.setBackground(new java.awt.Color(236, 240, 241));
        Username.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Username.setForeground(new java.awt.Color(0, 60, 98));
        Username.setText("USERNAME:");

        Password.setBackground(new java.awt.Color(236, 240, 241));
        Password.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(0, 60, 98));
        Password.setText("PASSWORD:");

        confirmPass.setBackground(new java.awt.Color(236, 240, 241));
        confirmPass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        confirmPass.setForeground(new java.awt.Color(0, 60, 98));
        confirmPass.setText("CONFIRM PASSWORD:");

        jTextFieldPhone.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldPhone.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldPhone.setForeground(new java.awt.Color(0, 60, 98));

        jTextFieldDob.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldDob.setFont(new java.awt.Font("Ubuntu Medium", 0, 14)); // NOI18N
        jTextFieldDob.setForeground(new java.awt.Color(0, 60, 98));
        jTextFieldDob.setText("YYYY-MM-DD");

        jTextFieldGender.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldGender.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldGender.setForeground(new java.awt.Color(0, 60, 98));

        jTextFieldUser.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldUser.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldUser.setForeground(new java.awt.Color(0, 60, 98));

        jPasswordFieldPass1.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordFieldPass1.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jPasswordFieldPass1.setForeground(new java.awt.Color(0, 60, 98));

        jPasswordFieldPass2.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordFieldPass2.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jPasswordFieldPass2.setForeground(new java.awt.Color(0, 60, 98));

        jButtonSubmit.setBackground(new java.awt.Color(0, 119, 182));
        jButtonSubmit.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jButtonSubmit.setForeground(new java.awt.Color(254, 254, 254));
        jButtonSubmit.setText("PROCEED");
        jButtonSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSubmitMouseClicked(evt);
            }
        });
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
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

        jLabelALogin.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jLabelALogin.setForeground(new java.awt.Color(103, 140, 207));
        jLabelALogin.setText("Click here to login");
        jLabelALogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelALoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Address)
                            .addComponent(emailAdd)
                            .addComponent(LastName)
                            .addComponent(FirstName))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                            .addComponent(jTextFieldEmail)
                            .addComponent(LName)
                            .addComponent(FName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPass)
                            .addComponent(Password)
                            .addComponent(Username)
                            .addComponent(Gender)
                            .addComponent(dateOB)
                            .addComponent(phoneNo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSubmit))
                            .addComponent(jPasswordFieldPass2)
                            .addComponent(jTextFieldPhone)
                            .addComponent(jTextFieldDob)
                            .addComponent(jTextFieldGender)
                            .addComponent(jTextFieldUser)
                            .addComponent(jPasswordFieldPass1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelALogin)
                .addGap(163, 163, 163))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(FirstName)
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LastName)
                                .addGap(28, 28, 28)
                                .addComponent(Address)
                                .addGap(21, 21, 21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAdd)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNo)
                            .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateOB)
                            .addComponent(jTextFieldDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gender)
                            .addComponent(jTextFieldGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Username)
                            .addComponent(jTextFieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Password)
                            .addComponent(jPasswordFieldPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmPass)
                            .addComponent(jPasswordFieldPass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSubmit)
                    .addComponent(jButtonCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelALogin)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Welcome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Welcome1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Welcome1ActionPerformed

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jButtonSubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSubmitMouseClicked

    }//GEN-LAST:event_jButtonSubmitMouseClicked

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        //String x=jTextFieldAadhar.getText();
        String s111=jTextFieldPhone.getText();
        int l1=s111.length();
        //String A=jTextFieldAadhar.getText();
        //int l1=A.length();
        String Fname=FName.getText();
        String Lname=LName.getText();
        Pattern p=Pattern.compile("[@]",Pattern.CASE_INSENSITIVE);
        Matcher m=p.matcher(jTextFieldEmail.getText());
        Boolean b=m.find();
        String DOB1=jTextFieldDob.getText();
        String DOB2="2018";
        String DOB3="2017-11";
        String DOB4="2017-12";
        String DOB5="2017/11";
        String DOB6="2017/12";
        String s1=jPasswordFieldPass1.getText();
        int p1=s1.length();
        String s2=jPasswordFieldPass2.getText();
        if(l1!=11 || Fname.matches(".*\\d.*") || Lname.matches(".*\\d.*") || !b || DOB1.contains(DOB2) || DOB1.contains(DOB3) || DOB1.contains(DOB4) || DOB1.contains(DOB5) || DOB1.contains(DOB6) || !s1.equals(s2) || p1!=8)
        {
            if(l1!=11)
                JOptionPane.showMessageDialog(this,"PLEASE ENTER PHONE NUMBER OF 11 DIGIT");
            if(Fname.matches(".*\\d.*"))
                JOptionPane.showMessageDialog(this,"PLEASE ENTER FIRST NAME CORRECT");
            if(Lname.matches(".*\\d.*"))
                JOptionPane.showMessageDialog(this,"PLEASE ENTER LAST NAME CORRECT");
            if(!b)
                JOptionPane.showMessageDialog(this,"YOUR EMAIL ID SHOULD CONTAIN @ SYMBOL");
            if(DOB1.contains(DOB2) || DOB1.contains(DOB3)|| DOB1.contains(DOB4)|| DOB1.contains(DOB5) || DOB1.contains(DOB6))
                JOptionPane.showMessageDialog(this,"PLEASE ENTER A VALID DATE OF BIRTH");
            if(!s1.equals(s2))
                JOptionPane.showMessageDialog(null, "PLEASE TYPE THE PASSWORD CORRECT");
            if(p1!=8)
                JOptionPane.showMessageDialog(null, "PLEASE TYPE THE PASSWORD 8 CHARACTER LONG");
        }
        else
        {
            insertInUser();
            insertInCustomer();
        }
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void jButtonCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelMouseClicked
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelMouseClicked

    private void jLabelALoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelALoginMouseClicked
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelALoginMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JTextArea AreaAddress;
    private javax.swing.JTextField FName;
    private javax.swing.JLabel FirstName;
    private javax.swing.JLabel Gender;
    private javax.swing.JTextField LName;
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField Welcome1;
    private javax.swing.JLabel background;
    private javax.swing.JLabel confirmPass;
    private javax.swing.JLabel dateOB;
    private javax.swing.JLabel emailAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabelALogin;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldPass1;
    private javax.swing.JPasswordField jPasswordFieldPass2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDob;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldGender;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldUser;
    private javax.swing.JLabel phoneNo;
    // End of variables declaration//GEN-END:variables
}
