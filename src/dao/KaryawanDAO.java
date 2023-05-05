/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Karyawan;

/**
 * Kelas    : PBO C
 * Anggota :
 * 1. Calvin Donisia Rahardjo       (210711299)
 * 2. I Made Wisnu Dharmapranaya    (210711352)
 * 3. Kevin Edgard Halim            (210711376)
 */
public class KaryawanDAO {
    private DbConnection dbCon = new DbConnection();
    private Connection con;
    
    public void insertDataKaryawan(Karyawan k){
        con = dbCon.makeConnection();
        
        String sql = "INSERT INTO karyawan(id,nama,jenis,tahunMasuk,notelepon,bebanmengajar,jamkerja)"
                + "Values ('"+k.getId()+"', '"+k.getJenis()+"', '"+k.getTahunMasuk()+"', "+k.getNotelepon()+", '"
                + k.getBebanmengajar()+"', '"+k.getJamkerja()+"')";
        
        System.out.println("Adding data Karyawan...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " +result+ " data Karyawan");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error Adding data Karyawan...");
            System.out.println(e);
        }
        dbCon.closeConnection();
    }
    
    public List<Karyawan> showDataKaryawan(){
        String sql = "select * from karyawan";
        System.out.println("Mengambil data karyawan...");
        
        List<Karyawan> list = new ArrayList<>();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs!=null){
                while(rs.next()){
                    Karyawan k = new Karyawan(
                            rs.getString("id"),
                            rs.getString("nama"),
                            rs.getString("jenis"), 
                            Integer.parseInt(rs.getString("tahunmasuk")),
                            rs.getString("notelepon"), 
                            rs.getString("bebanmengajar"),
                            Integer.parseInt(rs.getString("jamkerja"))
                    );
                    
                    list.add(k);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e){
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        return list;
    }
    
     public Karyawan searchDataKaryawn(String id) {
        con = dbCon.makeConnection();
        
        String sql = "SELECT * FROM karyawan WHERE id = '" +id + "'";
        System.out.println("Searching data karyawan...");
        Karyawan k = null;
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null) {
                while(rs.next()) {
                    k = new Karyawan (
                            rs.getString("id"),
                            rs.getString("nama"),
                            rs.getString("jenis"), 
                            Integer.parseInt(rs.getString("tahunmasuk")),
                            rs.getString("notelepon"), 
                            rs.getString("bebanmengajar"),
                            Integer.parseInt(rs.getString("jamkerja"))
                    );
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbCon.closeConnection();
        
        return k;
    }
}
