import java.util.Scanner;
import java.math.BigInteger;

public class DataTypes1 { // Soal nomor 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); 

            for(int i = 0; i < t; i++) {
                // Baca input sebagai String biar bisa nampung angka raksasa
                String rawInput = sc.next();
                
                // Masukkan ke BigInteger
                BigInteger n = new BigInteger(rawInput);

                // Cek apakah angka ini melebihi kapasitas Long
                if (n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0 || 
                    n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) < 0) {
                    
                    System.out.println(rawInput + " can't be fitted anywhere.");
                
                } else {
                    System.out.println(rawInput + " can be fitted in:"); // Kalau masuk sini, berarti muat di Long (atau lebih kecil)
                    
                    // Cek Byte (-128 s.d 127)
                    if(n.compareTo(BigInteger.valueOf(Byte.MAX_VALUE)) <= 0 && 
                       n.compareTo(BigInteger.valueOf(Byte.MIN_VALUE)) >= 0) {
                        System.out.println("* byte");
                    }
                    
                    // Cek Short
                    if(n.compareTo(BigInteger.valueOf(Short.MAX_VALUE)) <= 0 && 
                       n.compareTo(BigInteger.valueOf(Short.MIN_VALUE)) >= 0) {
                        System.out.println("* short");
                    }
                    
                    // Cek Int
                    if(n.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) <= 0 && 
                       n.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) >= 0) {
                        System.out.println("* int");
                    }
                    
                    // Cek Long
                    System.out.println("* long");
                }
            }
        }
        sc.close();
    }
}