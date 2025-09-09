// Kita bisa mengimpor kelas dari dalam file JAR
import id.ac.polban.model.student;
import id.ac.polban.service.studentidgenerator;

public class MainApp {
    public static void main(String[] args) {
        System.out.println(">>> Menjalankan aplikasi dari proyek terpisah <<<");
        System.out.println("Menggunakan fungsionalitas dari LayananAkademik.jar");

        // Membuat mahasiswa baru menggunakan kelas dari JAR
        student mhsBaru1 = new student(studentidgenerator.generateNewId(), "Zahra Aulia");
        student mhsBaru2 = new student(studentidgenerator.generateNewId(), "Fajar Nugraha");

        System.out.println("\nMahasiswa baru berhasil dibuat:");
        System.out.println(mhsBaru1);
        System.out.println(mhsBaru2);

        // Perhatikan bahwa ID mahasiswa melanjutkan dari run sebelumnya jika
        // aplikasi JAR dijalankan dalam proses yang sama (jarang terjadi di dunia nyata,
        // tetapi ini menunjukkan state `static` akan di-reset setiap kali JVM baru dimulai).
    }
}