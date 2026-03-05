import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // Menggunakan tipe objek Integer, bukan tipe primitif int
        Integer[] intList; 
        int size;
        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt(); // Autoboxing otomatis mengubah int ke Integer
        }

        // Memanggil insertionSort yang sudah diubah jadi descending
        Sorting.insertionSort(intList);

        System.out.println("\nYour numbers in sorted (descending) order...");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + "  ");
        }
        System.out.println();
    }
}