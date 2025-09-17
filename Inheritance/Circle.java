public class Circle {
    // Variabel instance
    private double radius;
    private String color;

    // 2. Constructors
    public Circle() { 
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) { 
        this.radius = radius;
        this.color = "red";
    }
    
    // Constructor yang ditambahkan
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter dan Setter
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    // Getter dan Setter untuk color 
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Method lainnya
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}