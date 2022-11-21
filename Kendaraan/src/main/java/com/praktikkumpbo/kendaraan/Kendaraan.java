/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.praktikkumpbo.kendaraan;

/**
 *
 * @author IP130-14AST A4R3
 */
public class Kendaraan {

    public static void main(String[] args) {
         Mobil m = new Mobil("DD 1909 EA", "Avanza", 10000);
        Bus b = new Bus("R 123 A", "Toyota", 5000, 4, 7);
        Sedan s = new Sedan("R 456 B", "Honda Jazz", 3000, "Anti air", "Full AC", 6);
        MiniBus mb = new MiniBus("R 789 C", "Pajero", 15000, 9, 10, "Wagon", "Anti Air dan Api", "Full AC Full Senyum", 9);
        
        m.tampilInfo();

        b.tampilInfo();
        b.hitungPajak();

        s.tampilInfo();

        mb.tampilInfo();

    }
}   