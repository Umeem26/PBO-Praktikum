public class KaryawanTetap extends Karyawan {
    private Mobil mobilDijual;

    // Konstruktor subclass yang memanggil konstruktor superclass
    public KaryawanTetap(String nama, String id) {
        super(nama, id);
    }

    // Setter
    public void setMobilDijual(Mobil mobil) {
        this.mobilDijual = mobil;
    }

    // Getter
    public Mobil getMobilDijual() {
        return mobilDijual;
    }

    @Override
    public void display() {
        System.out.println("  Karyawan Tetap");
        System.out.println("  ID   : " + id);
        System.out.println("  Nama : " + nama);
        if (mobilDijual != null) {
            System.out.println("  Menjual Mobil:");
            mobilDijual.display();
        }
    }
}