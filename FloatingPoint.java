public class FloatingPoint {
    public static void main(String[] args) {
        // Variabel double yang akan dibulatkan
        double x = 92.98;

        // Proses pembulatan:
        // 1. Math.round(92.98) menghasilkan nilai long 93L.
        // 2. (int) mengonversi (cast) nilai long tersebut menjadi int.
        int nx = (int) Math.round(x);

        // Menampilkan nilai akhir dari nx
        System.out.println("Nilai awal x: " + x);
        System.out.println("Nilai nx setelah pembulatan: " + nx);
    }
}