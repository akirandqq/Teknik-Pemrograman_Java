public class Cylinder extends Circle { 
    private double height; 

    // Constructor 1
    public Cylinder() {
        super(); // Memanggil default constructor Circle()
        this.height = 1.0;
    }

    // Constructor 2
    public Cylinder(double height) {
        super(); 
        this.height = height;
    }

    // Constructor 3
    public Cylinder(double radius, double height) {
        super(radius); // Memanggil constructor Circle(radius)
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Overriding getArea() untuk menghitung Luas Permukaan Tabung
    @Override
    public double getArea() {
        // 2 * π * r * t + 2 * Luas Alas
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea(); 
    }

    // Memperbaiki getVolume() agar menggunakan getArea() dari superclass
    public double getVolume() {
        return super.getArea() * height; 
    }

    // Overriding toString()
    @Override
    public String toString() { 
        return "Cylinder: subclass of " + super.toString() + " height=" + height;
    }
}