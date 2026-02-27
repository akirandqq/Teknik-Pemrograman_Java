public class Square extends Rectangle {

    // 1. No-arg constructor
    public Square() {
        super(); // Memanggil Rectangle() default, width dan length otomatis 1.0
    }

    // 2. Constructor dengan parameter side
    public Square(double side) {
        super(side, side); // Memanggil Rectangle(width, length) dengan nilai sama
    }

    // 3. Constructor dengan side, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); 
    }

    // Getter khusus untuk Square
    public double getSide() {
        return super.getWidth(); // Bisa ambil dari width atau length karena nilainya sama
    }

    // Setter khusus untuk Square
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // --- OVERRIDE SETTER DARI RECTANGLE ---
    @Override
    public void setWidth(double side) {
        setSide(side); // Kalau width diubah, length juga ikut berubah
    }

    @Override
    public void setLength(double side) {
        setSide(side); // Kalau length diubah, width juga ikut berubah
    }

    // Overriding toString()
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}