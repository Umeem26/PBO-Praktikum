// File: Shape.java
public class Shape {
    private String color;
    private boolean filled;

    public Shape() { // Constructor no-arg [cite: 203]
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) { // Constructor dengan argumen [cite: 203]
        this.color = color;
        this.filled = filled;
    }
    
    // Getter dan Setter [cite: 204]
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() { // Getter untuk boolean menggunakan "is" [cite: 204]
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Method toString() [cite: 205]
    @Override
    public String toString() {
        return "A Shape with color of " + color + " and " + (filled ? "filled" : "Not filled");
    }
}