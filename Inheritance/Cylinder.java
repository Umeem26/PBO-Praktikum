// File: Cylinder.java
public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super(); // Memanggil constructor default dari Circle
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius); // Memanggil constructor Circle(radius)
        this.height = height;
    }

    // Getter
    public double getHeight() {
        return this.height;
    }

    // Sesuai Task 1.2: Override getArea() untuk menghitung luas permukaan silinder 
    @Override
    public double getArea() {
        // Luas permukaan silinder = 2 * PI * r * h + 2 * luas alas
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Sesuai Task 1.2: Perbaikan getVolume() 
    public double getVolume() {
        // Volume = luas alas * tinggi. Gunakan getArea() dari superclass.
        return super.getArea() * height;
    }

    // Sesuai Task 1.3: Override toString() [cite: 137]
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() // Memanggil toString() dari Circle 
                + " height=" + height;
    }
}