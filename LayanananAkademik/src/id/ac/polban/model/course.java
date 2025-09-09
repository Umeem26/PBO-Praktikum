package id.ac.polban.model;

import java.util.ArrayList;
import java.util.List;

public class course {
    private String courseName;
    private String courseCode;
    // Agregasi: course 'memiliki' daftar student, tetapi student bisa ada tanpa course
    private List<student> enrolledStudents;

    public course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(student student) {
        this.enrolledStudents.add(student);
    }

    public List<student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public String getCourseName() {
        return courseName;
    }
}