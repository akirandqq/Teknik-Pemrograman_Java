public abstract class Shape {
    protected String shapeName;

    // Constructor
    public Shape(String name) {
        shapeName = name;
    }

    // Abstract method area() - wajib diisi oleh anak-anaknya nanti
    public abstract double area();

    // Mengembalikan nama bangun ruang
    @Override
    public String toString() {
        return shapeName;
    }
}