public class Paint {
    private double coverage; 

    public Paint(double c) {
        coverage = c;
    }

    // Disinilah letak keajaiban Polymorphism!
    // Parameter 'Shape s' bisa menerima Rectangle, Sphere, atau Cylinder
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s);
        // Luas area dibagi coverage
        return s.area() / coverage; 
    }
}