/**
* File: BujurSangkar.java 22/03/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: representasi dari objek Bujur Sangkar, turunan kelas poligon
*/
package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
    private double panjangSisi;

    public BujurSangkar(double panjangSisi){
        this.panjangSisi = panjangSisi;
    }

    public double hitungLuas(){
        return panjangSisi * panjangSisi;
    }

    public double getPanjangSisi(){
        return panjangSisi;
    }
}
