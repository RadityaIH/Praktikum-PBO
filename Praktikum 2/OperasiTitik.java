/* Nama File   : OperasiTitik.java */
/* Pembuat : Raditya Ilham Hastoro */
/* NIM  : 24060121140125 */

class OperasiTitik{
    public OperasiTitik(){}
    private void refleksiSumbuX(Titik titik){
        Double ordinat = titik.getOrdinat();
        titik.setOrdinat(-1 * ordinat);
    }
    private void refleksiSumbuY(Titik titik){
        Double absis = titik.getAbsis();
        titik.setAbsis(-1 * absis);
    }
    public Titik refleksiX(Titik t){
        Titik temp = t;
        refleksiSumbuX(temp);
        return temp;
    }
    public Titik refleksiY(Titik t){
        Titik temp = t;
        refleksiSumbuY(temp);
        return temp;
    }
}