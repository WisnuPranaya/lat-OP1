/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package model;

/**
 * Kelas    : PBO C
 * Anggota :
 * 1. Calvin Donisia Rahardjo       (210711299)
 * 2. I Made Wisnu Dharmapranaya    (210711352)
 * 3. Kevin Edgard Halim            (210711376)
 */
public class Karyawan {
    private String id;
    private String nama;
    private String jenis;
    private int tahunMasuk;
    private String notelepon;
    private String bebanmengajar;
    private int jamkerja;

    public Karyawan(String id, String nama, String jenis, int tahunMasuk, String notelepon, String bebanmengajar, int jamkerja) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.tahunMasuk = tahunMasuk;
        this.notelepon = notelepon;
        this.bebanmengajar = bebanmengajar;
        this.jamkerja = jamkerja;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public String getNotelepon() {
        return notelepon;
    }

    public String getBebanmengajar() {
        return bebanmengajar;
    }

    public int getJamkerja() {
        return jamkerja;
    }
    
    public String showData()
    {
        return
                this. id + " | "
                + this.nama + " | "
                + this.tahunMasuk + " | "
                + this.notelepon;
    }

}
