// File: Rectangle.java
public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle() { // Constructor no-arg [cite: 214]
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) { // Constructor lengkap [cite: 184]
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    // Getter dan Setter [cite: 215]
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Method getArea() dan getPerimeter() [cite: 216]
    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Override toString() [cite: 217]
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}