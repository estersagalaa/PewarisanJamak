/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.kendaraan;

/**
 *
 * @author IP130-14AST A4R3
 */
public class Bus extends Mobil {
    int kapasitasPenumpang, kapasitasBagasi;

    public Bus(){

    }

    public Bus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi){
        super(noPlat, merk, pajak);
        this.kapasitasPenumpang = kapasitasPenumpang;
        this.kapasitasBagasi = kapasitasBagasi;
    }

    public void infoBus() {
        System.out.println("Kapasitas Penumpang  : " + this.kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi     : " + this.kapasitasBagasi);
        System.out.println("Total Pajak          : Rp. " + hitungPajak());
    }

    @Override
    public void tampilInfo() {
        System.out.println("\nInfo Kendaraan:");
        super.tampilInfo();
        infoBus();
    }

    public float hitungPajak() {
        return (this.pajak + (this.pajak * this.kapasitasPenumpang * this.kapasitasBagasi * 0.00005f));
    }
}
