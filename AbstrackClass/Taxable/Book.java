public class Book extends Goods implements Taxable {
    private String author;

    public Book(String description, double price, String author) {
        super(description, price); // Memanggil constructor Goods
        this.author = author;
    }

    // Implementasi WAJIB dari interface Taxable
    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }

    @Override
    public void display() {
        super.display(); // Memanggil display() dari Goods
        System.out.println("Penulis: " + this.author);
    }
}