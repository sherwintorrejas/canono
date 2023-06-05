/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERNALPAGES;

import canonodesign.loginform;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author canono
 */
public class settingsPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form settingsPage
     */
    public settingsPage() {
        initComponents();
         this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
    }
        Color navcolor = new Color(0,153,255);
        Color headcolor = new Color(0,204,204);
        Color bodycolor = new Color(204,255,255);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logout = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MANAGEUSER = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        REPORTS = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("User name here");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(0, 110, 140, 19);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/icons8-user-100.png"))); // NOI18N
        jPanel3.add(jLabel13);
        jLabel13.setBounds(10, 20, 120, 90);

        jLabel14.setText("jLabel14");

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("ACCOUNT SETTINGS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 280, 31);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Address: User address here");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 130, 190, 19);

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Account name: User name here");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 50, 230, 19);

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Position: Administrator");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 70, 220, 19);

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Email: User@user.email");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 90, 220, 19);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(null);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/icons8-user-100.png"))); // NOI18N
        jPanel4.add(jLabel15);
        jLabel15.setBounds(0, 0, 130, 150);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("User name here");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(0, 130, 130, 19);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(360, 0, 130, 160);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 531, 160));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        logout.setBackground(new java.awt.Color(0, 204, 204));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/icons8-logout-100.png"))); // NOI18N
        logout.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 110));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGOUT");
        logout.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        jPanel2.add(logout);
        logout.setBounds(360, 170, 130, 150);

        MANAGEUSER.setBackground(new java.awt.Color(0, 204, 204));
        MANAGEUSER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MANAGEUSERMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MANAGEUSERMouseExited(evt);
            }
        });
        MANAGEUSER.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/icons8-edit-profile-100.png"))); // NOI18N
        MANAGEUSER.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 110));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("EDIT PROFILE");
        MANAGEUSER.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        jPanel2.add(MANAGEUSER);
        MANAGEUSER.setBounds(40, 170, 130, 150);

        REPORTS.setBackground(new java.awt.Color(0, 204, 204));
        REPORTS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                REPORTSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                REPORTSMouseExited(evt);
            }
        });
        REPORTS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/reports.png"))); // NOI18N
        REPORTS.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 110));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("DISPLAY RECORDS");
        REPORTS.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        jPanel2.add(REPORTS);
        REPORTS.setBounds(200, 170, 130, 150);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/clear-sky-sunset-dusk-blue-sky-starry-sky-horizon-beach-1600x900-4044 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel18);
        jLabel18.setBounds(0, 40, 530, 300);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 531, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setBackground(navcolor);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setBackground(headcolor);
    }//GEN-LAST:event_logoutMouseExited

    private void MANAGEUSERMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MANAGEUSERMouseEntered
        MANAGEUSER.setBackground(navcolor);
    }//GEN-LAST:event_MANAGEUSERMouseEntered

    private void MANAGEUSERMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MANAGEUSERMouseExited
        MANAGEUSER.setBackground(headcolor);
    }//GEN-LAST:event_MANAGEUSERMouseExited

    private void REPORTSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseEntered
        REPORTS.setBackground(navcolor);
    }//GEN-LAST:event_REPORTSMouseEntered

    private void REPORTSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_REPORTSMouseExited
        REPORTS.setBackground(headcolor);
    }//GEN-LAST:event_REPORTSMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
       JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        mainFrame.dispose();
      loginform If = new loginform();
      If.setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MANAGEUSER;
    private javax.swing.JPanel REPORTS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel logout;
    // End of variables declaration//GEN-END:variables
}
