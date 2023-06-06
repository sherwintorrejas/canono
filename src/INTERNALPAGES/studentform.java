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
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author canono
 */
public class studentform extends javax.swing.JFrame {
private Connection con;
DefaultTableModel model;

  //Connection conn=null;
//ResultSet rs=null;
//PreparedStatement pst=null;
   
    
    public studentform() {
        initComponents();
       displayData();
    }
   
 public void imageUpdater(String existingFilePath, String newFilePath){
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: ");
            }
        } else {
            try{
                Files.copy(sfile.toPath(), new File(picpath).toPath(), StandardCopyOption.REPLACE_EXISTING);
            }catch(IOException e){
                System.out.println("Error on update!");
            }
        }
   }
    
        public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
    
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
          
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
    
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    
public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}

public int FileChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    
    
    
    
    public void img(){
    JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                
                
                
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        sfile = fileChooser.getSelectedFile();
                        picpath = "src/images/" + sfile.getName();
                        path  = sfile.getAbsolutePath();
                        
                        
                        if(FileChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            picpath = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            System.out.println(""+picpath);
                            browse.setVisible(true);
                            browse.setText("REMOVE");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "FILE ERROR"+ex);
                    }
                }
    
}
        public void close(){
            this.dispose();
        dashboards ds = new dashboards();
      ds.setVisible(true);
      
      studentPage up = new studentPage();
        ds.maindesktop.add(up).setVisible(true);
        }
     public void displayData(){
       
        try{
       
            Dbconfiguration dbc = new Dbconfiguration();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            DefaultTableModel model = (DefaultTableModel) table.getModel();
             String[] columnIdentifiers = {"ID", "NAME", "ADDRESS","STATUS"
                     + "", "GENDER", "CONTACT","MOTHER", "FATHER", "VIOLATION","IMAGE"};
             model.setColumnIdentifiers(columnIdentifiers);
            rs.close();
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
    
    
     public void fillTable()throws SQLException{
         
       try{  
         Dbconfiguration dbc = new Dbconfiguration();
         ResultSet rs = dbc.getData("SELECT*FROM tbl_student");
         table.setModel(DbUtils.resultSetToTableModel(rs));
         
     }catch(SQLException ex){
}
     }
 public void table(){
     int row = table.getSelectedRow();
     int cc = table.getSelectedColumn();
    ImageIcon format;
     String tc = table.getModel().getValueAt(row, 0).toString();
             try{
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
             String sql = "select * from tbl_student where st_id="+tc+"";
             PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            int id=rs.getInt("st_id");
            String name=rs.getString("st_name");
            String addr=rs.getString("st_address");
            String stat=rs.getString("st_status");
            String gend=rs.getString("st_gender");
            String cont=rs.getString("contact");
            String mnm=rs.getString("mname");
            String fnm=rs.getString("fname");
              String vio=rs.getString("violation");
            image.setIcon(ResizeImage(rs.getString("IMAGE"), null,image));
                OP = rs.getString("IMAGE");
                st_id.setText(""+id);
                st_name.setText(name);
                st_address.setText(addr);
                st_status.setSelectedItem(stat);
                gen.setSelectedItem(gend);
                contact.setText(cont);
                   mname.setText(mnm);
                fname.setText(fnm);
                 violation.setSelectedItem(vio);
         
            }
             ps.close();
             rs.close();
         } catch (Exception e) {
         JOptionPane.showMessageDialog(null, e);
         }
        }
 
 
 
 public void add(){
     int result=0;
         try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
            String sql = "INSERT INTO tbl_student (st_name, st_address, st_status, st_gender, contact, mname, fname, violation, image) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, st_name.getText());
            pst.setString(2, st_address.getText());
            pst.setString(3, st_status.getSelectedItem().toString());
            pst.setString(4, gen.getSelectedItem().toString());
            pst.setString(5, contact.getText());
            pst.setString(6, mname.getText());
            pst.setString(7, fname.getText());
            pst.setString(8, violation.getSelectedItem().toString());
            pst.setString(9, picpath);
            pst.executeUpdate();
             result = 1;
            Files.copy(sfile.toPath(), new File(picpath).toPath(), StandardCopyOption.REPLACE_EXISTING); 
               if(result == 1){
               JOptionPane.showMessageDialog(null, "Successfully Save!");
              displayData();
                res();
           }else{
                System.out.println("Saving Data Failed!");
           }    
             
        JOptionPane.showMessageDialog(this, "ADDED SUCCESSFULLY");
            }catch(Exception e){
                System.err.println("Cannot connect to database: " + e.getMessage());
     
     
     }
     }
 
 public void update(){
         int result=0;
         try {
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
         int row = table.getSelectedRow();
         String value = (table.getModel().getValueAt(row, 0).toString());
          String sql = "UPDATE tbl_student SET st_name=?, st_address=?,st_status=?,  st_gender=?, contact=?, mname=?, fname=?, violation=?,  image=? where st_id="+value;
            PreparedStatement pst = con.prepareStatement(sql);
                 pst.setString(1, st_name.getText());
            pst.setString(2, st_address.getText());
            pst.setString(3, st_status.getSelectedItem().toString());
            pst.setString(4, gen.getSelectedItem().toString());
            pst.setString(5, contact.getText());
            pst.setString(6, mname.getText());
            pst.setString(7, fname.getText());
             pst.setString(8, violation.getSelectedItem().toString());
             pst.setString(9, picpath);
            pst.execute();
             imageUpdater(OP, path);
           
           File existingFile = new File(OP);
            if (existingFile.exists()) {
                existingFile.delete();
            }
           
           JOptionPane.showMessageDialog(null, "Successfully Updated!");
           res();
           }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"Database Connection Error!"+e);
           }
     }
 public boolean validation(){
  String name= st_id.getText();
String addr= st_address.getText();
String contct= this.contact.getText();
String mne= mname.getText();
String fnm= fname.getText();
 if (name.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER NAME");
 return false;
 }
 if(addr.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER ADDRESS");
 return false;
 }       
   if(contct.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER CONTACT");
 return false;
 } 
    if (mne.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER MOTHER NAME");
 return false;
 }
     if (fnm.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER FATHER NAME");
 return false;
 }
    if(image.getIcon()==null){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER PHOTO");
 return false;
 }
   return true;  
 }
     public void res(){
        st_name.setText(null);
        st_address.setText(null);
        st_status.setSelectedItem(null);
        gen.setSelectedItem(null);
        contact.setText(null);
        mname.setText(null);
        fname.setText(null);
        violation.setSelectedItem(null);
        image.setIcon(null);
     
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jPanel3 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        gen = new javax.swing.JComboBox<>();
        UPDATE = new javax.swing.JButton();
        ADD = new javax.swing.JButton();

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
        exit.setBounds(780, 0, 50, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Student ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 176, 120, 20));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Father's Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 486, 120, 20));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Gender:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 396, 120, 20));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Violation:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 516, 120, 20));

        st_address.setColumns(20);
        st_address.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_address.setRows(5);
        st_address.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        st_address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(st_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 210, 110));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("   Contact :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 426, 130, 20));

        fname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        fname.setOpaque(false);
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 170, 20));

        st_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_id.setEnabled(false);
        st_id.setOpaque(false);
        jPanel1.add(st_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 170, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Student Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 206, 120, 20));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Mother's Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 456, 120, 20));

        contact.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        contact.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contact.setOpaque(false);
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 170, 20));

        mname.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        mname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mname.setOpaque(false);
        jPanel1.add(mname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 170, 20));

        st_name.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        st_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        st_name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        st_name.setOpaque(false);
        jPanel1.add(st_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 170, 20));

        st_status.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        st_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SINGLE", "MARRIED", "" }));
        jPanel1.add(st_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 361, 170, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Address:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 236, 90, 20));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Status");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 356, 120, 20));

        violation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cheating or plagiarizing", "Using profane, obscene, or ethnically offensive language", "Possessing pornographic material", "Theft (from another student or from the school)", "Gambling on school grounds", "Threatening the safety of another student", "Fighting with another student" }));
        jPanel1.add(violation, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, 170, 20));

        clear.setBackground(new java.awt.Color(204, 255, 255));
        clear.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, 100, 30));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 170, 120));

        browse.setBackground(new java.awt.Color(204, 255, 255));
        browse.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        browse.setText("choose");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        jPanel1.add(browse, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 110, 30));

        delete.setBackground(new java.awt.Color(0, 153, 255));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 110, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, 460));

        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE" }));
        jPanel1.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 170, 30));

        UPDATE.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 110, 30));

        ADD.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 
    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
 close();
      
      
    }//GEN-LAST:event_exitMouseClicked

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        st_name.setText(null);
        st_address.setText(null);
        st_status.setSelectedItem(null);
        gen.setSelectedItem(null);
        contact.setText(null);
        mname.setText(null);
        fname.setText(null);
        violation.setSelectedItem(null);
        image.setIcon(null);
    }//GEN-LAST:event_clearActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
      JFileChooser fileChooser = new JFileChooser();
                int returnValue = fileChooser.showOpenDialog(null);
                
                
                
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    try {
                        sfile = fileChooser.getSelectedFile();
                        picpath = "src/images/" + sfile.getName();
                        path  = sfile.getAbsolutePath();
                        
                        
                        if(FileChecker(path) == 1){
                          JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                            picpath = "";
                            path="";
                        }else{
                            image.setIcon(ResizeImage(path, null, image));
                            System.out.println(""+picpath);
                            browse.setVisible(true);
                            browse.setText("REMOVE");
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "FILE "+ex);
                    }
                }
    }//GEN-LAST:event_browseActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
      int rowIndex = table.getSelectedRow();
       if(rowIndex < 0){
           JOptionPane.showMessageDialog(null, "Please select a data first");
       }else{
            TableModel model = table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
             int a=JOptionPane.showConfirmDialog(null,"Are you sure?");  
                    if(a==JOptionPane.YES_OPTION){  
                       Dbconfiguration dbc = new Dbconfiguration();
                            int st_id =Integer.parseInt(id);
                            dbc.deleteData(st_id,"tbl_student", "st_id");
                            displayData();
                    }
       }
    }//GEN-LAST:event_deleteActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
      table();
    }//GEN-LAST:event_tableMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
           if(validation()== true){
      add();
        }
    }//GEN-LAST:event_ADDActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
       if(validation()== true){
     update();
        }
      
    }//GEN-LAST:event_UPDATEActionPerformed

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
    private javax.swing.JButton ADD;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton browse;
    private javax.swing.JButton clear;
    public javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JLabel exit;
    public javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gen;
    public javax.swing.JLabel image;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField mname;
    public javax.swing.JTextArea st_address;
    public javax.swing.JTextField st_id;
    public javax.swing.JTextField st_name;
    public javax.swing.JComboBox<String> st_status;
    private javax.swing.JTable table;
    public javax.swing.JComboBox<String> violation;
    // End of variables declaration//GEN-END:variables
 public String picpath = "";
    File sfile;
    public String OP;
    String path;
}
