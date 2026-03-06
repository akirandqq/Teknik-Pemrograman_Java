public class TestShape {
    public static void main(String[] args) {
        // 1. Test no-arg constructor
        Shape s1 = new Shape();
        System.out.println("--- Test Shape 1 (Default) ---");
        System.out.println(s1.toString()); // Bakal nge-print green dan filled

        // 2. Test constructor dengan parameter
        Shape s2 = new Shape("blue", false);
        System.out.println("\n--- Test Shape 2 (Custom) ---");
        System.out.println(s2.toString()); // Bakal nge-print blue dan Not filled

        // 3. Test Getter dan Setter
        System.out.println("\n--- Test Getter & Setter pada Shape 2 ---");
        s2.setColor("yellow");
        s2.setFilled(true);
        System.out.println("Warna sekarang: " + s2.getColor());
        System.out.println("Apakah terisi? " + s2.isFilled());
        System.out.println("Hasil toString baru: " + s2.toString());
    }
}