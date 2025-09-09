package id.ac.polban.service;

import id.ac.polban.model.course;
import id.ac.polban.model.student;

public class main {
    public static void main(String[] args) {
        // 1. Membuat beberapa objek Mahasiswa
        // Menggunakan method static dari studentidgenerator
        student student1 = new student(studentidgenerator.generateNewId(), "Budi Santoso");
        student student2 = new student(studentidgenerator.generateNewId(), "Citra Lestari");
        student student3 = new student(studentidgenerator.generateNewId(), "Dewi Anggraini");

        // 2. Membuat objek Mata Kuliah
        course oopCourse = new course("IF101", "Object-Oriented Programming");

        // 3. Menambahkan mahasiswa ke mata kuliah (Implementasi Agregasi)
        oopCourse.addStudent(student1);
        oopCourse.addStudent(student2);
        oopCourse.addStudent(student3);

        // 4. Membuat objek untuk mencetak laporan
        reportprinter printer = new reportprinter();

        // 5. Mencetak laporan (Implementasi Dependency)
        printer.printCourseReport(oopCourse);

        // Bukti bahwa student tetap ada meskipun course tidak lagi digunakan
        System.out.println("\nMahasiswa berikut masih terdata di sistem:");
        System.out.println(student1.getName());
    }
}