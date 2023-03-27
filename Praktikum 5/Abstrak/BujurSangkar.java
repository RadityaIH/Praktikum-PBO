/**
* File: BujurSangkar.java 27/03/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: kelas yang membuat implementasi metode abstrak pada bangun datar
*/

public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

/*Jika metode abstrak yaitu hitungLuas tidak diimplementasikan ke dalam subclass atau dalam kasus ini bujur sangkar,
maka akan terjadi error seperti ini:

".\BujurSangkar.java:7: error: BujurSangkar is not abstract and does not override abstract method hitungLuas(double) in BangunDatar"

Hal ini disebabkan karena sebuah kelas abstrak seperti contohnya BangunDatar mewajibkan kepada subclassnya untuk 
harus menggunakan metode abstrak yang dimilikinya. Karena tujuan dari kelas abstrak sendiri adalah untuk membuat metode yang
bisa diimplementasikan berbeda-beda di setiap subclassnya. */
