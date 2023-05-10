/**
* File: Pegawai.java 03/05/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: SuperClass Pegawai
*/
public class Pegawai{
    protected String nama;
    protected int gajiPokok = 5000000;

    public void setNama(String nama){
        nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+nama+", Gaji pokok : "+gajiPokok);
    }
}
