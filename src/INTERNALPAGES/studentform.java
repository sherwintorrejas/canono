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
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
public class studentform extends javax.swing.JFrame {
private Connection con;
  //Connection conn=null;
//ResultSet rs=null;
//PreparedStatement pst=null;
   
    
    public studentform() {
        initComponents();
       
    }
   
   
     public byte[] imageBytes;
    String path;
    String filename=null;
    String imgPath = null;
    public byte[] person_image = null;
    
    
        public void close(){
            this.dispose();
        dashboards ds = new dashboards();
      ds.setVisible(true);
      
      studentPage up = new studentPage();
        ds.maindesktop.add(up).setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        st_address = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        st_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        st_name = new javax.swing.JTextField();
        st_status = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        violation = new javax.swing.JComboBox<>();
        clear = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        image_display = new javax.swing.JLabel();
        choose = new javax.swing.JButton();

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
        jLabel1.setText("STUDENT FORM");
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
        exit.setBounds(530, 0, 50, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 40));

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

        jPanel1.add(st_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 110, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Student ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Father's Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 100, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, -1));

        female.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        female.setText("FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 70, 20));

        male.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        male.setText("MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 70, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Violation:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 100, -1));

        st_address.setColumns(20);
        st_address.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_address.setRows(5);
        st_address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        st_address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(st_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 190, 110));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("   Contact :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 110, -1));

        fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fname.setOpaque(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 150, 20));

        st_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_id.setEnabled(false);
        st_id.setOpaque(false);
        jPanel1.add(st_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 150, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Student Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Mother's Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 100, -1));

        contact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contact.setOpaque(false);
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 150, 20));

        mname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mname.setOpaque(false);
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 150, 20));

        st_name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_name.setOpaque(false);
        jPanel1.add(st_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 150, 20));

        st_status.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        st_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", " " }));
        jPanel1.add(st_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 150, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Address:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Status");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));

        violation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cheating or plagiarizing", "Using profane, obscene, or ethnically offensive language", "Possessing pornographic material", "Theft (from another student or from the school)", "Gambling on school grounds", "Threatening the safety of another student", "Fighting with another student" }));
        jPanel1.add(violation, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 150, -1));

        clear.setBackground(new java.awt.Color(204, 255, 255));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, 110, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel14.setText("Image:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 70, 20));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(image_display, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image_display, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 240, 150));

        choose.setBackground(new java.awt.Color(204, 255, 255));
        choose.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        choose.setText("choose");
        choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseActionPerformed(evt);
            }
        });
        jPanel1.add(choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void st_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseClicked
     
        
   /*     String user1=st_name.getText();
      
      try {
      
      File file=new File (filename);
      FileInputStream fis;
      byte[] image =new byte[ (int)file.length()];
      fis = new FileInputStream(file);
      fis.read(image);
      String sql = "UPDATE  tbl_student SET image = ? Where st_name = '"+user1+"'";
      pstmt=con.prepareStatement(sql);
      pstmt.setBytes(1,image);
      pstmt.executeUpdate();
      pstmt.close();
      JOptionPane.showMessageDialog(this, "SUCCESSFULLY UPDATED!");
 } catch (FileNotFoundException ex) {
Logger.getLogger(studentform.class.getName()).log(Level.SEVERE, null, ex);
 } catch (IOException ex){
 Logger.getLogger(studentform.class.getName()).log(Level.SEVERE, null, ex);
 } catch (SQLException ex){
 Logger.getLogger(studentform.class.getName()).log(Level.SEVERE, null, ex);
 }
        */
        
        
        
        if(action.equals("Add")){
           try{
            Dbconfiguration dbc = new Dbconfiguration();
            Connection con = dbc.connect_db();
            String sql = "INSERT INTO tbl_student (st_name, st_address, st_status, st_gender, contact, mname, fname, violation, image) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, st_name.getText());
            pst.setString(2, st_address.getText());
            pst.setString(3, st_status.getSelectedItem().toString());
            pst.setString(4, gender);
            pst.setString(5, contact.getText());
            pst.setString(6, mname.getText());
            pst.setString(7, fname.getText());
             pst.setString(8, violation.getSelectedItem().toString());
            pst.setBytes(9, pic);
            
   

            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
             close();
        }catch(Exception ex){
            System.out.println(ex);
        }
          
 }else if (action.equals("Update")){
       
      
       /* Dbconfiguration dbc = new Dbconfiguration();
        int num = dbc.updateData("UPDATE tbl_student "
                + "SET st_name = '"+st_name.getText()+"', st_address='"+st_address.getText()+"', "
                        + "st_status ='"+st_status.getSelectedItem()+"', st_gender='"+gender+"', contact='"+contact.getText()+"', mname='"+mname.getText()+"', fname='"+fname.getText()+"', violation='"+violation.getSelectedItem()+"', image='"+pic.getByte()+"'  "
                                + "WHERE st_id = '"+st_id.getText()+"'");
        
        close ();
       
        if(num == 0){
           
        }else{
           JOptionPane.showMessageDialog(null, "Updated Successfully!");
           
           reset();
        }
         
         
        
        }
       
       
     */
       
       try{
            Dbconfiguration dbc = new Dbconfiguration();
            Connection con = dbc.connect_db();
           String sql = "UPDATE tbl_student SET st_name=?, st_address=?,st_status=?,  st_gender=?, contact=?, mname=?, fname=?, violation=?,  image=? where st_id=?";
            PreparedStatement pst = con.prepareStatement(sql);

            pst.setString(1, st_name.getText());
            pst.setString(2, st_address.getText());
            pst.setString(3, st_status.getSelectedItem().toString());
            pst.setString(4, gender);
            pst.setString(5, contact.getText());
            pst.setString(6, mname.getText());
            pst.setString(7, fname.getText());
             pst.setString(8, violation.getSelectedItem().toString());
            pst.setBytes(9, pic);
            pst.setString(10, st_id.getText());
    

            pst.execute();
            JOptionPane.showMessageDialog(null, "Successfully Updated!");
             close();
        }catch(Exception ex){
            System.out.println(ex);
        }
 }
    }//GEN-LAST:event_st_labelMouseClicked
 public  ImageIcon ResizeImage(String ImagePath, byte[] pic) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(image_display.getWidth(), image_display.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

   
    
    private void st_labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseEntered
        st_label.setBackground(bodycolor);
    }//GEN-LAST:event_st_labelMouseEntered

    private void st_labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_st_labelMouseExited
        st_label.setBackground(navcolor);
    }//GEN-LAST:event_st_labelMouseExited

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        male.setSelected(false);
        if(female.isSelected()){
            gender = "Female";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
 close();
      
      
    }//GEN-LAST:event_exitMouseClicked

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        female.setSelected(false);
        if(male.isSelected()){
            gender = "Male";
        }else{
            gender = null;
        }
    }//GEN-LAST:event_maleActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        st_name.setText(null);
        st_address.setText(null);
        st_status.setSelectedItem(null);
        female.setSelected(false);
        male.setSelected(false);
        contact.setText(null);
        mname.setText(null);
        fname.setText(null);
        violation.setSelectedItem(null);
        image_display.setIcon(null);
    }//GEN-LAST:event_clearActionPerformed

    private void chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseActionPerformed
         JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION){
            File selectedFile = chooser.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            image_display.setIcon(ResizeImage(path,null));
            imgPath = path;
            File f = chooser.getSelectedFile();
            filename = selectedFile.getAbsolutePath();
        }else{
        JOptionPane.showMessageDialog(null, "Canceled !");
        }
        
      
        try {
                File image = new File(filename);
                FileInputStream fis = new FileInputStream(image);
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                byte[] buf = new byte[1024];
                
                for (int readNum; (readNum=fis.read(buf)) !=-1;){
                 bos.write(buf,0,readNum);
                }
                pic=bos.toByteArray();
                
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_chooseActionPerformed

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
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choose;
    private javax.swing.JButton clear;
    public javax.swing.JTextField contact;
    private javax.swing.JLabel exit;
    public javax.swing.JRadioButton female;
    public javax.swing.JTextField fname;
    public javax.swing.JLabel image_display;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel label;
    public javax.swing.JRadioButton male;
    public javax.swing.JTextField mname;
    public javax.swing.JTextArea st_address;
    public javax.swing.JTextField st_id;
    public javax.swing.JPanel st_label;
    public javax.swing.JTextField st_name;
    public javax.swing.JComboBox<String> st_status;
    public javax.swing.JComboBox<String> violation;
    // End of variables declaration//GEN-END:variables
String filen= null;
byte[] pic = null; 
private ImageIcon format = null;


}
