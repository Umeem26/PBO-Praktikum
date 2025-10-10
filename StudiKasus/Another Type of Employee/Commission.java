// Commission.java
// Merepresentasikan seorang karyawan per jam yang juga mendapatkan komisi.

public class Commission extends Hourly {
    private double totalSales;      // Total penjualan yang dibuat oleh karyawan
    private double commissionRate;  // Tingkat komisi (dalam desimal)

    /**
     * Constructor: Mengatur karyawan komisi dengan informasi yang diberikan.
     * @param eName Nama karyawan
     * @param eAddress Alamat karyawan
     * @param ePhone Nomor telepon karyawan
     * @param socSecNumber Nomor Jaminan Sosial
     * @param rate Tingkat upah per jam
     * @param comRate Tingkat komisi
     */
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double comRate) {
        // Memanggil constructor dari kelas induk (Hourly)
        super(eName, eAddress, ePhone, socSecNumber, rate);
        
        // Menginisialisasi variabel instance khusus untuk kelas Commission
        this.commissionRate = comRate;
        this.totalSales = 0;
    }

    /**
     * Menambahkan jumlah penjualan yang diberikan ke total penjualan karyawan.
     * @param sales Penjualan yang akan ditambahkan
     */
    public void addSales(double sales) {
        this.totalSales += sales;
    }

    /**
     * Menghitung dan mengembalikan gaji untuk karyawan komisi ini.
     * Gaji terdiri dari upah per jam ditambah komisi dari penjualan.
     * @return Total gaji karyawan
     */
    
    @Override
    public double pay() {
        // Memanggil metode pay() dari kelas induk (Hourly) 
        double hourlyPayment = super.pay();
        
        // Menghitung komisi
        double commissionPayment = totalSales * commissionRate;
        
        // Me-reset total penjualan setelah dibayarkan
        totalSales = 0;
        
        return hourlyPayment + commissionPayment;
    }

    /**
     * Mengembalikan informasi tentang karyawan ini sebagai sebuah string.
     * @return String representasi dari karyawan
     */
    @Override
    public String toString() {
        // Memanggil toString() dari kelas induk (Hourly)
        String result = super.toString();
        
        // Menambahkan informasi total penjualan
        result += "\nTotal Sales: " + totalSales;
        
        return result;
    }
}