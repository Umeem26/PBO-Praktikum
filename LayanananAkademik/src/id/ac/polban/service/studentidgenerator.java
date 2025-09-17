package id.ac.polban.service;

public class studentidgenerator {
    private static int nextId = 2024001;
    public static String generateNewId() {
        return "MHS-" + nextId++;
    }
}