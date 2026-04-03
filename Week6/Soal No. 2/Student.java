public class Student {
    private int id;
    private String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter untuk ID
    public int getId() {
        return id;
    }

    // Getter untuk Nama
    public String getName() {
        return name;
    }

    // Override toString agar outputnya persis kayak di jobsheet
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}