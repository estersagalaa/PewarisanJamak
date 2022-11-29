/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.praktikkumpbo.uts_no2_a_3106;

/**
 *
 * @author IP130-14AST A4R3
 */
public class UTS_No2_A_3106 {

    public static void main(String[] args) {
        Employer ref;
        SalariedEmployee pekerja=new SalariedEmployee();
        CommisionEmployee pegawai=new CommisionEmployee();
        ProjectPlanner atasan=new ProjectPlanner();
     
        System.out.println ("DAFTAR GAJI KARYAWAN");
        System.out.println ("\n");
     
        ref=pekerja;      
        ref.setNama ("Ester");
        ref.getNama();
        ref.jabatan_3106();
        ref.perhitungangaji();
        System.out.println ("\n");
     
        ref=pegawai;
        ref.setNama ("Anastasya");
        ref.getNama();
        ref.jabatan_3106();
        ref.perhitungangaji();
        System.out.println ("\n");
        ref=atasan;
        ref.setNama ("Sagala");
        ref.getNama();
        ref.jabatan_3106();
        ref.perhitungangaji();
    }
}
