/**
* File: Manajer.java 03/05/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: SubClass Pegawai
*/
public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
        System.out.println("Tunjangan : "+tunjangan);
    }
}
