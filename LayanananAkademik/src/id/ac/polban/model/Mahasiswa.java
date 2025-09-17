package id.ac.polban.model;

public class Mahasiswa {
    private String studentId;
    private String name;

    public Mahasiswa(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mahasiswa [ID=" + studentId + ", Nama=" + name + "]";
    }
}