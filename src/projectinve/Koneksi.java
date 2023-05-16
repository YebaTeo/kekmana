/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectinve;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.*;

/**
 *
 * @author ktjan
 */
public class Koneksi {
    private static Connection koneksi;
    static Connection conn;
    static String sql;
    static Statement stat;
    static PreparedStatement pst;
    static ResultSet rs;
    
    public static Connection getKoneksi(){
        if (koneksi == null){
            try{
                String url = "jdbc:mysql://localhost:3306/sembako";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                conn = DriverManager.getConnection(url, user, password);
                JOptionPane.showMessageDialog(null, "Connection Successfully");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error");
            }
        }
        return koneksi;
    }
}
