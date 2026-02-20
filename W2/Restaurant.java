public class Restaurant {
    // Beberapa hal yang sudah saya ubah:

        // Attribute sudah bersifat private 
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

        // Akses data sudah dilakukan melalui getter dan setter 
    public String getNamaMakanan(int id) {
        return nama_makanan[id];
    }

    public double getHargaMakanan(int id) {
        return harga_makanan[id];
    }

    public int getStok(int id) {
        return stok[id];
    }

    public void setStok(int id, int stokBaru) {
        if (stokBaru < 0) {
            System.out.println("Stok tidak boleh negatif!");
        } else {
            this.stok[id] = stokBaru;
        }
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp. " + harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public static void nextId() {
        id++;
    }
        // Pengembangan Fitur: Pemesanan menu 
    public void pesanMenu(String namaPesanan, int jumlahPesanan) {
        for (int i = 0; i <= id; i++) {
            if (namaPesanan.equals(nama_makanan[i])) {
                if (stok[i] >= jumlahPesanan) {
                    // Jumlah Stok otomatis berkurang setelah pemesanan 
                    setStok(i, stok[i] - jumlahPesanan); 
                    System.out.println("Berhasil memesan " + jumlahPesanan + " porsi " + namaPesanan);
                } else {
                    // Pesanan akan ditolak jika stok tidak mencukupi 
                    System.out.println("Maaf, pesanan ditolak. Stok " + namaPesanan + " tidak mencukupi. (Sisa: " + stok[i] + ")");
                }
                return; // Keluar loop kalau menu sudah ketemu
            }
        }
        System.out.println("Maaf, menu " + namaPesanan + " tidak ditemukan.");
    }
}