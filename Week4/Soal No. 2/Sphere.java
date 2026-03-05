public class Sphere extends Shape {
    private double radius; 

    public Sphere(double r) {
        super("Sphere");
        radius = r;
    }

    public double area() {
        return 4 * Math.PI * radius * radius; // 4 * PI * r^2
    }

    public String toString() {
        return super.toString() + " of radius " + radius;
    }
}