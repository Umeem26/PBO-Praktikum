package id.ac.polban.service;

public class studentidgenerator {
    // Variabel static: hanya ada satu salinan untuk seluruh kelas, bukan per objek.
    private static int nextId = 2024001;

    // Method static: bisa dipanggil tanpa membuat instance dari kelas studentidgenerator.
    public static String generateNewId() {
        return "MHS-" + nextId++;
    }
}