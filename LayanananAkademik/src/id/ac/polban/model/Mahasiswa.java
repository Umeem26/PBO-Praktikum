package id.ac.polban.model;

public class Mahasiswa extends Orang {
    private String studentId;

    public Mahasiswa(String studentId, String nama) {
        super(nama);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void tampilkanProfil() {
        System.out.println("Profil Mahasiswa: " + getNama() + " (NIM: " + this.studentId + ")");
    }
}