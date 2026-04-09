class Resto {
    private int chickenStock = 100; // Variabel shared resource

    // SOLUSI: Menambahkan keyword 'synchronized' untuk mencegah Race Condition
    // Dengan ini, hanya satu thread (kasir) yang bisa melayani pelanggan pada satu waktu
    public synchronized void serveCustomer(String cashierName) {
        if (chickenStock > 0) { // Pengecekan stok sekarang aman karena terkunci
            // Simulasi waktu pelayanan. InterruptedException ditangkap untuk menangani jika thread diganggu
            try { Thread.sleep(10); } catch (InterruptedException e) {} 
            
            chickenStock--; // Operasi pengurangan stok tidak akan saling bertabrakan
            System.out.println(cashierName + " berhasil menjual 1 ayam. Sisa stok: " + chickenStock);
        } else {
            System.out.println(cashierName + " gagal: Stok Habis!");
        }
    }

    public int getRemainingStock() {
        return chickenStock;
    }
}

public class RestoSimulasi {
    public static void main(String[] args) throws InterruptedException {
        Resto ayamJuicyLuicyGallagher = new Resto();
        
        Runnable task = () -> {
            for (int i = 0; i < 40; i++) {
                ayamJuicyLuicyGallagher.serveCustomer(Thread.currentThread().getName());
            }
        };
        
        Thread kasir1 = new Thread(task, "Kasir-A");
        Thread kasir2 = new Thread(task, "Kasir-B");
        Thread kasir3 = new Thread(task, "Kasir-C");
        
        kasir1.start(); // Menjalankan thread Kasir-A
        kasir2.start(); // Menjalankan thread Kasir-B
        kasir3.start(); // Menjalankan thread Kasir-C
        
        // Memastikan main thread menunggu ketiga kasir selesai bekerja sebelum mencetak hasil akhir
        kasir1.join();
        kasir2.join();
        kasir3.join();
        
        System.out.println("--- HASIL AKHIR STOK: " + ayamJuicyLuicyGallagher.getRemainingStock() + " ---");
    }
}