// File: Circle.java
public class Circle {
    // 1. Variabel instance
    private double radius;
    private String color;

    // 2. Constructors
    public Circle() { // Constructor default
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) { // Constructor dengan radius
        this.radius = radius;
        this.color = "red";
    }
    
    // Constructor yang ditambahkan sesuai Task 1.1 [cite: 69]
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // 3. Getter dan Setter
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter dan Setter untuk color sesuai Task 1.1 [cite: 70]
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 4. Method lainnya
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}