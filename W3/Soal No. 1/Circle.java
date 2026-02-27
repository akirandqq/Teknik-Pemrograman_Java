public class Circle {
    private double radius;
    private String color; // Tambahan variabel color

    // 1st (default) constructor
    public Circle() { 
        radius = 1.0;
        color = "red";
    }

    // 2nd constructor
    public Circle(double r) { 
        radius = r;
        color = "red";
    }

    // 3rd constructor (Tambahan)
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter untuk radius
    public double getRadius() {
        return radius;
    }

    // Setter untuk radius (opsional tapi praktik yang baik)
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter untuk color
    public String getColor() {
        return color;
    }

    // Setter untuk color
    public void setColor(String color) {
        this.color = color;
    }

    // Menghitung luas lingkaran
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

    
}