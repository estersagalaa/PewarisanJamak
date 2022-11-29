/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.uts_no2_a_3106;

/**
 *
 * @author IP130-14AST A4R3
 */
public class CommisionEmployee extends Employer{
    double uangmakan_3106;
 
    public CommisionEmployee()
    {
        jabatan_3106="Commision Employee";
        uangmakan_3106=500000.0;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor_3106=gajipokok_3106+uangmakan_3106;
        potongan=(5.0/100.0)*gajikotor_3106;
        gajibersih_3106=gajikotor_3106-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok_3106);
        System.out.println ("Uang Makan : " +uangmakan_3106);
        System.out.println ("Gaji Kotor : " +gajikotor_3106);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih_3106);
     
        return gajibersih_3106;
    }
}



