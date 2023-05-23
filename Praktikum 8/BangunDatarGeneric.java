/**
 * File: BangunDatarGeneric.java 17/05/2023
 * Penulis: Raditya Ilham Hastoro
 * Deskripsi: kelas konstruksi generic untuk BangunDatar
 */

public class BangunDatarGeneric<T3 extends BangunDatar>{
    private T3 bangunDatar;

    public void set(T3 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T3 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

/**  Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java diganti 
dengan karakter yang lain seperti, T1,T2,T1234.

jawaban:
Meskipun T diganti dengan nama karakter yang lain seperti contohnya T3, nama dari karakter
tidak akan memengaruhi hasil akhir suatu program. Asalkan dalam mengganti nama, nama yang 
digunakan tetap konsiste. Contohnya ketika saya mengganti menjadi T3, seluruh nama yang semula
bernama T, juga harus diganti menjadi T3 juga.*/