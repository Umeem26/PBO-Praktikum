// Lokasi: src/id/ac/polban/model/Course.java
package id.ac.polban.model;

import id.ac.polban.model.Mahasiswa;
import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseCode;
    private List<Mahasiswa> enrolledStudents;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Mahasiswa mahasiswa) {
        this.enrolledStudents.add(mahasiswa);
    }

    public List<Mahasiswa> getEnrolledStudents() {
        return enrolledStudents;
    }
    
    public String getCourseName() {
        return courseName;
    }
}