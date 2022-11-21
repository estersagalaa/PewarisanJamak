/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.kendaraan;

/**
 *
 * @author IP130-14AST A4R3
 */
public class Mobil {
    String noPlat;
    String merk;
    float pajak;

    public Mobil(){

    }

    public Mobil(String noPlat, String merk, float pajak){
        this.noPlat = noPlat;
        this.merk = merk;
        this.pajak = pajak;
    }

    public void tampilInfo() {
        System.out.println("Nomor PLat           : " + this.noPlat);      
        System.out.println("Merk Mobil           : " + this.merk);
        System.out.println("Pajak                : Rp. " + this.pajak);

    }
}
