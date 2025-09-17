package id.ac.polban.model;

public class MahasiswaBeasiswa extends Mahasiswa {
    
    private String jenisBeasiswa;

    public MahasiswaBeasiswa(String studentId, String name, String jenisBeasiswa) {
        super(studentId, name); 
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public String getJenisBeasiswa() {
        return jenisBeasiswa;
    }

    @Override
    public String toString() {
        return super.toString() + " [Beasiswa: " + this.jenisBeasiswa + "]";
    }
}