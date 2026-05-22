/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo.database;
import java.util.List;
import responsi_pbo.model.*;
/**
 *
 * @author Lab Informatika
 */
public interface DAOinterface {
    void insert(karyawan k);
    void update(karyawan k);
    void delete(int id);
    List<karyawan>getAll();
    
    
}
