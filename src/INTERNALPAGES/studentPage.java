    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERNALPAGES;

import canonodesign.loginform;
import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import config.Dbconfiguration;
import java.awt.Color;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import config.Dbconnector;
import java.awt.Font;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author canono
 */
public class studentPage extends javax.swing.JInternalFrame {
DefaultTableModel model;
    /**
     * Creates new form USERPAGE
     */
    public studentPage() {
        initComponents();  
       displayData();   
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        
        
          table.setRowHeight(30);
        //jTable1.setRowHeight(1, 100);

      table.setShowGrid(true);
        table.setGridColor(Color.gray);

        table.setBackground(Color.white);
        table.setForeground(Color.BLACK);
        
       table.setSelectionBackground(Color.gray);
      table.setSelectionForeground(Color.white);
        
        table.setFont(new Font("Century Gothic", Font.ITALIC, 10)); 
        
    }

    public void displayData(){
       
        try{
       
            Dbconfiguration dbc = new Dbconfiguration();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_student");
            table.setModel(DbUtils.resultSetToTableModel(rs));
             DefaultTableModel model = (DefaultTableModel) table.getModel();
    String[] columnIdentifiers = {"ID", "NAME", "ADDRESS","STATUS", "GENDER", "CONTACT","MOTHER", "FATHER", "VIOLATION","IMAGE"};
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
     
                  
       public void filter(String STAT ){
             model = (DefaultTableModel) table.getModel();
         TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
         table.setRowSorter(trs);
       
         if(STAT =="ALL"){
        table.setRowSorter(trs);
         }else{
         trs.setRowFilter(RowFilter.regexFilter(STAT));
         }
       
       }
     
     public void filter1(String GEN ){
             model = (DefaultTableModel) table.getModel();
         TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
         table.setRowSorter(trs);
       
         if(GEN =="ALL"){
        table.setRowSorter(trs);
         }else{
         trs.setRowFilter(RowFilter.regexFilter(GEN));
         }
       
       }
        Color navcolor = new Color(0,153,255);
        Color headcolor = new Color(0,204,204);
        Color bodycolor = new Color(204,255,255);

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        ref = new javax.swing.JButton();
        add = new javax.swing.JButton();
        print = new javax.swing.JButton();
        GENDER = new javax.swing.JComboBox<>();
        STATUS = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 255));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setText("STUDENTS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 1, 280, 40);

        jPanel4.setBackground(new java.awt.Color(0, 153, 255));
        jPanel4.setLayout(null);
        jPanel2.add(jPanel4);
        jPanel4.setBounds(360, 0, 140, 50);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 531, 40));

        table.setBackground(new java.awt.Color(0, 153, 255));
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 510, 210));

        ref.setBackground(new java.awt.Color(0, 153, 255));
        ref.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ref.setText("REFRESH");
        ref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refActionPerformed(evt);
            }
        });
        jPanel1.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 80, 30));

        add.setBackground(new java.awt.Color(0, 153, 255));
        add.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        add.setText("ADD / UPDATE");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 160, 30));

        print.setBackground(new java.awt.Color(0, 153, 255));
        print.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel1.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 80, 30));

        GENDER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "MALE", "FEMALE" }));
        GENDER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GENDERItemStateChanged(evt);
            }
        });
        jPanel1.add(GENDER, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 150, -1));

        STATUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "SINGLE", "MARRIED" }));
        STATUS.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                STATUSItemStateChanged(evt);
            }
        });
        jPanel1.add(STATUS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 150, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsfolder/clear-sky-sunset-dusk-blue-sky-starry-sky-horizon-beach-1600x900-4044 (2).jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refActionPerformed
        
        
        try {
            fillTable();
        } catch (SQLException ex) {
            Logger.getLogger(studentPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
         JFrame mainFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
       mainFrame.dispose();
       studentform stf = new studentform();
       stf.setVisible(true);
    }//GEN-LAST:event_addActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        MessageFormat header = new MessageFormat("students");
        MessageFormat footer = new MessageFormat("Page {0, number,integer}");

        try
        {
           table.print(JTable.PrintMode.NORMAL,header,footer);
        }

        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No Printer found", e.getMessage());
        }
    }//GEN-LAST:event_printActionPerformed

    private void STATUSItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_STATUSItemStateChanged
         String STAT = STATUS.getSelectedItem().toString();
     
        filter(STAT); 
    }//GEN-LAST:event_STATUSItemStateChanged

    private void GENDERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GENDERItemStateChanged
       String GEN = GENDER.getSelectedItem().toString();
     
        filter(GEN); 
    }//GEN-LAST:event_GENDERItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> GENDER;
    private javax.swing.JComboBox<String> STATUS;
    private javax.swing.JButton add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton print;
    private javax.swing.JButton ref;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

   
}
