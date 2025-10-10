import java.util.Scanner;
import java.util.ArrayList;

public class MainProgram {
    public static void main(String[] args) {
        // PEMAKAIAN SCANNER
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama perusahaan: ");
        String namaPerusahaan = scanner.nextLine();

        // 1. Membuat Objek Perusahaan
        Perusahaan pt = new Perusahaan(namaPerusahaan);

        // 2. Membuat Objek Karyawan dan Mobil
        KaryawanTetap kt1 = new KaryawanTetap("Budi", "KT001");
        KaryawanTetap kt2 = new KaryawanTetap("Cindy", "KT002");
        KaryawanTidakTetap ktt1 = new KaryawanTidakTetap("Eka", "KTT01");

        Mobil mobil1 = new Mobil("Toyota Avanza", "1500cc Bensin", 4, 15);
        Mobil mobil2 = new Mobil("Honda Brio", "1200cc Bensin", 4, 14);

        // 3. Menghubungkan Objek (Karyawan Tetap menjual Mobil)
        kt1.setMobilDijual(mobil1);
        kt2.setMobilDijual(mobil2);
        
        // 4. Menambahkan Karyawan ke Perusahaan
        pt.tambahKaryawan(kt1);
        pt.tambahKaryawan(kt2);
        pt.tambahKaryawan(ktt1);

        System.out.println("\n===== Menampilkan Detail Perusahaan =====");
        pt.displayInfo(); // Memanggil method display tanpa parameter

        // 5. Menghitung jumlah setiap objek untuk tabel
        int jmlPerusahaan = 1;
        int jmlKaryTetap = 0;
        int jmlKaryTdkTetap = 0;
        int jmlMobil = 0;
        int jmlMesin = 0;
        int jmlRoda = 0;

        ArrayList<Karyawan> daftarKaryawan = pt.getDaftarKaryawan();
        for (Karyawan k : daftarKaryawan) {
            if (k instanceof KaryawanTetap) {
                jmlKaryTetap++;
                // Cast untuk mengakses method spesifik KaryawanTetap
                KaryawanTetap kt = (KaryawanTetap) k;
                if (kt.getMobilDijual() != null) {
                    jmlMobil++;
                    jmlMesin++; // Setiap mobil punya 1 mesin
                    jmlRoda += kt.getMobilDijual().getRoda().length;
                }
            } else if (k instanceof KaryawanTidakTetap) {
                jmlKaryTdkTetap++;
            }
        }

        // 6. Menampilkan tabel ringkasan
        System.out.println("\n===== Tabel Ringkasan Objek =====");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-12s | %-12s | %-12s | %-8s | %-8s | %-8s |\n", "Perusahaan", "Kary.Tetap", "Karyawan Tdk", "Mobil", "Mesin", "Roda");
        System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-12d | %-12d | %-12d | %-8d | %-8d | %-8d |\n", 
            jmlPerusahaan, jmlKaryTetap, jmlKaryTdkTetap, jmlMobil, jmlMesin, jmlRoda);
        System.out.println("-----------------------------------------------------------------------");

        scanner.close();
    }
}