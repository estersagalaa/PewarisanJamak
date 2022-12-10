/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.uts_no3_a_3106;

/**
 *
 * @author IP130-14AST A4R3
 */
public class StudentStaff extends Mahasiswa implements Pendapatan {

    private String unitKerja;
    private int jamKerja;

    @Override
    public Double totalPendapatan() {
        return (double) jamKerja * 30000;
    }

    @Override
    public void tampilDataMhs(){
        System.out.println("=== Data Student Staff ===");
        System.out.println("NIM                  :" + getNim());
        System.out.println("Nama                 :" + getNama());
        System.out.println("Jurusan             :" + getJurusan());
        System.out.println("IPK                 :" + getIpk());
        System.out.println("Unit Kerja          :" + getUnitKerja());
        System.out.println("Jam Kerja           :" + getJamKerja());
        System.out.println("----------------------------------------------");
        System.out.println("Total Pendapatan    : Rp. " + totalPendapatan());
        System.out.println();
    }

    public String getUnitKerja() {
        return unitKerja;
    }

    public void setUnitKerja(String unitKerja) {
        this.unitKerja = unitKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
}
