import java.util.HashMap;
import java.util.Map;
/**
 * File: LambdaHashmap.java
 * Nama: Raditya Ilham Hastoro
 * Deskripsi: Implementasi Lambda pada Hashmap, digunakan sebagai parameter pada method
 */

public class LambdaHashmap 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put(12345, "Adi");
        mahasiswaMap.put(67890, "Bambang");
        mahasiswaMap.put(54321, "Cici");
        mahasiswaMap.put(98765, "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}
