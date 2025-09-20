public class Goods {
    private String description;
    private double price;

    // Constructor untuk membuat objek Goods baru
    public Goods(String description, double price) {
        this.description = description;
        this.price = price;
    }

    // Metode untuk menampilkan detail barang
    public void display() {
        System.out.println("Deskripsi: " + description + ", Harga: Rp" + String.format("%,.2f", price));
    }

    // Getter ini penting agar subkelas bisa mengakses harga
    public double getPrice() {
        return price;
    }
}