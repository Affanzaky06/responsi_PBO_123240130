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
        String posisi = fk.getjTextFieldNama().getText();
        String kontribusi = fk.getjTextFieldNama().getText();
        String kedisiplinan = fk.getjTextFieldNama().getText();
        
    }
}
