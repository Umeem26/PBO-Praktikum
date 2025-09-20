public class TestGoods {
    public static void main(String[] args) {
        // Membuat array untuk menampung berbagai jenis Goods
        Goods[] items = new Goods[3];
        items[0] = new Food("Apel", 2500, 95);
        items[1] = new Toy("Lego Set", 750000, 8);
        items[2] = new Book("The Hobbit", 150000, "J.R.R. Tolkien");

        System.out.println("🛒 DAFTAR BARANG 🛒");

        // Loop melalui setiap item di dalam array
        for (Goods item : items) {
            System.out.println("--------------------");
            item.display();

            // Cek apakah item ini mengimplementasikan interface Taxable
            if (item instanceof Taxable) {
                Taxable taxableItem = (Taxable) item;
                double tax = taxableItem.calculateTax();
                System.out.println("Pajak (6%): Rp" + String.format("%,.2f", tax));
            } else {
                System.out.println("Item ini tidak kena pajak.");
            }
        }
        System.out.println("--------------------");
    }
}