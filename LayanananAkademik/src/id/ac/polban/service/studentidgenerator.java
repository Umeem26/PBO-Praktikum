package id.ac.polban.service;

public class StudentIdGenerator { 
    private static int nextId = 2024001;
    public static String generateNewId() {
        return "MHS-" + nextId++;
    }
}