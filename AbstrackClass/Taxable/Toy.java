public class Toy extends Goods implements Taxable {
    private int minimumAge;

    public Toy(String description, double price, int minimumAge) {
        // Memanggil constructor dari superclass (Goods)
        super(description, price);
        this.minimumAge = minimumAge;
    }

    // Ini adalah implementasi WAJIB dari interface Taxable
    @Override
    public double calculateTax() {
        // Pajak = harga * tarif pajak (dari interface Taxable)
        return getPrice() * taxRate;
    }

    @Override
    public void display() {
        super.display(); // Memanggil display() dari Goods
        System.out.println("Usia Minimum: " + minimumAge);
    }
}