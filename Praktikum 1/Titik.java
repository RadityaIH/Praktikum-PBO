/* Program   : Titik.java */
/* Deskripsi : file class Titik */
/* NIM/Nama  : 24060121140125/Raditya Ilham Hastoro*/
/* Tanggal   : 23 Februari 2023*/
/***********************************/

class Titik {
	Double absis;
	Double ordinat;
	static int counterTitik;

	Titik(){
		counterTitik++;	
	}

	Titik(Double x, Double y){
		absis = x;
    		ordinat = y;
		counterTitik++;
	}

	void setAbsis(Double a){
		absis = a;
	}

	void setOrdinat(Double o){
		ordinat = o;
	}
	
	Double getAbsis(){
		return absis;
	}

	Double getOrdinat(){
		return ordinat;
	}

	static int getCounterTitik(){
		return counterTitik;
	}
}
