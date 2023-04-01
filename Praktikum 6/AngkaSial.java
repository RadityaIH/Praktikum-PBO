/**
* File: AngkaSial.java 29/03/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: Program penggunaan exception buatan sendiri
				pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial{
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		} catch(AngkaSialException ase){
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!");
		}
	}
}
/**
PERTANYAAN: 
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi? 
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi? 

Jika eksepsi terjadi, baris 12 tidak akan dieksekusi karena program akan masuk ke
AngkaSialException dan melompat ke blok catch setelah eksepsi terjadi.

Sementara baris hanya 21 akan dieksekusi jika terjadi eksepsi pada blok try di atasnya.
Jika tidak terjadi eksepsi di blok try (tidak ada input 13), maka baris 21 atau
blok catch tidak akan dieksekusi.
*/