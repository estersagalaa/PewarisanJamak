/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.uts_no3_a_3106;

/**
 *
 * @author IP130-14AST A4R3
 */
public class AsistenPraktikum extends Mahasiswa implements Pendapatan{

    private String mkAsistensi;
    private int jmlPertemuan;

    @Override
    public Double totalPendapatan() {
        return (double) jmlPertemuan * 50000;
    }

    @Override
    public void tampilDataMhs(){
        System.out.println("=== Data Asisten Praktikum ===");
        System.out.println("NIM                 :" + getNim());
        System.out.println("Nama                :" + getNama());
        System.out.println("Jurusan             :" + getJurusan());
        System.out.println("IPK                 :" + getIpk());
        System.out.println("MK Asistensi        :" + getMkAsistensi());
        System.out.println("Jumlah Pertemuan    :" + getJmlPertemuan());
        System.out.println("----------------------------------------------");
        System.out.println("Total Pendapatan    : Rp. " + totalPendapatan());
        System.out.println();
    }

    public String getMkAsistensi() {
        return mkAsistensi;
    }

    public void setMkAsistensi(String mkAsistensi) {
        this.mkAsistensi = mkAsistensi;
    }

    public int getJmlPertemuan() {
        return jmlPertemuan;
    }

    public void setJmlPertemuan(int jmlPertemuan) {
        this.jmlPertemuan = jmlPertemuan;
    }
}
