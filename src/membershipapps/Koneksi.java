/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package membershipapps;
import java.sql.*;

/**
 *
 * @author Kelompokx
 */
public class Koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/db_membership";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getKoneksi() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
