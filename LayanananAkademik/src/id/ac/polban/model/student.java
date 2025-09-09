package id.ac.polban.model;

public class student {
    private String studentId;
    private String name;

    public student(String studentId, String name) {
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
        return "student ID: " + studentId + ", Name: " + name;
    }
}