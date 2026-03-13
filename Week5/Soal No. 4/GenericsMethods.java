public class GenericsMethods {

    // Mendefinisikan Java Generic Method`
    // Simbol <T> sebelum tipe kembalian (boolean) menandakan ini adalah method generic
    public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
        // Membandingkan isi (value) dari kedua objek menggunakan .equals()
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        // Membuat objek g1 dengan tipe String
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");

        // Membuat objek g2 dengan tipe String yang isinya sama
        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");

        // CARA 1: Memanggil Generic Method dengan menyebutkan tipe <String> secara eksplisit
        boolean isEqual1 = GenericsMethods.<String>isEqual(g1, g2);
        System.out.println("Hasil perbandingan eksplisit: " + isEqual1);

        // CARA 2: Memanggil Generic Method TANPA menyebutkan tipe (Mengandalkan Type Inference)
        boolean isEqual2 = GenericsMethods.isEqual(g1, g2);
        System.out.println("Hasil perbandingan dengan Type Inference: " + isEqual2);
    }
}