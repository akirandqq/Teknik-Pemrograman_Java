public class Rectangle extends Shape {
    private double width,length;

    // 1. No-arg constructor
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // 2. Constructor dengan parameter width dan length
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // 3. Constructor dengan width, length, color, dan filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter dan Setter
    public double getWidth() { return width; }
    public void setWidth(double width) { this.width = width; }
    
    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    // Method menghitung luas
    public double getArea() {
        return width * length;
    }
    // Method menghitung keliling
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}