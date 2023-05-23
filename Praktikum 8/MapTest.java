/**
 * File: MapTest.java 17/05/2023
 * Penulis: Raditya Ilham Hastoro
 * Deskripsi: program yang menggunakan Generic untuk pasangan Kunci-Nilai
 */

import java.util.*;

public class MapTest{
    public static void main(String[] args){
        // kunci -> integer, nilai -> string
        Map<Integer,String> map = new HashMap<Integer,String>();
        //menempatkan elemen kunci dan nilai
        map.put(1, "satu");
        map.put(2, "dua");
        // mengambil elemen pertama
        System.out.println(map.get(1));
        // mengambil keseluruhan kunci sebagai objek collection set
        Set<Integer> key = map.keySet();
        // bagaomana iterasi untuk mengambil keseluruhan nilai dari kunci?
        /* jawaban: dengan cara mengubahnya menjadi sebuah koleksi yang dapat diiterasi. 
                    Nilai dari objek map akan disimpan dalam Collection<String>. 
                    Lalu dicetak sama seperti pada ArryListTest */
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}