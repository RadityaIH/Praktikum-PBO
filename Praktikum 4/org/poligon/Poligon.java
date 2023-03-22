/**
* File: Poligon.java 08/03/2023
* Penulis: Raditya Ilham Hastoro
* Deskripsi: representasi dasar dari objek poligon (segi banyak)
*/
package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	public Poligon() {
	}

	public int getJumlahSisi(){
		return this.jumlahSisi;
	}

	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
}