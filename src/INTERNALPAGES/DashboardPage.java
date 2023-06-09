/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERNALPAGES;

import java.awt.Color;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author SCC-PC34
 */
public class DashboardPage extends javax.swing.JInternalFrame {

    /**
     * Creates new form dashboard
     */
    public DashboardPage() {
        initComponents();
          this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
            
    }
 Color navcolor = new Color(0,153,255);
        Color headcolor = new Color(0,204,204);
        Color bodycolor = new Color(204,255,255);
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        SETTINGS = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MANAGEUSER = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        REPORTS = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setRequestFocusEnabled(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("SAO OFFENSE TRACKER");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setText("Description");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(70, 70, 70)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 531, 160));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(null);

        SETTINGS.setBackground(new java.awt.Color(0, 204, 204));
        SETTINGS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SETTINGSMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SETTINGSMouseExited(evt);
            }
        });
        SETTINGS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/settings.png"))); // NOI18N
        SETTINGS.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 110));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("SETTINGS");
        SETTINGS.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        jPanel2.add(SETTINGS);
        SETTINGS.setBounds(360, 170, 130, 150);

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
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/user manage.png"))); // NOI18N
        MANAGEUSER.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 130, 110));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("MANAGE USER");
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/clear-sky-sunset-dusk-blue-sky-starry-sky-horizon-beach-1600x900-4044 (1).jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 40, 530, 300);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 531, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void SETTINGSMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SETTINGSMouseExited
         SETTINGS.setBackground(headcolor);
    }//GEN-LAST:event_SETTINGSMouseExited

    private void SETTINGSMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SETTINGSMouseEntered
      SETTINGS.setBackground(navcolor);
    }//GEN-LAST:event_SETTINGSMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MANAGEUSER;
    private javax.swing.JPanel REPORTS;
    private javax.swing.JPanel SETTINGS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
