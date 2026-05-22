/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsi_pbo.controller;
import java.util.List;
import javax.swing.*;
import responsi_pbo.database.karyawanDAO;
import responsi_pbo.model.karyawan;
import responsi_pbo.view.FrameKaryawan;
/**
 *
 * @author Lab Informatika
 */
public class KaryawanController {
    FrameKaryawan fk;
    karyawanDAO dao;
    
    public KaryawanController(FrameKaryawan fk,  karyawanDAO dao){
        this.dao = dao;
        this.fk = fk;
  
    }
    public void clear(){
        fk.getjTextFieldNama().setText("");
        fk.getjTextFieldKontribusi().setText("");
        fk.getjTextFieldKedisiplinan().setText("");
        fk.getjTextFieldKerjasama().setText("");
    }
    
    public void tambah(){
        String nama = fk.getjTextFieldNama().getText();
        String posisi = fk.getjComboBoxPos().getToolTipText();
        Double kontribusi = Double.parseDouble(fk.getjTextFieldKontribusi().getText());
        Double kedisiplinan = Double.parseDouble(fk.getjTextFieldKedisiplinan().getText()); 
        Double kerjasama = Double.parseDouble(fk.getjTextFieldKerjasama().getText()) ;
        
        if (kontribusi <0 || kontribusi>5 ) {
            JOptionPane.showMessageDialog(null, "Input harus angka 0 - 5");
        }
        
        if (kedisiplinan <0 || kedisiplinan>5 ) {
            JOptionPane.showMessageDialog(null, "Input harus angka 0 - 5");
        }
        
        if (kerjasama <0 || kerjasama>5 ) {
            JOptionPane.showMessageDialog(null, "Input harus angka 0 - 5");
        }
        
        double nilai = (kontribusi*0.3)+(kedisiplinan*0.3)+(kerjasama*0.3);
        
        karyawan fk = new karyawan();
        
        dao.insert(fk);
        
        JOptionPane.showMessageDialog(null, "data berhasil masuk");
        clear();
        
        
    }
}
