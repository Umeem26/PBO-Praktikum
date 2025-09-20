public class Food extends Goods {
    private int calories;

    // Constructor untuk Food
    public Food(String description, double price, int calories) {
        // untuk mengisi description dan price.
        super(description, price);
        this.calories = calories;
    }

    // Meng-override metode display() milik Goods
    @Override
    public void display() {
        // Memanggil metode display() asli dari Goods terlebih dahulu
        super.display();
        // Kemudian menambahkan informasi baru
        System.out.println("Kalori: " + calories);
    }
}