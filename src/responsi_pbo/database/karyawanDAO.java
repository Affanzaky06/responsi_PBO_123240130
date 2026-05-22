/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo.database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import responsi_pbo.model.karyawan;
/**
 *
 * @author Lab Informatika
 */
public class karyawanDAO implements DAOinterface{
    
    Connection conn = new Koneksi().connection;

    public karyawanDAO() {
        
    }

  
   
    @Override 
    public void insert(karyawan k){
        try {
            String sql = "INSERT INTO karyawan VALUES"
                    +"(null, "
                    + k.getNama() +","
                    + k.getPosisi() +","
                    + k.getKontribusi() +","
                    + k.getKedisiplinan() +","
                    + k.getKerjasama() +","
                    + k.getNilai_akhir() +","
                    + k.getStatus() +")";
            conn.createStatement().execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void update(karyawan k) {
        try {
            String sql = "UPDATE karyawan SET"
                    + "nama='"+k.getNama() + "' ,"
                    + "posisi='"+k.getPosisi()+ "' ,"
                    + "kontribusi='"+k.getKontribusi()+ "' ,"
                    + "kedisiplinan='"+k.getKedisiplinan()+ "' ,"
                    + "kerjasama='"+k.getKerjasama()+ "' ,"
                    + "nilai_akhir='"+k.getNilai_akhir()+ "' ,"
                    + "status='"+k.getStatus()
                    + "WHERE id=" + k.getId();
                  
        } catch (Exception e) {
        }
    }

    @Override
    public void delete(int id) {
        try {
            conn.createStatement().execute("DELETE FROM movie WHERE id=" + id);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<karyawan> getAll() {
        List<karyawan>list = new ArrayList<>();
        try {
            ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM karyawan");
            while (rs.next()) {                
                karyawan k = new karyawan();
                k.setId(rs.getInt("id"));
                k.setNama(rs.getString("nama"));
                k.setPosisi(rs.getString("posisi"));
                k.setKontribusi(rs.getDouble("kontribusi"));
                k.setKedisiplinan(rs.getDouble("kedisiplinan"));
                k.setKerjasama(rs.getDouble("kerjasama")); 
                k.setNilai_akhir(rs.getDouble("nilai_akhir")); 
                k.setStatus(rs.getString("status"));
                
                
                
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
    
    
}
