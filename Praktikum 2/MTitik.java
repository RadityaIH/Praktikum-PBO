/* Nama File   : MTitik.java */
/* Pembuat : Raditya Ilham Hastoro */
/* NIM  : 24060121140125 */

class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		Titik t3;

		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5.0,6.0);

		t1.setAbsis(1.0);
		t1.setOrdinat(2.0);
		
		t2.setAbsis(4.0);
		t2.setOrdinat(9.0);

		// Memeriksa absis dan ordinat yang private
		// System.out.println("t1.x = "+ t1.absis);
		// System.out.println("t1.y = "+ t1.ordinat);
		
		System.out.println("Jumlah Objek Titik: "+ Titik.getCounterTitik());

		System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");
		System.out.println("t2("+ t2.getAbsis()+", "+t2.getOrdinat()+")");
		System.out.println("t3("+ t3.getAbsis()+", "+t3.getOrdinat()+")");
		
		OperasiTitik op = new OperasiTitik();
		System.out.println("-----Refleksi X t1-----");
		op.refleksiX(t1);
		System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");
		
		System.out.println("-----Refleksi Y t2-----");
		op.refleksiY(t2);
		System.out.println("t2("+ t2.getAbsis()+", "+t2.getOrdinat()+")");
		
		System.out.println("-----Refleksi X dan Y t3-----");
		op.refleksiX(t3);
		op.refleksiY(t3);
		System.out.println("t3("+ t3.getAbsis()+", "+t3.getOrdinat()+")");
	}
}	