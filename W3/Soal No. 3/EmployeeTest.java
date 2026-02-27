public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
       // Kita acak gajinya biar kelihatan efek sorting-nya
    staff[0] = new Employee("Antonio Rossi", 3000000, 1, 10, 1989); // Gaji paling GEDE
    staff[1] = new Employee("Maria Bianchi", 2000000, 1, 12, 1991); // Gaji paling KECIL
    staff[2] = new Employee("Isabel Vidal", 2500000, 1, 11, 1993);  // Gaji tengah-tengah

        // A.1: Menguji metode compare()
        System.out.println("=== Test Method Compare ===");
        System.out.println("Bandingkan gaji Antonio & Maria: " + staff[0].compare(staff[1])); // Hasil -1 (lebih kecil)
        System.out.println("Bandingkan gaji Isabel & Maria: " + staff[2].compare(staff[1]));  // Hasil 1 (lebih besar)

        System.out.println("\n=== Sebelum di-Sort ===");
        for (int i = 0; i < 3; i++) staff[i].print();

        // Mengurutkan menggunakan shell_sort dari Sortable
        Sortable.shell_sort(staff);

        System.out.println("\n=== Setelah di-Sort berdasarkan Gaji ===");
        for (int i = 0; i < 3; i++) staff[i].print();
    }
}