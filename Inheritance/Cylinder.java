public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super(); 
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    // Getter
    public double getHeight() {
        return this.height;
    }

    // Override getArea() 
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * height + 2 * super.getArea();
    }

    // Perbaikan getVolume() 
    public double getVolume() {
        return super.getArea() * height;
    }

    // Override toString() 
    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() 
                + " height=" + height;
    }
}