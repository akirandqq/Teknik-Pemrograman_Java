public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);
        
        System.out.println("=== DAFTAR MENU AWAL ===");
        menu.tampilMenuMakanan();

        System.out.println("\n=== SIMULASI PEMESANAN ===");
        // Mengetes pesanan sukses
        menu.pesanMenu("Pizza", 5);
        // Mengetes pesanan ditolak karena stok kurang
        menu.pesanMenu("Spaghetti", 25);
        
        System.out.println("\n=== DAFTAR MENU SETELAH PESANAN ===");
        menu.tampilMenuMakanan();
    }
}