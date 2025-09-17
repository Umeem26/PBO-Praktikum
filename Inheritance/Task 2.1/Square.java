// File: Square.java
public class Square extends Rectangle {

    public Square() { // Constructor no-arg
        super();
    }

    public Square(double side) {
        super(side, side); // Memanggil constructor Rectangle(width, length) 
    }

    public Square(double side, String color, boolean filled) { // Constructor lengkap
        super(side, side, color, filled);
    }
    
    // Getter untuk side
    public double getSide() {
        return getWidth(); // Side bisa diambil dari width atau length
    }

    // Setter untuk side, harus mengubah keduanya
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setWidth() dan setLength() agar tetap menjadi persegi 
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }
    
    // Override toString() [cite: 226]
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}