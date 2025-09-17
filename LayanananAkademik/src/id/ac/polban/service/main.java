package id.ac.polban.service;

import id.ac.polban.model.course;
import id.ac.polban.model.student;

public class main {
    public static void main(String[] args) {
        student student1 = new student(studentidgenerator.generateNewId(), "Budi Santoso");
        student student2 = new student(studentidgenerator.generateNewId(), "Citra Lestari");
        student student3 = new student(studentidgenerator.generateNewId(), "Dewi Anggraini");

        course oopCourse = new course("IF101", "Object-Oriented Programming");

        oopCourse.addStudent(student1);
        oopCourse.addStudent(student2);
        oopCourse.addStudent(student3);

        reportprinter printer = new reportprinter();

        printer.printCourseReport(oopCourse);

        System.out.println("\nMahasiswa berikut masih terdata di sistem:");
        System.out.println(student1.getName());
    }
}