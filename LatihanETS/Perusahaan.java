import java.util.ArrayList;

public class Perusahaan {
    private String nama;
    private ArrayList<Karyawan> daftarKaryawan;

    public Perusahaan(String nama) {
        this.nama = nama;
        this.daftarKaryawan = new ArrayList<>();
    }

    public void tambahKaryawan(Karyawan karyawan) {
        this.daftarKaryawan.add(karyawan);
    }

    public ArrayList<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }

    // METHOD OVERLOADING 1: Menampilkan semua info
    public void displayInfo() {
        System.out.println("Profil Perusahaan: " + nama);
        System.out.println("Daftar Karyawan:");
        for (Karyawan k : daftarKaryawan) {
            k.display();
            System.out.println("  --------------------");
        }
    }
    
    // METHOD OVERLOADING 2: Menampilkan info karyawan berdasarkan tipe
    public void displayInfo(String tipe) {
        System.out.println("Daftar Karyawan Tipe: " + tipe);
        for (Karyawan k : daftarKaryawan) {
            if (tipe.equalsIgnoreCase("tetap") && k instanceof KaryawanTetap) {
                k.display();
            } else if (tipe.equalsIgnoreCase("tidak tetap") && k instanceof KaryawanTidakTetap) {
                k.display();
            }
        }
         System.out.println("  --------------------");
    }
}