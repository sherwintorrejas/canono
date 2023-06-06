/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERNALPAGES;

import canonodesign.dashboards;
import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import config.Dbconfiguration;
import config.Emp;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author canono
 */
public class enrolmentform extends javax.swing.JFrame {
private Connection con;
  //Connection conn=null;
//ResultSet rs=null;
//PreparedStatement pst=null;
   
    
    public enrolmentform() {
        initComponents();
        gslp();
        Calendar currentDate = Calendar.getInstance();
        currentDate.set(Calendar.HOUR_OF_DAY, 0);
        currentDate.set(Calendar.MINUTE, 0);
        currentDate.set(Calendar.SECOND, 0);
        currentDate.set(Calendar.MILLISECOND, 0);
     ENROLLEDDATE.addPropertyChangeListener("date", new PropertyChangeListener() {
           
            public void propertyChange(PropertyChangeEvent evt) {
                Calendar selectedDate = Calendar.getInstance();
                selectedDate.setTime((Date) evt.getNewValue());
                if (selectedDate.before(currentDate)) {
                    ENROLLEDDATE.setDate(currentDate.getTime());
                   
                }
            }
     
     });
     
       
    }
        public void close(){
            this.dispose();
        dashboards ds = new dashboards();
      ds.setVisible(true);
      
      studentPage up = new studentPage();
        ds.maindesktop.add(up).setVisible(true);
        }
    
private void getstudent(){
 int studeid= Integer.parseInt(st_id.getText());
 try{
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
  PreparedStatement pst = con.prepareStatement("SELECT * FROM tbl_student where st_id  =?");
  pst.setInt(1, studeid);
  ResultSet rs = pst.executeQuery();
  
  if(rs.next()){
  SNAME.setText(rs.getString("st_name"));
  ADD.setText(rs.getString("st_address"));
  GEN.setText(rs.getString("st_gender"));

   error.setText("");
  }else{
  error.setText("INVALID STUDENT ID");
  }
 }catch (SQLException ex){
 ex.printStackTrace();
 }
}
 private void getDEPd(){
 int depid= Integer.parseInt(dept_id.getText());
 try{
  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
  PreparedStatement pst = con.prepareStatement("SELECT * FROM table_department where dept_id  =?");
  pst.setInt(1, depid);
  ResultSet rs = pst.executeQuery();
  
  if(rs.next()){
  DEPNAME.setText(rs.getString("dept_code"));
  error1.setText("");
  }else{
  error1.setText("INVALID DEPARTMENT ID");
          }
 }catch (SQLException ex){
 ex.printStackTrace();
 }
 }

