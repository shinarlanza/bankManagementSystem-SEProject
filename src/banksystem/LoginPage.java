package banksystem;

import java.sql.*;
import javax.swing.*;

public class LoginPage extends javax.swing.JFrame {

    public static String u1;
    public LoginPage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        background = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Welcome = new javax.swing.JTextField();
        jLabelClose1 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        WelcomeBG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonSignup = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        welcomeLogin = new javax.swing.JTextField();
        closeLogin = new javax.swing.JLabel();
        minimizeLogin = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();
        unameLogin = new javax.swing.JLabel();
        passLogin = new javax.swing.JLabel();
        jLabelRegister1 = new javax.swing.JLabel();
        jLabelRegister = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        cancelLogin = new javax.swing.JButton();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPass = new javax.swing.JPasswordField();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background.setPreferredSize(new java.awt.Dimension(400, 400));

        jPanel2.setBackground(new java.awt.Color(0, 60, 98));

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

        jLabelClose1.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelClose1.setForeground(new java.awt.Color(254, 254, 254));
        jLabelClose1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelClose1.setText("X");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        jLabelMin1.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        jLabelMin1.setForeground(new java.awt.Color(255, 250, 250));
        jLabelMin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMin1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabelClose1)
                .addGap(25, 25, 25))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Welcome, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabelClose1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelMin1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        WelcomeBG.setBackground(new java.awt.Color(236, 240, 241));
        WelcomeBG.setFont(new java.awt.Font("Arial", 1, 50)); // NOI18N
        WelcomeBG.setForeground(new java.awt.Color(0, 60, 98));
        WelcomeBG.setText("WELCOME");

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 60, 98));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BANK OF WVSU-CICT");
        jLabel1.setToolTipText("");
        jLabel1.setPreferredSize(new java.awt.Dimension(252, 32));

        jButton1.setBackground(new java.awt.Color(102, 0, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(253, 251, 251));
        jButton1.setText("LOG  IN");
        jButton1.setBorderPainted(false);
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.setMaximumSize(new java.awt.Dimension(84, 28));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonSignup.setBackground(new java.awt.Color(56, 75, 254));
        jButtonSignup.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonSignup.setForeground(new java.awt.Color(56, 75, 254));
        jButtonSignup.setText("SIGN UP");
        jButtonSignup.setContentAreaFilled(false);
        jButtonSignup.setFocusPainted(false);
        jButtonSignup.setFocusable(false);
        jButtonSignup.setMaximumSize(new java.awt.Dimension(89, 28));
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

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFrame1Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(WelcomeBG)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(164, 164, 164))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(WelcomeBG, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 60, 98));

        welcomeLogin.setBackground(new java.awt.Color(0, 60, 98));
        welcomeLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        welcomeLogin.setForeground(new java.awt.Color(250, 250, 250));
        welcomeLogin.setText("Login");
        welcomeLogin.setBorder(null);
        welcomeLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                welcomeLoginActionPerformed(evt);
            }
        });

        closeLogin.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        closeLogin.setForeground(new java.awt.Color(254, 254, 254));
        closeLogin.setText("X");
        closeLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closeLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeLoginMouseClicked(evt);
            }
        });

        minimizeLogin.setFont(new java.awt.Font("Ubuntu Medium", 1, 24)); // NOI18N
        minimizeLogin.setForeground(new java.awt.Color(255, 250, 250));
        minimizeLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeLogin.setText("-");
        minimizeLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizeLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(welcomeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimizeLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(closeLogin)
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(welcomeLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(closeLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(minimizeLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/background.png"))); // NOI18N
        background2.setMaximumSize(new java.awt.Dimension(400, 400));
        background2.setMinimumSize(new java.awt.Dimension(400, 400));
        background2.setPreferredSize(new java.awt.Dimension(400, 400));

        unameLogin.setBackground(new java.awt.Color(236, 240, 241));
        unameLogin.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        unameLogin.setForeground(new java.awt.Color(0, 60, 98));
        unameLogin.setText("USERNAME:");

        passLogin.setBackground(new java.awt.Color(236, 240, 241));
        passLogin.setFont(new java.awt.Font("Ubuntu Light", 1, 18)); // NOI18N
        passLogin.setForeground(new java.awt.Color(0, 60, 98));
        passLogin.setText("PASSWORD:");

        jLabelRegister1.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jLabelRegister1.setForeground(new java.awt.Color(103, 140, 207));
        jLabelRegister1.setText("Forgot password?");
        jLabelRegister1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegister1MouseClicked(evt);
            }
        });

        jLabelRegister.setFont(new java.awt.Font("Ubuntu Light", 0, 12)); // NOI18N
        jLabelRegister.setForeground(new java.awt.Color(103, 140, 207));
        jLabelRegister.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRegister.setText("Click here to create a new account");
        jLabelRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelRegisterMouseClicked(evt);
            }
        });

        buttonLogin.setBackground(new java.awt.Color(0, 119, 182));
        buttonLogin.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        buttonLogin.setForeground(new java.awt.Color(254, 254, 254));
        buttonLogin.setText("LOG IN");
        buttonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonLoginMouseClicked(evt);
            }
        });
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        cancelLogin.setBackground(new java.awt.Color(242, 38, 19));
        cancelLogin.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        cancelLogin.setForeground(new java.awt.Color(253, 251, 251));
        cancelLogin.setText("CANCEL");
        cancelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelLoginMouseClicked(evt);
            }
        });
        cancelLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelLoginActionPerformed(evt);
            }
        });

        jTextFieldUsername.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldUsername.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jTextFieldUsername.setForeground(new java.awt.Color(0, 60, 98));

        jPasswordFieldPass.setBackground(new java.awt.Color(240, 240, 240));
        jPasswordFieldPass.setFont(new java.awt.Font("Ubuntu Medium", 1, 14)); // NOI18N
        jPasswordFieldPass.setForeground(new java.awt.Color(0, 60, 98));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passLogin)
                            .addComponent(unameLogin))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelLogin)
                                .addGap(121, 121, 121)
                                .addComponent(buttonLogin))
                            .addComponent(jTextFieldUsername)
                            .addComponent(jPasswordFieldPass))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelRegister)
                                .addGap(124, 124, 124))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelRegister1)
                                .addGap(168, 168, 168))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(unameLogin)
                                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addComponent(passLogin))
                            .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRegister1)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonLogin)
                            .addComponent(cancelLogin))
                        .addGap(18, 18, 18)
                        .addComponent(jLabelRegister)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WelcomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WelcomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WelcomeActionPerformed
    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void welcomeLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_welcomeLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_welcomeLoginActionPerformed

    private void closeLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeLoginMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeLoginMouseClicked

    private void minimizeLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeLoginMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeLoginMouseClicked

    private void jLabelRegister1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegister1MouseClicked
        UpdatePass up =new UpdatePass();
        up.setVisible(true);
        up.pack();
        up.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegister1MouseClicked

    private void jLabelRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelRegisterMouseClicked
        Registration rf=new Registration();
        rf.setVisible(true);
        rf.pack();
        rf.setLocationRelativeTo(null);
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabelRegisterMouseClicked

    private void buttonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonLoginMouseClicked

    }//GEN-LAST:event_buttonLoginMouseClicked
    
    public void SetUsername(String u){
        u1 = u;
    }
    public String getUsername() {
        return u1;
    }
    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        try
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=convertToNull","root","");
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from user");
            String u= jTextFieldUsername.getText();
            String p= jPasswordFieldPass.getText();
            int flag=0;
            while(rs.next())
            {
                if((u.equals(rs.getString("username")))  && (p.equals(rs.getString("password"))))
                {
                    flag =1;
                }
            }
            if(flag == 1)
            {
                SetUsername(u);
                JOptionPane.showMessageDialog(null, "Successfully Logged in");
                DetailsInfo df = new DetailsInfo ();
                try
                {
                    Connection mycon=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem?zeroDateTimeBehavior=convertToNull","root","");
                    String s1="";
                    String y=("Select FName from customer where username ='"+u+"' ");
                    Statement smt = mycon.createStatement();
                    PreparedStatement ps=mycon.prepareStatement(y);
                    ResultSet r=ps.executeQuery();
                    if(r.next())
                    {
                        s1=r.getString("FName");
                    }
                    df.set(s1);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
                df.setVisible(true);
                df.pack();
                df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect!");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_buttonLoginActionPerformed

    private void cancelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelLoginMouseClicked
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_cancelLoginMouseClicked

    private void cancelLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelLoginActionPerformed
        LoginPage lp=new LoginPage();
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose(); //TODO add your handling code here:
    }//GEN-LAST:event_cancelLoginActionPerformed

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Welcome;
    private javax.swing.JLabel WelcomeBG;
    private javax.swing.JLabel background;
    private javax.swing.JLabel background2;
    public javax.swing.JButton buttonLogin;
    private javax.swing.JButton cancelLogin;
    private javax.swing.JLabel closeLogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSignup;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JLabel jLabelRegister;
    private javax.swing.JLabel jLabelRegister1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordFieldPass;
    public javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JLabel minimizeLogin;
    private javax.swing.JLabel passLogin;
    private javax.swing.JLabel unameLogin;
    private javax.swing.JTextField welcomeLogin;
    // End of variables declaration//GEN-END:variables
}
