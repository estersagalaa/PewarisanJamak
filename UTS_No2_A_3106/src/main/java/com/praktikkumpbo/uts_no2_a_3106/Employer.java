/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.uts_no2_a_3106;

/**
 *
 * @author IP130-14AST A4R3
 */
public abstract class Employer {
    String nama;
    String jabatan_3106;
    double gajibersih_3106;
    double gajikotor_3106;
    double gajipokok_3106;
    double uangmakan_3106;
 
    public Employer()
    {
        gajipokok_3106=1500000.0;
    }
 
    public void setNama (String name)
    {
        this.nama=name;
    }
 
    public String getNama()
    {
        System.out.println ("Nama Karyawan : " +nama);
        return nama;
    }
 
    public String jabatan_3106()
    {
        System.out.println ("Posisi Jabatan : " +jabatan_3106);
        return jabatan_3106;
    }
 
    public abstract double perhitungangaji();
 
}
