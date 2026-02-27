public class Shape {
    // Dua variabel instans
    private String color;
    private boolean filled;

    // No-arg constructor (default)
    public Shape() {
        this.color = "green"; // Sesuai instruksi teks 
        this.filled = true;   // Sesuai instruksi teks 
    }

    // Constructor dengan parameter 
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter dan Setter untuk color 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk boolean pakai isXXX() sesuai konvensi 
    public boolean isFilled() {
        return filled;
    }

    // Setter untuk filled 
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Mengembalikan string deskripsi
    @Override
    public String toString() {
        // Pakai ternary operator biar gampang nentuin "filled" atau "Not filled"
        String isItFilled = isFilled() ? "filled" : "Not filled";
        return "A Shape with color of " + color + " and " + isItFilled;
    }
}