 public void gslp(){

 enslip.setText("*****************************************************\n");
 enslip.setText(enslip.getText()+"-------------------ENROLLMENT SLIP--------------------\n");
 enslip.setText(enslip.getText()+"*****************************************************\n");


 enslip.setText(enslip.getText()+"\nENROLLED DATE: "+  ENROLLEDDATE.getDate()+"\n");
 enslip.setText(enslip.getText()+"\nDEPARTMENT ID: "+dept_id.getText()+"\n");
 enslip.setText(enslip.getText()+"\nDEPARTMENT NAME: "+ DEPNAME.getText()+"\n");
 enslip.setText(enslip.getText()+"\nSTUDENT ID: "+ st_id.getText()+"\n");
 enslip.setText(enslip.getText()+"\nSTUDENT NAME: "+  SNAME.getText()+"\n");
 enslip.setText(enslip.getText()+"\nADDRESS: "+  ADD.getText()+"\n");
  enslip.setText(enslip.getText()+"\nGENDER: "+  GEN.getText()+"\n");

 enslip.setText(enslip.getText()+"\nSIGNATURE:\n\n");
 enslip.setText(enslip.getText()+"\n____________\t\t_____________\n");
 enslip.setText(enslip.getText()+"ADMIN\t\tENROLLEE\n");
 
 
 
 
 }
    //print
 public void print(){
 
     try {
         enslip.print();
     } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "print failed"+e);
     }
 }
 
 
    Color navcolor = new Color(0,153,255);
        Color headcolor = new Color(0,204,204);
        Color bodycolor = new Color(204,255,255);
        
        public String gender;
        public String action;
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        st_label = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ADD = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        DEPNAME = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GEN = new javax.swing.JTextField();
        SNAME = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        enslip = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dept_id = new javax.swing.JTextField();
        st_id = new javax.swing.JTextField();
        ENROLLEDDATE = new com.toedter.calendar.JDateChooser();
        error = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("ENROLLMENT FORM");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 11, 280, 20);

        exit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(650, 0, 50, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        st_label.setBackground(new java.awt.Color(0, 153, 255));
        st_label.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        st_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                st_labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                st_labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                st_labelMouseExited(evt);
            }
        });

        label.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("DONE");

        javax.swing.GroupLayout st_labelLayout = new javax.swing.GroupLayout(st_label);
        st_label.setLayout(st_labelLayout);
        st_labelLayout.setHorizontalGroup(
            st_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
        );
        st_labelLayout.setVerticalGroup(
            st_labelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jPanel1.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 110, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ADDRESS:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 100, -1));

        ADD.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        ADD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ADD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ADD.setEnabled(false);
        ADD.setOpaque(false);
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 150, 20));

        clear.setBackground(new java.awt.Color(204, 255, 255));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 110, 30));

        DEPNAME.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        DEPNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        DEPNAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        DEPNAME.setEnabled(false);
        DEPNAME.setOpaque(false);
        jPanel1.add(DEPNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 20));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("DEPARTMENT NAME:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 130, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel8.setText("DEPARTMENT ID:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, -1));

        GEN.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        GEN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GEN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        GEN.setEnabled(false);
        GEN.setOpaque(false);
        jPanel1.add(GEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 150, 20));

        SNAME.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        SNAME.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SNAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SNAME.setEnabled(false);
        SNAME.setOpaque(false);
        jPanel1.add(SNAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 150, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("STUDENT ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("GENDER:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("STUDENT NAME:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 100, -1));

        enslip.setColumns(20);
        enslip.setRows(5);
        jScrollPane1.setViewportView(enslip);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 360, 310));

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton1.setText("PRINT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 120, 40));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("ENROLLMENT DATE:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 120, -1));

        dept_id.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        dept_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dept_id.setOpaque(false);
        dept_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dept_idFocusLost(evt);
            }
        });
        jPanel1.add(dept_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 150, 20));

        st_id.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        st_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_id.setOpaque(false);
        st_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                st_idFocusLost(evt);
            }
        });
        jPanel1.add(st_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 150, 20));
        jPanel1.add(ENROLLEDDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 150, -1));

        error.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 280, 30));

        error1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void st_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseClicked
  java.util.Date enroldate= ENROLLEDDATE.getDate();
    Long l1= enroldate.getTime();  
      java.sql.Date edate = new java.sql.Date(l1);
    
        if(action.equals("Add")){
           try{
            Dbconfiguration dbc = new Dbconfiguration();
            Connection con = dbc.connect_db();
            String sql = "INSERT INTO table_enrolle (st_id, dept_id, e_date, en_status) VALUES (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, st_id.getText());
             pst.setString(2, dept_id.getText());
            pst.setDate(3, edate);
            pst.setString(4, "ENROLLED");

            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
         gslp();
        }catch(Exception ex){
            System.out.println(ex);
        }
          
 }
    }//GEN-LAST:event_st_labelMouseClicked

    private void st_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseEntered
        st_label.setBackground(bodycolor);
    }//GEN-LAST:event_st_labelMouseEntered

    private void st_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseExited
        st_label.setBackground(navcolor);
    }//GEN-LAST:event_st_labelMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
 close();
      
      
    }//GEN-LAST:event_exitMouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        st_id.setText("");
        SNAME.setText("");
        ADD.setText("");
        GEN.setText("");
        dept_id.setText("");
        DEPNAME.setText("");
         ENROLLEDDATE.setDate(null);
    }//GEN-LAST:event_clearActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void st_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_st_idFocusLost
       if(!st_id.getText().equals("")){
       getstudent();
       }
    }//GEN-LAST:event_st_idFocusLost

    private void dept_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dept_idFocusLost
        if(!dept_id.getText().equals("")){
       getDEPd();
       }
    }//GEN-LAST:event_dept_idFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
print();      
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(enrolmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enrolmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enrolmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enrolmentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new enrolmentform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField ADD;
    public javax.swing.JTextField DEPNAME;
    private com.toedter.calendar.JDateChooser ENROLLEDDATE;
    public javax.swing.JTextField GEN;
    public javax.swing.JTextField SNAME;
    private javax.swing.JButton clear;
    private javax.swing.JTextField dept_id;
    private javax.swing.JTextArea enslip;
    private javax.swing.JLabel error;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label;
    private javax.swing.JTextField st_id;
    public javax.swing.JPanel st_label;
    // End of variables declaration//GEN-END:variables
String filen= null;
byte[] pic = null; 
private ImageIcon format = null;


}
