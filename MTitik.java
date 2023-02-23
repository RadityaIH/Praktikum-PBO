/* Program   : MTitik.java */
/* Deskripsi : file driver class Titik */
/* NIM/Nama  : 24060121140125/Raditya Ilham Hastoro*/
/* Tanggal   : 23 Februari 2023*/
/***********************************/

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

		System.out.println("Jumlah Objek Titik: "+ Titik.getCounterTitik());

		System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");
		System.out.println("t2("+ t2.getAbsis()+", "+t2.getOrdinat()+")");
		System.out.println("t3("+ t3.getAbsis()+", "+t3.getOrdinat()+")");

	}
}	