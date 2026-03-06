// Import class dari dalam file JAR
import id.ac.polban.employee.model.Department;

public class TestMain {
    public static void main(String[] args) {
        System.out.println("=== TES BACA FILE JAR ===");

        // Bikin objek Department pakai blueprint dari JAR
        Department dept = new Department("HRD & Finance");

        System.out.println("Berhasil memanggil class Department dari JAR!");
        System.out.println("Nama Departemen: " + dept.getName());
    }
}