package id.ac.polban.service;

import id.ac.polban.model.Course;
import id.ac.polban.model.Mahasiswa;
import id.ac.polban.model.MahasiswaBeasiswa;
import id.ac.polban.service.ReportPrinter; 

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(StudentIdGenerator.generateNewId(), "Budi Santoso");
        
        MahasiswaBeasiswa mhs2_beasiswa = new MahasiswaBeasiswa(
            StudentIdGenerator.generateNewId(), 
            "Dewi Anggraini", 
            "Bidikmisi"
        );
        
        System.out.println("--- DEMO toString() ---");
        System.out.println(mhs1.toString()); /
        System.out.println(mhs2_beasiswa.toString()); 
        System.out.println("-----------------------\n");

        // Membuat objek Mata Kuliah
        Course oopCourse = new Course("IF101", "Object-Oriented Programming");

        oopCourse.addStudent(mhs1);
        oopCourse.addStudent(mhs2_beasiswa); 

        ReportPrinter printer = new ReportPrinter();
        printer.printCourseReport(oopCourse);
    }
}