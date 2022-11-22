/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.praktikkumpbo.projectphone;
import java.util.Scanner;

/**
 *
 * @author IP130-14AST A4R3
 */
public class ProjectPhone {

   public static void main(String[] args) {
// membuat objek HP
Phone redmiNote8 = (Phone) new Xiaomi(); 
Phone iPhone9 = (Phone) new iPhone();
Phone SamsungA13 = (Phone) new Samsung(); 
Phone OppoA57 = (Phone) new Oppo();

// membuat objek user
 
PhoneUser Ester = new PhoneUser(redmiNote8);


// kita coba nyalakan HP-nya Ester.turnOnThePhone();

// biar enak, kita buat dalam program 
Scanner input = new Scanner(System.in);
String aksi;
while (true) {
System.out.println("=== APLIKASI INTERFACE ===");
System.out.println("[1] Nyalakan HP"); 
System.out.println("[2] Matikan HP"); 
System.out.println("[3] Perbesar Volume"); 
System.out.println("[4] Kecilkan Volume"); 
System.out.println("[0] Keluar");
System.out.println("	");
System.out.print("Pilih aksi> "); 
aksi = input.nextLine();

if (aksi.equalsIgnoreCase("1")) { 
    Ester.turnOnThePhone();
} else if (aksi.equalsIgnoreCase("2")) { 
    Ester.turnOffThePhone();
} else if (aksi.equalsIgnoreCase("3")) {
    Ester.makePhoneLouder();
} else if (aksi.equalsIgnoreCase("4")) { 
    Ester.makePhoneSilent();
} else if (aksi.equalsIgnoreCase("0")) {
    System.exit(0);
} else {
 
System.out.println("Kamu memilih aksi yang salah!");
}
}
}

}
