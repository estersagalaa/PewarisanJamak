/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.praktikkumpbo.projectphonetrial;

/**
 *
 * @author IP130-14AST A4R3
 */
public interface Phone {
    int MaxVolume = 100;
    int MinVolume = 0;
    
    void PowerOn();
    void PowerOff();
    void VolumeUp();
    void VolumeDown();
}