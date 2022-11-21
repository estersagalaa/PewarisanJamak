/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.kendaraan;

/**
 *
 * @author IP130-14AST A4R3
 */
public class Sedan extends Mobil {
    String fasilitasKeamanan, fasilitasKenyamanan;
    int kapasitasCC;

    public Sedan(){

    }

    public Sedan(String noPlat, String merk, float pajak, String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC){
        super(noPlat, merk, pajak);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        this.kapasitasCC = kapasitasCC;
    }

    public void infoSedan() {
        System.out.println("Fasilitas Keamanan   : " + this.fasilitasKeamanan);
        System.out.println("Fasilitas Kenyamanan : " + this.fasilitasKenyamanan);
        System.out.println("Kapasitas CC         : " + this.kapasitasCC);
        System.out.println("Total Pajak          : Rp. " + hitungPajak());
    }

    @Override
    public void tampilInfo() {
        System.out.println("\nInformasi Kendaraan:");
        super.tampilInfo();
        infoSedan();
    }

    public float hitungPajak() {
        return (this.pajak + (this.pajak * this.kapasitasCC * 0.00005f));
    }

}
