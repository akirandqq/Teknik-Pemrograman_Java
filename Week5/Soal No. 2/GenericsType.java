public class GenericsType<T> { // <T> adalah Type Parameter 
    private T t; 

    public T get() { 
        return this.t; 
    }

    public void set(T t1) { 
        this.t = t1; 
    }

    public static void main(String args[]) { 
        // 1. Menggunakan Generics dengan tipe String secara spesifik 
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); // valid 
        System.out.println("Nilai type (Generics String): " + type.get());

        // 2. Menggunakan Raw Type (kembali seperti cara lama tanpa <T>) 
        GenericsType type1 = new GenericsType(); // raw type 
        type1.set("Java"); // valid [cite: 729]
        System.out.println("Nilai type1 (Raw Type - String): " + type1.get());

        // 3. Autoboxing pada Raw Type 
        type1.set(10); // valid and autoboxing support 
        System.out.println("Nilai type1 (Raw Type - Integer): " + type1.get());
    }
}