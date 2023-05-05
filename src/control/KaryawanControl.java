/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package control;

import java.util.List;
import dao.KaryawanDAO;
import model.Karyawan;

/**
 * Kelas    : PBO C
 * Anggota :
 * 1. Calvin Donisia Rahardjo       (210711299)
 * 2. I Made Wisnu Dharmapranaya    (210711352)
 * 3. Kevin Edgard Halim            (210711376)
 */
public class KaryawanControl {
    private KaryawanDAO kDAO = new KaryawanDAO();
    
    public void insertDataComputer(Karyawan k) {
        kDAO.insertDataKaryawan(k);
    }
    
    public String showDataComputer(Karyawan k) {
        List<Karyawan> kar = kDAO.showDataKaryawan();
        
        String karString = "";
        
        for(int i = 0; i < kar.size(); i++) {
            karString = karString + kar.get(i).showData();
        }
        return karString;
    }
    
    
    public Karyawan searchDataKaryawan(String id) {
        Karyawan k = null;
        k = kDAO.searchDataKaryawn(id);
        
        return k;
    }

}
