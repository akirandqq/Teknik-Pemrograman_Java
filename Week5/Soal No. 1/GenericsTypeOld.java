public class GenericsTypeOld {
    private Object t;

    public Object get() {
        return t;
    }

    public void set(Object t) {
        this.t = t;
    }

    public static void main(String args[]) {
        GenericsTypeOld type = new GenericsTypeOld();
        
        // Memasukkan nilai bertipe String
        type.set("Java");
        
        // Harus melakukan Type Casting secara manual
        String str = (String) type.get(); 
        
        // Tambahan agar ada output saat di-run
        System.out.println("Nilai yang diambil: " + str);
    }
}