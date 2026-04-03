public class Employee {
    private String name;
    private int salary;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter untuk Nama
    public String getName() {
        return name;
    }

    // Getter untuk Salary
    public int getSalary() {
        return salary;
    }

    // Override toString agar outputnya sesuai format jobsheet
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}