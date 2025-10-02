// Shape.java
// Represents a generic shape.
public abstract class Shape {
    protected String shapeName;

    /**
     * Constructor: Mengatur nama bentuk.
     * @param name Nama dari bentuk
     */
    public Shape(String name) {
        this.shapeName = name;
    }

    /**
     * Metode abstrak untuk menghitung luas.
     * Harus diimplementasikan oleh kelas turunan.
     * @return Luas dari bentuk
     */
    public abstract double area();

    /**
     * Mengembalikan nama bentuk sebagai string.
     * @return Nama bentuk
     */
    public String toString() {
        return shapeName;
    }
}