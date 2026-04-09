import java.util.Scanner;

public class PenjumlahanParalel {
    // Shared resource untuk menyimpan total akhir
    private static long totalAkhir = 0;
    
    // Objek pengunci untuk mekanisme Synchronization
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menerima Input dari pengguna
        System.out.print("Masukkan Jumlah Thread: ");
        int jumlahThread = scanner.nextInt();

        System.out.print("Masukkan Angka Akhir: ");
        int angkaAkhir = scanner.nextInt();

        // Array untuk menyimpan referensi setiap thread
        Thread[] threads = new Thread[jumlahThread];

        // Mekanisme Divide and Conquer
        int rentang = angkaAkhir / jumlahThread;
        int sisa = angkaAkhir % jumlahThread;

        int batasBawah = 1;

        System.out.println("\n--- PROSES PENJUMLAHAN ---");

        for (int i = 0; i < jumlahThread; i++) {
            final int threadId = i + 1;
            int batasAtas = batasBawah + rentang - 1;

            // Memasukkan sisa pembagian data ke thread terakhir agar tidak ada angka tertinggal
            if (i == jumlahThread - 1) {
                batasAtas += sisa;
            }

            // Variabel konstan agar dapat digunakan di dalam lambda expression
            final int start = batasBawah;
            final int end = batasAtas;

            // Membuat tugas untuk masing-masing thread
            threads[i] = new Thread(() -> {
                long hasilParsial = 0;
                
                // Menampilkan tugas yang dikerjakan masing-masing thread
                System.out.println("Thread " + threadId + ": Menjumlahkan " + start + " - " + end);

                for (int j = start; j <= end; j++) {
                    hasilParsial += j;
                }

                // Menampilkan hasil parsial
                System.out.println("Hasil parsial Thread " + threadId + ": " + hasilParsial);

                // Menjaga Thread Safety dengan Synchronization saat update total akhir
                synchronized (lock) {
                    totalAkhir += hasilParsial;
                }
            });

            // Menjalankan thread
            threads[i].start();
            
            // Mengupdate batas bawah untuk thread selanjutnya
            batasBawah = batasAtas + 1;
        }

        // Memastikan main thread menunggu semua hasil parsial selesai dihitung (Join)
        for (int i = 0; i < jumlahThread; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                System.out.println("Terjadi kesalahan pada eksekusi thread.");
            }
        }

        // Menampilkan hasil akhir
        System.out.println("\n--- HASIL AKHIR ---");
        System.out.println("Total Penjumlahan (1 - " + angkaAkhir + ") = " + totalAkhir);
        
        scanner.close();
    }
}