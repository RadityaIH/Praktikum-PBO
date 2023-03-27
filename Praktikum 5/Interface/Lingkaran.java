/**
* File: Lingkaran.java 27/03/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}