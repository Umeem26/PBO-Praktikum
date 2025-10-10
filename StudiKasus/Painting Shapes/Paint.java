// Paint.java
// Represents a type of paint that has a fixed area
// covered by a gallon. All measurements are in feet.
public class Paint
{
    private double coverage; //number of square feet per gallon
    
    public Paint (double c)
    {
        coverage = c;
    }
    
    // Mengembalikan jumlah cat (dalam galon) yang dibutuhkan.
    public double amount (Shape s)
    {
        System.out.println ("Computing amount for " + s);
        return s.area() / coverage;
    }
}