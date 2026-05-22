/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lab Informatika
 */
public class Koneksi {
       public Connection connection = null;
       
       String url = "jdbc:mysql//localhost/karyawan_db";
       String user = "root";
       String pass= "";
       
       public Koneksi(){
           try {
               if (connection == null || connection.isClosed()) {
                   connection = DriverManager.getConnection(url,user,pass);
                   System.out.println("Koneksi berhasil");
               }
           } catch (SQLException e) {
               System.out.println(e.getMessage());
           }
       }
}
