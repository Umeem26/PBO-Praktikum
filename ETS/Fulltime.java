public class Fulltime extends Employee implements Koperasi {
    private int jamLembur;
    private int jumlahAnak;
    private double cicilanKoperasi;

    public Fulltime(String nama, String jabatan, Department department, int jamLembur, int jumlahAnak, double cicilanKoperasi) {
        super(nama, jabatan, department); 
        this.jamLembur = jamLembur;
        this.jumlahAnak = jumlahAnak;
        this.cicilanKoperasi = cicilanKoperasi;
    }

    @Override
    public double hitungCicilanPinjaman() {
        return this.cicilanKoperasi;
    }

    private double hitungTunjanganJabatan() {
        switch (getJabatan().toLowerCase()) {
            case "staf manager":
                return 5000000;
            case "staf programmer":
                return 2000000;
            case "staf analis":
                return 3000000;
            default:
                return 0;
        }
    }

    private double hitungTunjanganKomunikasi() {
        return 500000;
    }

    private double hitungTunjanganAnak() {
        int anakYangDitanggung = Math.min(this.jumlahAnak, 2);
        return anakYangDitanggung * 500000;
    }

    private double hitungTunjanganLembur() {
        return this.jamLembur * 30000;
    }

    @Override
    public double hitungGajiTotal() {
        return getGajiPokok()
            + hitungTunjanganJabatan()
            + hitungTunjanganKomunikasi()
            + hitungTunjanganAnak()
            + hitungTunjanganLembur()
            - hitungCicilanPinjaman();
    }

    public void displayRincianGaji() {
        System.out.println("Gaji Pokok: Rp " + String.format("%,.0f", getGajiPokok()));
        System.out.println("Tunjangan Jabatan: Rp " + String.format("%,.0f", hitungTunjanganJabatan()));
        System.out.println("Tunjangan Komunikasi: Rp " + String.format("%,.0f", hitungTunjanganKomunikasi()));
        System.out.println("Tunjangan Anak (" + this.jumlahAnak + " anak): Rp " + String.format("%,.0f", hitungTunjanganAnak()));
        System.out.println("Lembur (" + this.jamLembur + " jam): Rp " + String.format("%,.0f", hitungTunjanganLembur()));
        System.out.println("Potongan Pinjaman Koperasi: Rp " + String.format("%,.0f", hitungCicilanPinjaman()));
    }
}