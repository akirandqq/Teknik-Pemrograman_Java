public class TestShape2 {
    public static void main(String[] args) {
        System.out.println("=== Testing Circle ===");
        Circle c1 = new Circle(5.0, "blue", false);
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());
        
        System.out.println("\n=== Testing Rectangle ===");
        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow", true);
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());
    }
}