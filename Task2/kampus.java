public class kampus {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        mahasiswa mhs1 = new mahasiswa();
        mhs1.setNama("Hisyam Khaeru Umam");
        mhs1.setNim("241511078");
        mhs1.setProdi("D3-Teknik Informatika");

        // Membuat objek Mata Kuliah
        matakuliah mk1 = new matakuliah();
        mk1.setDosenMK("Ardhian Ekawijana, S.T., M.T");
        mk1.setNamaMK("Pemrograman Berorientasi Objek");
        mk1.setSks(4);

        // Menampilkan data 
        System.out.println("====== DETAIL PENGAMBILAN MATA KULIAH ======");
        System.out.println("Nama mahasiswa: " + mhs1.getNama());
        System.out.println("NIM: " + mhs1.getNim());
        System.out.println("Prodi: " + mhs1.getProdi());
        System.out.println("\nMengambil Mata Kuliah:");
        System.out.println("Nama Dosen: " + mk1.getDosenMK());
        System.out.println("Nama Mata Kuliah: " + mk1.getNamaMK());
        System.out.println("SKS: " + mk1.getSks());
        System.out.println("============================================");
    }
}
