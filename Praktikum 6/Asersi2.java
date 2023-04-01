/**
* File: Asersi2.java 29/03/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: program untuk demo asersi, yang akan menolak input
				jari-jari lingkaran yang bernilai nol
*/
class Lingkaran{
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari>0):"jari-jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("Keliling lingkaran = "+kelilingLingkaran);
	}
}

/**
PERTANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 

Tidak ada, secara konsep penggunaan asersi sudah benar. Asersi digunakan untuk memastikan kondisi terpenuhi pada saat eksekusi program. 
Asersi di program tersebut digunakan untuk menolak input dengan jari-jari yang tidak bernilai positif. Namun, yang dapat diperbaiki
adalah menambahkan pesan kesalahan asersi dengan lebih jelas. Secara jariJari>0, berarti bukan hanya menolak jariJari dengan nilai 0,
tetapi juga jariJari dengan nilai negatif. Untuk itu bisa menambahkan pesan menjadi:
	
assert(jariJari>0):"jari-jari tidak boleh nol atau negatif!!!";
*/