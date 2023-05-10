/**
* File: Programmer.java 03/05/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: SubClass Pegawai
*/
public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
        System.out.println("Bonus : "+bonus);
    }
}
