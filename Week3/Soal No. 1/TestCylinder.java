public class TestCylinder { 
    public static void main(String[] args) {
        
        // --- Test 1: Cylinder Default ---
        Cylinder c1 = new Cylinder();
        System.out.println("=== Cylinder 1 (Default) ===");

        // Akan menampilkan pesan turunan dari Circle termasuk warna default "red"

        System.out.println(c1.toString()); 
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Surface Area: " + c1.getArea()); 
        System.out.println("Volume: " + c1.getVolume());     
        
        // --- Test 2: Mengubah Warna (Bukti Encapsulation & Inheritance) ---
        System.out.println("\n=== Cylinder 1 (Setelah Warnanya Diubah) ===");
        c1.setColor("Blue"); // Memanggil method dari class Circle yang diwarisi oleh Cylinder
        System.out.println(c1.toString()); // Output color pasti berubah jadi Blue
        System.out.println("Warna diambil via getter: " + c1.getColor());

        // --- Test 3: Cylinder dengan Radius dan Height Custom ---
        Cylinder c2 = new Cylinder(2.5, 10.0);
        c2.setColor("Green"); 
        System.out.println("\n=== Cylinder 2 (Custom) ===");
        System.out.println(c2.toString());
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Height: " + c2.getHeight());
        System.out.println("Surface Area: " + c2.getArea());
        System.out.println("Volume: " + c2.getVolume());
    }
}