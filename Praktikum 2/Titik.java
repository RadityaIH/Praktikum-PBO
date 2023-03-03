/* Nama File   : Titik.java */
/* Pembuat : Raditya Ilham Hastoro */
/* NIM  : 24060121140125 */

class Titik {
	private Double absis;
	private Double ordinat;
	private static int counterTitik;

	public Titik(){
		counterTitik++;	
	}

	public Titik(Double x, Double y){
		absis = x;
		ordinat = y;
		counterTitik++;
	}

	public void setAbsis(Double a){
		absis = a;
	}

	public void setOrdinat(Double o){
		ordinat = o;
	}
	
	public Double getAbsis(){
		return absis;
	}

	public Double getOrdinat(){
		return ordinat;
	}

	public static int getCounterTitik(){
		return counterTitik;
	}
}