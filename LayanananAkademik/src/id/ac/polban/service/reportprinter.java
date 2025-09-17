// Lokasi: src/id/ac/polban/service/ReportPrinter.java
package id.ac.polban.service;

import id.ac.polban.model.Course;
import id.ac.polban.model.Mahasiswa;
import java.util.List;

public class ReportPrinter {
    public void printCourseReport(Course course) {
        System.out.println("=========================================");
        System.out.println("Laporan Mata Kuliah: " + course.getCourseName());
        System.out.println("-----------------------------------------");
        
        List<Mahasiswa> students = course.getEnrolledStudents();
        if (students.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang mendaftar.");
        } else {
            for (Mahasiswa student : students) {
                System.out.println("- " + student.toString());
            }
        }
        System.out.println("=========================================");
    }
}