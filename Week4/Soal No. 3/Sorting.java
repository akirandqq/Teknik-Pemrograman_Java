public class Sorting {
    // 1. Selection Sort (Ascending / Naik) - Kode bawaan modul
    public static void selectionSort(Comparable[] list) {
        int min;
        Comparable temp;
        for (int index = 0; index < list.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++) {
                if (list[scan].compareTo(list[min]) < 0) {
                    min = scan;
                }
            }
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    // 2. Insertion Sort (Descending / Menurun) - Sesuai instruksi No 4
    public static void insertionSort(Comparable[] list) {
        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;
            // Tanda < diubah menjadi > agar mengurutkan dari besar ke kecil
            while (position > 0 && key.compareTo(list[position - 1]) > 0) {
                list[position] = list[position - 1];
                position--;
            }
            list[position] = key;
        }
    }
}