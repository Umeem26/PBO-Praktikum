public abstract class Karyawan {
    protected String nama;
    protected String id;

    // Konstruktor untuk kelas dasar
    public Karyawan(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }

    // Method abstract yang harus diimplementasikan oleh subclass
    public abstract void display();
}