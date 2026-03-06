package id.ac.polban.employee;

import id.ac.polban.employee.model.*;
import id.ac.polban.employee.service.*;

public class MainProgram {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM DATA KARYAWAN ===");

        // 1. Membuat departemen dan tipe pekerjaannya dulu
        Department deptIT = new Department("IT Department");
        EmploymentType typeFullTime = new EmploymentType("Full-Time");

        // 2. Membuat karyawannya
        Employee emp1 = new Employee(1, "Iqbal", deptIT, typeFullTime, 5000000);
        System.out.println("Karyawan baru bergabung: " + emp1.getName());

        Employee emp2 = new Employee(2, "Budi", deptIT, typeFullTime, 4500000);
        System.out.println("Karyawan baru bergabung: " + emp2.getName());

        // 3. Mengetes Service-nya (Nambah karyawan ke sistem & naik gaji)
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp1);
        service.addEmployee(emp2);

        System.out.println("\n=== TES NAIK GAJI ===");
        System.out.println("Gaji awal Iqbal: Rp" + emp1.getSalary());
        service.raiseSalary(1, 10); // Naik gaji 10% buat ID 1 (Iqbal)
        System.out.println("Gaji Iqbal setelah naik 10%: Rp" + service.getEmployee(1).getSalary());

        // 4. PEMBUKTIAN SOAL B.1 (Static Method)
        System.out.println("\n=== TES STATIC METHOD ===");
        // panggil method-nya langsung dari nama Class (Employee), bukan dari objek (emp1/emp2)
        System.out.println("Total Karyawan yang terdaftar saat ini: " + Employee.getTotalEmployee() + " orang.");
    }
}