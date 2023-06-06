/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canonodesign;

import INTERNALPAGES.*;
import canonodesign.dashboards;
import static com.sun.webkit.perf.WCFontPerfLogger.reset;
import config.Dbconfiguration;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author canono
 */
public class deptform extends javax.swing.JFrame {

    /**
     * Creates new form studentform
     */
    public deptform() {
        initComponents();
        displayData();
    }
    
    
    int validateRegister(){
int orayt ;
if(dept_code.getText().isEmpty()||dept_desc.getText().isEmpty()){
orayt = 0;
}
else{
 orayt = 1;
}
return orayt ;
}
     public void displayData(){
       
        try{
       
            Dbconfiguration dbc = new Dbconfiguration();
            ResultSet rs = dbc.getData("SELECT * FROM table_department");
            table_department.setModel(DbUtils.resultSetToTableModel(rs));
              DefaultTableModel model = (DefaultTableModel) table_department.getModel();
    String[] columnIdentifiers = {"DEPARTMENT ID", "DEPARTMENT CODE", "DEPARTMENT NAME"};
    model.setColumnIdentifiers(columnIdentifiers);
    rs.close();
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
        }
    }
    
    
     public void fillTable()throws SQLException{
         
       try{  
         Dbconfiguration dbc = new Dbconfiguration();
         ResultSet rs = dbc.getData("SELECT*FROM table_department");
         table_department.setModel(DbUtils.resultSetToTableModel(rs));
         
     }catch(SQLException ex){
}
     }  
    
        public void close(){
            this.dispose();
        dashboards ds = new dashboards();
      ds.setVisible(true);
      
       departmentPage up = new  departmentPage();
        ds.maindesktop.add(up).setVisible(true);
        }
public void add(){

 if(validation()== true){
             Dbconfiguration dbc = new Dbconfiguration();
          try {
              dbc.insertData("INSERT INTO table_department  ( dept_code, dept_desc) "
                      + "VALUES ('"+dept_code.getText()+"','"+dept_desc.getText()+"')");
               displayData();
        reset();
          } catch (SQLException ex) {
              Logger.getLogger(deptform.class.getName()).log(Level.SEVERE, null, ex);
          }
 }
}
public void upd(){

 if(validation()== true){
      
      Dbconfiguration dbc = new Dbconfiguration();
        int num = dbc.updateData("UPDATE table_department SET dept_code "
                + "= '"+dept_code.getText()+"', dept_desc = '"+dept_desc.getText()+"' WHERE dept_id  = '"+dept_id.getText()+"'");
        if(num ==0){
        
        }else{
        JOptionPane.showMessageDialog(null, "updated successfully");
        displayData();
        reset();
        }
      

}
}

 public boolean validation(){
  String DPCODE= dept_code.getText();
String DPDI= dept_desc.getText();

 if (DPCODE.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER DEPARTMENT CODE");
 return false;
 }
 if(DPDI.equals("")){
 JOptionPane.showMessageDialog(this, "PLEASE ENTER DEPARTMENT DESCRIPTION");
 return false;
 }       
   return true;  
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
        dept_id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dept_desc = new javax.swing.JTextField();
        dept_code = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ADD = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_department = new javax.swing.JTable();

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
        jLabel1.setText("DEPARTMENT FORM");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(190, 10, 340, 20);

        exit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel2.add(exit);
        exit.setBounds(570, 0, 50, 40);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 40));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("DEPARTMENT ID:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 200, -1));

        dept_id.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dept_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dept_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dept_id.setEnabled(false);
        dept_id.setOpaque(false);
        jPanel1.add(dept_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 380, 20));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("DEPARTMENT CODE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 200, -1));

        dept_desc.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dept_desc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dept_desc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dept_desc.setOpaque(false);
        jPanel1.add(dept_desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 380, 20));

        dept_code.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dept_code.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dept_code.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dept_code.setOpaque(false);
        jPanel1.add(dept_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 380, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("DEPARTMENT DESCRIPTION:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, -1));

        ADD.setBackground(new java.awt.Color(0, 153, 255));
        ADD.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 80, 30));

        UPDATE.setBackground(new java.awt.Color(0, 153, 255));
        UPDATE.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 80, 30));

        delete.setBackground(new java.awt.Color(0, 153, 255));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 80, 30));

        table_department.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_departmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_department);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 600, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
 close();
      
      
    }//GEN-LAST:event_exitMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int rowIndex = table_department.getSelectedRow();
        if(rowIndex < 0){
            JOptionPane.showMessageDialog(null, "Please select a data first");
        }else{
            TableModel model = table_department.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a=JOptionPane.showConfirmDialog(null,"Are you sure?");
            if(a==JOptionPane.YES_OPTION){
                Dbconfiguration dbc = new Dbconfiguration();
                int st_id =Integer.parseInt(id);
                dbc.deleteData(st_id,"table_department", "dept_id");
                displayData();

            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void table_departmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_departmentMouseClicked
         int rowIndex = table_department.getSelectedRow();
        if(rowIndex <0){
        
        }else{
        TableModel model = table_department.getModel();

        dept_id.setText(""+model.getValueAt(rowIndex, 0));
        dept_code.setText(""+model.getValueAt(rowIndex, 1));
        dept_desc.setText(""+model.getValueAt(rowIndex, 2));
      
        }
    }//GEN-LAST:event_table_departmentMouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
    add();
    }//GEN-LAST:event_ADDActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
      upd();
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
            java.util.logging.Logger.getLogger(deptform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deptform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deptform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deptform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deptform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton delete;
    public javax.swing.JTextField dept_code;
    public javax.swing.JTextField dept_desc;
    public javax.swing.JTextField dept_id;
    private javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_department;
    // End of variables declaration//GEN-END:variables
}
