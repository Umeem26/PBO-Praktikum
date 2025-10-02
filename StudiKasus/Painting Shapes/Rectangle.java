// Rectangle.java
// Represents a rectangle shape.
public class Rectangle extends Shape {
    private double length;
    private double width;

    /**
     * Constructor: Mengatur persegi panjang.
     * @param l Panjang
     * @param w Lebar
     */
    public Rectangle(double l, double w) {
        super("Rectangle");
        this.length = l;
        this.width = w;
    }

    /**
     * Menghitung dan mengembalikan luas persegi panjang.
     * @return Luas persegi panjang
     */
    @Override
    public double area() {
        return length * width;
    }

    /**
     * Mengembalikan representasi string dari persegi panjang.
     * @return String deskripsi objek
     */
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}