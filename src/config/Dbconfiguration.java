/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Dbconfiguration {
     Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Hyrex\\Documents\\NetBeansProjects\\Student Information System\\studentInfo.sqlite");
            //JOptionPane.showMessageDialog(null, "Connection to database is successful");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
   private Connection connection;
    
    public Dbconfiguration(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
            }catch(SQLException e){
                System.err.println("Cannot connect to database: " + e.getMessage());
            }
        
        
    }
    public Connection connect_db(){
              try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/scc_db", "root", "");
            }catch(SQLException ex){
                    System.out.println("Can't connect to database: "+ex.getMessage());
            }
              return connection;
        }
    
    
    public ResultSet getData(String sql) throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        return resultSet;
    }
    
    
    
    public int insertData(String sql) throws SQLException{
     int result;   
        
    try{
    PreparedStatement pstmt = connection.prepareStatement(sql);
    
    pstmt.executeUpdate();
        System.out.println("Inserted Successfully");
        pstmt.close();
        result = 1;
    }catch(SQLException ex){
        System.out.println("Connection Error:"+ex);
        result = 0;
    }
    return result;
            
}
    
    
    
    
     public void deleteData(int id, String table, String table_id) {
    try {
        PreparedStatement stmt = connection.prepareStatement("DELETE FROM "+table+" WHERE "+table_id+" = ?");
        stmt.setInt(1, id);
        int rowsDeleted = stmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println(rowsDeleted + " rows were deleted.");
        } else {
            System.out.println("No rows were deleted.");
        }
        stmt.close();
        connection.close();
    } catch (SQLException e) {
        System.out.println("Error deleting data: " + e.getMessage());
    }
}
     
       public int updateData(String sql){
        int num = 0;
        try {
       
            String query = sql;
            PreparedStatement pstmt = connection.prepareStatement(query);
            int rowsUpdated = pstmt.executeUpdate();
            if(rowsUpdated > 0) {
                System.out.println("Data updated successfully!");
                num = 1;
            } else {
                System.out.println("Data update failed!");
                num = 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
       
        return num;
    }
    

}

