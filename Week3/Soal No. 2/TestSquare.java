public class TestSquare {
    public static void main(String[] args) {
        System.out.println("=== Testing Square ===");
        Square sq1 = new Square(5.0, "purple", true);
        System.out.println(sq1.toString());
        
        // Ngetes apakah perlu override getArea() dan getPerimeter()?
        System.out.println("Area: " + sq1.getArea()); // (5 * 5 = 25)
        System.out.println("Perimeter: " + sq1.getPerimeter()); // 2 * (5 + 5) = 20
        
        System.out.println("\n=== Testing Perubahan Sisi (Override Setter) ===");
        // Coba iseng ubah lebarnya aja
        sq1.setWidth(10.0); 
        System.out.println("Setelah setWidth(10.0):");
        System.out.println(sq1.toString()); // Side bakal jadi 10
        System.out.println("Area baru: " + sq1.getArea()); // (10 * 10 = 100)
    }
}