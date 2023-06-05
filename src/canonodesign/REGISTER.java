/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canonodesign;

import INTERNALPAGES.studentform;
import config.Dbconfiguration;
import config.login_db;
import java.awt.BasicStroke;
import java.awt.Color;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author canono
 */
public class REGISTER extends javax.swing.JFrame {

    /**
     * Creates new form REGISTER
     */
    public REGISTER() {
        initComponents();
    }
     public String hashPassword(String password) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-256");
    md.update(password.getBytes());
    byte[] digest = md.digest();
    return String.format("%064x", new java.math.BigInteger(1, digest));
     }
   
Color hover = new Color(204,255,255);
Color defbutton = new Color(0,153,255);

Border empty = BorderFactory.createEmptyBorder();

void buttonBorderAnimation(JPanel panel){
panel.setBackground(hover);
panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
panel.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(2.0f)));
}




void buttonDefaultColor(JPanel panel){
panel.setBackground(defbutton);
panel.setBorder(empty);}



/*int validateRegister(){
int orayt ;
if(firstname.getText().isEmpty()||lastname.getText().isEmpty()||email.getText().isEmpty()||username.getText().isEmpty()||password.getText().isEmpty()){
orayt = 0;
}
else{
 orayt = 1;
}
return orayt ;
}*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lastname = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        register = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        confirm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRATION");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/LOGO (1).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 270, 160));

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lastname.setBackground(new java.awt.Color(0, 204, 204));
        lastname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lastname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lastname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Last Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel3.add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 220, 60));

        password.setBackground(new java.awt.Color(0, 204, 204));
        password.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel3.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 220, 60));

        register.setBackground(new java.awt.Color(0, 153, 255));
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        register.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("REGISTER");
        register.add(jLabel3);
        jLabel3.setBounds(10, 0, 160, 30);

        jPanel3.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 180, 30));

        firstname.setBackground(new java.awt.Color(0, 204, 204));
        firstname.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        firstname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstname.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "First Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel3.add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 220, 60));

        email.setBackground(new java.awt.Color(0, 204, 204));
        email.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Email address", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel3.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 220, 60));

        username.setBackground(new java.awt.Color(0, 204, 204));
        username.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel3.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 220, 60));

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimize.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, -1, 40));

        exit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 40));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 40));

        confirm.setBackground(new java.awt.Color(0, 204, 204));
        confirm.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        confirm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        confirm.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Gothic", 1, 11))); // NOI18N
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel3.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 220, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 280, 450));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/clear-sky-sunset-dusk-blue-sky-starry-sky-horizon-beach-1600x900-4044 (2) (2).jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
 
       /* int check = validateRegister();
        if (check == 1){
         Dbconfiguration dbc = new Dbconfiguration();
         int gawas = 0;
            try {
                gawas = dbc.insertData("INSERT INTO table_user (firstname, lastname, user_email, username, password, user_status) "
                        + "VALUES ('"+firstname.getText()+"', '"+lastname.getText()+"','"+email.getText()+"','"+username.getText()+"', '"+password.getText()+"','Pending')");
            } catch (SQLException ex) {
                Logger.getLogger(studentform.class.getName()).log(Level.SEVERE, null, ex);
            }
        if(gawas == 1){
            JOptionPane.showMessageDialog(null, "Successfully Registered!");
            
       loginform log = new loginform();
       this.dispose();
       log.setVisible(true);
       
            } else {System.out.println("Saving Data Failed");}
        
        }else {JOptionPane.showMessageDialog(null,"All fields are required");}
        
        */
       
       
       
       
       String fname = firstname.getText();
         String lname = lastname.getText();
      String mail = email.getText();
        String uname = username.getText();
        String pass = String.valueOf(password.getText());
        String cpass = String.valueOf(confirm.getText());
        
        if (uname.equals(""))
        {
            JOptionPane.showMessageDialog(null, "All Fields Are Required!");
        }else if (pass.equals(""))
        {
            JOptionPane.showMessageDialog(null, "Add a password");
        }else if (!pass.equals(cpass))
        {
            JOptionPane.showMessageDialog(null, "Password Don't Match");
        }
        
        else if (checkUsername(uname))
        {
             JOptionPane.showMessageDialog(null, "This Username Already Exist");
        }
        else{
        PreparedStatement ps;
ResultSet rs;
String registerUserQuery = "INSERT INTO `users`(`firstname`, `lastname`, `user_email`, `username`, `password`, `confirmpass`) VALUES (?,?,?,?,?,?)";

try {
    ps = login_db.getConnection().prepareStatement(registerUserQuery);
    ps.setString(1, fname);
    ps.setString(2, lname);
    ps.setString(3, mail);
    ps.setString(4, uname);
    ps.setString(5, hashPassword(pass));
    ps.setString(6, hashPassword(cpass));
    if(ps.executeUpdate() > 0){
        JOptionPane.showMessageDialog(null, "New User Add");
        loginform lf = new loginform();
        this.dispose();
        lf.setVisible(true);
    }else{
        JOptionPane.showMessageDialog(null, "Error: Check Your Information");
    }
} catch (SQLException ex) {
    Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex);
}catch (NoSuchAlgorithmException ex) {
    Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex); 
        
        }
        }
          
        
        
        
        
      
    }//GEN-LAST:event_registerMouseClicked

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
        buttonBorderAnimation(register);
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        buttonDefaultColor(register);
    }//GEN-LAST:event_registerMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       loginform dash = new loginform();
        this.dispose();
        dash.setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed

   public boolean  checkUsername(String username)
    {
         PreparedStatement ps;      
        ResultSet rs;
        boolean checkUser= false    ;
        
         String query = "SELECT * FROM `users` WHERE `username`= ?";
         
        try {
            ps = login_db.getConnection().prepareStatement(query);
             ps.setString(1, username);
             
              rs = ps.executeQuery();
            
            if(rs.next())
            {
                checkUser =true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(REGISTER.class.getName()).log(Level.SEVERE, null, ex);
        }
          return checkUser; 
    }      
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
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTER().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField confirm;
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField password;
    private javax.swing.JPanel register;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
