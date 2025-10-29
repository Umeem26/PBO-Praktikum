import java.util.ArrayList;
import java.util.Comparator;
import java.util.Vector;
import java.util.List;

public class StudentDemo {
    public static void main(String[] args) {
        
        // ==========================================================
        // Skenario 1: ArrayList dan Sorting berdasarkan Nama
        // ==========================================================
        System.out.println("--- 1. ArrayList (Diurutkan berdasarkan Nama) ---");
        
        // Membuat 5 objek student dan menambahkannya ke ArrayList
        List<Student<String>> studentList = new ArrayList<>();
        studentList.add(new Student<>("S001", "Zahra", "Teknik Elektro", "Bandung"));
        studentList.add(new Student<>("S002", "Budi", "Ilmu Komputer", "Jakarta"));
        studentList.add(new Student<>("S003", "Citra", "Akuntansi", "Surabaya"));
        studentList.add(new Student<>("S004", "Eka", "Ilmu Komputer", "Medan"));
        studentList.add(new Student<>("S005", "Arif", "Manajemen", "Bandung"));

        // Mengurutkan (sort) ArrayList berdasarkan nama (Name)
        studentList.sort(Comparator.comparing(Student::getName));

        for (Student<String> student : studentList) {
            System.out.println(student);
        }

        // ==========================================================
        // Skenario 2: Vector dan Filtering Department
        // ==========================================================
        System.out.println("\n--- 2. Vector (Filter 'Computer Science') ---");
        
        // Membuat 5 objek student dan menambahkannya ke Vector
        Vector<Student<String>> studentVector = new Vector<>();
        studentVector.add(new Student<>("V001", "Fahmi", "Computer Science", "Yogyakarta"));
        studentVector.add(new Student<>("V002", "Gina", "Sistem Informasi", "Semarang"));
        studentVector.add(new Student<>("V003", "Hadi", "Computer Science", "Makassar"));
        studentVector.add(new Student<>("V004", "Indah", "Teknik Fisika", "Bogor"));
        studentVector.add(new Student<>("V005", "Joko", "Computer Science", "Malang"));

        System.out.println("Menampilkan siswa dari 'Computer Science':");
        for (Student<String> student : studentVector) {
            if (student.getDepartment().equals("Computer Science")) {
                System.out.println(student);
            }
        }
    }
}