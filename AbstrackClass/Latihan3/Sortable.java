public abstract class Sortable {
    // Metode ini WAJIB diimplementasikan oleh kelas turunan
    // untuk menentukan logika perbandingan.
    public abstract int compare(Sortable b);

    // Metode ini bisa langsung dipakai untuk mengurutkan array
    // dari objek yang merupakan turunan Sortable.
    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }
                a[j] = temp;
            }
        }
    }
}