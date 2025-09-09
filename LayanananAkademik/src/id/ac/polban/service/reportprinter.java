package id.ac.polban.service;

import id.ac.polban.model.course;
import id.ac.polban.model.student;
import java.util.List;

public class reportprinter {
    
    // Dependency: Method ini 'menggunakan' (bergantung pada) objek course untuk bekerja.
    // course tidak disimpan sebagai field di dalam reportprinter.
    public void printCourseReport(course course) {
        System.out.println("=========================================");
        System.out.println("Laporan Mata Kuliah: " + course.getCourseName());
        System.out.println("-----------------------------------------");
        
        List<student> students = course.getEnrolledStudents();
        if (students.isEmpty()) {
            System.out.println("Belum ada mahasiswa yang mendaftar.");
        } else {
            for (student student : students) {
                System.out.println("- " + student.toString());
            }
        }
        System.out.println("=========================================");
    }
}