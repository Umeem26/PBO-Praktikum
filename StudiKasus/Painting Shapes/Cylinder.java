// Cylinder.java
// Represents a cylinder shape.
public class Cylinder extends Shape {
    private double radius;
    private double height;

    /**
     * Constructor: Mengatur silinder.
     * @param r Jari-jari
     * @param h Tinggi
     */
    public Cylinder(double r, double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }

    /**
     * Menghitung dan mengembalikan luas permukaan silinder.
     * @return Luas permukaan silinder
     */
    @Override
    public double area() {
        // CATATAN: Instruksi memberikan formula PI*radius^2*height,
        // yang sebenarnya adalah formula untuk VOLUME.
        // Kode ini mengikuti instruksi tersebut.
        // Formula luas permukaan yang benar adalah (2*Math.PI*radius*height + 2*Math.PI*radius*radius).
        return Math.PI * radius * radius * height;
    }

    /**
     * Mengembalikan representasi string dari silinder.
     * @return String deskripsi objek
     */
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}