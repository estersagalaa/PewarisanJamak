/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.praktikkumpbo.uts_no3_a_3106;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author IP130-14AST A4R3
 */
public class UTS_NO3_A_3106 {

    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);
        ArrayList<AsistenPraktikum> listAssitenPraktikum = new ArrayList<>();
        ArrayList<StudentStaff> listStudentStaff = new ArrayList<>();

        System.out.print("Jumlah Asisten Praktikum \t: ");
        var jumlahAsisten = input.nextInt();
        System.out.print("jumlah Student Staff \t: ");
        var jumlahStudentStaff = input.nextInt();
        input.nextLine();
        
        //input data Asisten Praktikum
        for (var i = 1; i<=jumlahAsisten;i++){
            System.out.println("=== Input Data Asisten Praktikum ===");
            AsistenPraktikum asistenPraktikum = new AsistenPraktikum();

            System.out.println("NIM \t: ");
            var nim = input.nextLine();
            asistenPraktikum.setNim(nim);

            System.out.println("Nama \t: ");
            var nama = input.nextLine();
            asistenPraktikum.setNama(nama);

            System.out.println("Jurusan \t: ");
            var jurusan = input.nextLine();
            asistenPraktikum.setJurusan(jurusan);

            System.out.println("IPK \t: ");
            var ipk = input.nextDouble();
            asistenPraktikum.setIpk(ipk);
            input.nextLine();

            System.out.println("MK Asistensi \t: ");
            var mkAsistensi = input.nextLine();
            asistenPraktikum.setMkAsistensi(mkAsistensi);

            System.out.println("Jumlah Pertemuan \t: ");
            var jumlahPertemuan = input.nextInt();
            asistenPraktikum.setJmlPertemuan(jumlahPertemuan);
            input.nextLine();

            listAssitenPraktikum.add(asistenPraktikum);
            System.out.println();
        }

        //input data Student Staff
        for (var i = 1; i<=jumlahStudentStaff;i++){
            System.out.println("=== Input Data Student Staff ===");
            StudentStaff studentStaff = new StudentStaff();

            System.out.println("NIM \t: ");
            var nim = input.nextLine();
            studentStaff.setNim(nim);

            System.out.println("Nama \t: ");
            var nama = input.nextLine();
            studentStaff.setNama(nama);

            System.out.println("Jurusan \t: ");
            var jurusan = input.nextLine();
            studentStaff.setJurusan(jurusan);

            System.out.println("IPK \t: ");
            var ipk = input.nextDouble();
            studentStaff.setIpk(ipk);
            input.nextLine();

            System.out.println("Unit Kerja \t: ");
            var unitKerja = input.nextLine();
            studentStaff.setUnitKerja(unitKerja);

            System.out.println("Jam Kerja \t: ");
            var jamKerja = input.nextInt();
            studentStaff.setJamKerja(jamKerja);

            listStudentStaff.add(studentStaff);
            System.out.println();
        }

        //show data Asisten Praktikum
        for(AsistenPraktikum asistenPraktikum: listAssitenPraktikum){
            asistenPraktikum.tampilDataMhs();
        }

        //show data Student Staff
        for(StudentStaff studentStaff: listStudentStaff){
            studentStaff.tampilDataMhs();
        }
    }
}
