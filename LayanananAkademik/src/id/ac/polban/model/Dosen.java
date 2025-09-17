package id.ac.polban.model;

public class Dosen extends Orang implements IPengajar {
    private String kodeDosen;

    public Dosen(String kodeDosen, String nama) {
        super(nama); 
        this.kodeDosen = kodeDosen;
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("Profil Dosen: " + getNama() + " (Kode: " + this.kodeDosen + ")");
    }

    @Override
    public void mengajar(String mataKuliah) {
        System.out.println(getNama() + " sedang mengajar mata kuliah " + mataKuliah);
    }

    @Override
    public void memberiNilai(Mahasiswa mahasiswa, int nilai) {
        System.out.println(getNama() + " memberi nilai " + nilai + " kepada " + mahasiswa.getNama());
    }
}