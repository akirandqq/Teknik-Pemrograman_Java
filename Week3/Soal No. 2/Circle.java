public class Circle extends Shape {
    private double radius;

    // 1. No-arg constructor
    public Circle() {
        super(); // Memanggil constructor default Shape
        this.radius = 1.0;
    }

    // 2. Constructor dengan parameter radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // 3. Constructor dengan radius, color, dan filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Memanggil constructor Shape yang ada parameternya
        this.radius = radius;
    }

    // Getter dan Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method menghitung luas (Area)
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method menghitung keliling (Perimeter)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}