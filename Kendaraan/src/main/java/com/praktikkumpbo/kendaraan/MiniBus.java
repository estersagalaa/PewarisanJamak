/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.kendaraan;

/**
 *
 * @author IP130-14AST A4R3
 */
public class MiniBus extends Bus implements InterfaceSedan {
    String tipe;

    InterfaceSedan interfaceSedan;

    public MiniBus(){

    }

    public MiniBus(String noPlat, String merk, float pajak, int kapasitasPenumpang, int kapasitasBagasi, String tipe, String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC){
        super(noPlat, merk, pajak, kapasitasPenumpang, kapasitasBagasi);
        this.tipe = tipe;
        interfaceSedan = new ChildSedan(noPlat, merk, pajak, fasilitasKeamanan, fasilitasKenyamanan, kapasitasCC);
    }

    public void infoMiniBus() {
        if (tipe == "Pribadi"){
            System.out.println("Tipe MiniBus         : Pribadi, digunakan sebagai kendaraan pribadi.");
        } else if (tipe == "Wagon"){
            System.out.println("Tipe MiniBus         : Wagon, digunakan sebagai kendaraan angkut/travel.");

        } else{
            System.out.println("Inputan salah!");
        }

        System.out.println("Total Pajak          : Rp. " + hitungPajak());
    }

    public void tampilInfo() {
        interfaceSedan.tampilInfo();
        super.infoBus();
        infoMiniBus();
    }

    public float hitungPajak() {
        if (tipe == "Pribadi"){
            return ((interfaceSedan.hitungPajak()* 0.06f) + (super.hitungPajak() * 0.03f));
        } else if (tipe == "Wagon"){
            return ((interfaceSedan.hitungPajak() * 0.03f) + (super.hitungPajak() * 0.05f));
        } else{
            return 0;
        }
    }
}
