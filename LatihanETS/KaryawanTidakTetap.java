public class KaryawanTidakTetap extends Karyawan {
    public KaryawanTidakTetap(String nama, String id) {
        super(nama, id);
    }

    @Override
    public void display() {
        System.out.println("  Karyawan Tidak Tetap");
        System.out.println("  ID   : " + id);
        System.out.println("  Nama : " + nama);
    }
}