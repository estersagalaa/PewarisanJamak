/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.praktikkumpbo.kendaraan;

/**
 *
 * @author IP130-14AST A4R3
 */
public class ChildSedan extends Sedan implements InterfaceSedan{

    public ChildSedan(String noPlat, String merk, float pajak, String fasilitasKeamanan, 
            String fasilitasKenyamanan, int kapasitasCC){
        super(noPlat, merk, pajak, fasilitasKeamanan, fasilitasKenyamanan, kapasitasCC);
    }
}