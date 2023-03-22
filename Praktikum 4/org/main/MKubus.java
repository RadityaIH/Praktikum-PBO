/**
* File: MKubus.java 22/03/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: driver class untuk poligon, bujursangkar, dan kubus
*/

package org.main;

import org.bangundatar.BujurSangkar;

import org.bangunruang.Kubus;

public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujursangkar = new BujurSangkar(4);
        System.out.println("Panjang Sisi BujurSangkar:"+bujursangkar.getPanjangSisi());
        System.out.println("Luas BujurSangkar:"+bujursangkar.hitungLuas());

        System.out.println(" ");

        Kubus kubus = new Kubus(bujursangkar);
        System.out.println("Volume Kubus:"+kubus.hitungVolume());
        System.out.println("Luas Alas Kubus:"+kubus.hitungLuasAlas());
    }
}