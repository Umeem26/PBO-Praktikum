// File: TestCylinder.java
public class TestCylinder {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder 1: " + c1.toString());
        System.out.println("Radius is " + c1.getRadius());
        System.out.println("Height is " + c1.getHeight());
        System.out.println("Base area is " + c1.getArea()); // Akan memanggil getArea() yang di-override
        System.out.println("Volume is " + c1.getVolume());
        System.out.println("------------------------------------");

        Cylinder c2 = new Cylinder(2.0, 5.0);
        System.out.println("Cylinder 2: " + c2.toString());
        System.out.println("Radius is " + c2.getRadius());
        System.out.println("Height is " + c2.getHeight());
        System.out.println("Base area is " + c2.getArea());
        System.out.println("Volume is " + c2.getVolume());
    }
}