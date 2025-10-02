// PaintThings.java
// Computes the amount of paint needed to paint various things.
import java.text.DecimalFormat;

public class PaintThings
{
    public static void main (String[] args)
    {
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        // PERUBAHAN: Variabel dideklarasikan dan diinisialisasi
        Rectangle deck;
        Sphere bigBall;
        Cylinder tank;
        
        double deckAmt, ballAmt, tankAmt;
        
        // Membuat tiga objek bentuk
        deck = new Rectangle(20, 35);
        bigBall = new Sphere(15);
        tank = new Cylinder(10, 30);
        
        // Menghitung jumlah cat yang dibutuhkan untuk setiap bentuk
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);
        
        // Mencetak jumlah cat untuk setiap bentuk
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println ("\nNumber of gallons of paint needed...");
        System.out.println ("Deck " + fmt.format(deckAmt));
        System.out.println ("Big Ball " + fmt.format(ballAmt));
        System.out.println ("Tank " + fmt.format(tankAmt));
    }
}