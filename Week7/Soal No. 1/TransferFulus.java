class Account {
    int balance = 150; 
}

public class TransferFulus {
    public static void main(String[] args) throws InterruptedException { 
        Account acc1 = new Account(); 
        Account acc2 = new Account(); 

        // Thread 1: Menjumlahkan/ transfer fulus dari acc1 ke acc2
        Thread t1 = new Thread(() -> { 
            synchronized (acc1) { // Mengunci acc1 agar tidak bisa diubah oleh thread lain saat ini
                System.out.println("Thread 1: Sedang mengunci acc1 dan bersiap transfer...");
                
                // Simulasi jeda. Exception (InterruptedException) diperlukan karena thread 
                // yang sedang tertidur bisa dipaksa bangun/diinterupsi oleh proses lain.
                try { Thread.sleep(100); } catch (Exception e) {} 
                
                synchronized (acc2) { // Mengunci acc2 untuk menerima transfer dari acc1 
                    System.out.println("Thread 1: Berhasil mengunci acc2, melakukan transfer!"); 
                    acc2.balance += acc1.balance; 
                }
            }
        });

        // Thread 2: Menjumlahkan/ transfer fulus dari acc2 ke acc1
        Thread t2 = new Thread(() -> { 
            // SOLUSI: Urutan penguncian disamakan dengan Thread 1 untuk mencegah Deadlock
            synchronized (acc1) { // Mengunci acc1 TERLEBIH DAHULU (berbeda dengan soal asli yang mengunci acc2 dulu)
                System.out.println("Thread 2: Sedang mengunci acc1 dan bersiap menerima transfer..."); 
                
                try { Thread.sleep(100); } catch (Exception e) {}
                
                synchronized (acc2) { // Mengunci acc2 KEDUA
                    System.out.println("Thread 2: Berhasil mengunci acc2, melakukan transfer balik!"); 
                    acc1.balance += acc2.balance; 
                }
            }
        });

        t1.start(); 
        t2.start(); 
        
        // Memastikan main thread menunggu t1 dan t2 selesai sebelum mencetak hasil akhir
        t1.join(); 
        t2.join(); 

        System.out.println("--- HASIL AKHIR ---"); 
        System.out.println("Saldo Akhir acc1: " + acc1.balance); 
        System.out.println("Saldo Akhir acc2: " + acc2.balance); 
    }
}