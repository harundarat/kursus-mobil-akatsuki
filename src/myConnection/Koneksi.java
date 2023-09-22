/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Harun
 */
public class Koneksi {
    
    private static Connection koneksi ;
    
    public static Connection getConnection() throws SQLException{
        String db = "jdbc:mysql://127.0.0.1:3306/db_kursus";
        String user = "root";
        String pass = "";
        
        if (koneksi == null) {
            koneksi = DriverManager.getConnection(db, user, pass);
        }
        
        return koneksi;
        
    }
}
