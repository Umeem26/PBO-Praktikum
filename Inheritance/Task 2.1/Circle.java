// File: Circle.java
public class Circle extends Shape {
    private double radius;

    public Circle() { // Constructor no-arg [cite: 209]
        super();
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) { // Constructor lengkap [cite: 167]
        super(color, filled);
        this.radius = radius;
    }

    // Getter dan Setter untuk radius [cite: 209]
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method getArea() dan getPerimeter() [cite: 210]
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
    // Override toString() [cite: 211]
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}