// File: TestShape.java
public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Shape("blue", false);
        System.out.println("Shape 1: " + shape1.toString());
        System.out.println("------------------------------------");

        Circle circle1 = new Circle(5.5, "yellow", true);
        System.out.println("Circle 1: " + circle1.toString());
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("------------------------------------");

        Rectangle rect1 = new Rectangle(4.0, 6.0, "purple", true);
        System.out.println("Rectangle 1: " + rect1.toString());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());
        System.out.println("------------------------------------");

        Square square1 = new Square(5.0, "black", false);
        System.out.println("Square 1: " + square1.toString());
        System.out.println("Area: " + square1.getArea()); // Method dari Rectangle
        System.out.println("Perimeter: " + square1.getPerimeter()); // Method dari Rectangle
        
        // Coba ubah salah satu sisi
        square1.setLength(7.0);
        System.out.println("After setLength(7.0), side is: " + square1.getSide());
        System.out.println("New toString(): " + square1.toString());
    }
}