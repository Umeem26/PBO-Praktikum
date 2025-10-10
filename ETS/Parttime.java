public class Parttime extends Employee {
    private int jamLembur;

    public Parttime(String nama, String jabatan, Department department, int jamLembur) {
        super(nama, jabatan, department);
        this.jamLembur = jamLembur;
    }

    private double hitungTunjanganLembur() {
        return this.jamLembur * 30000;
    }

    @Override
    public double hitungGajiTotal() {
        return getGajiPokok() + hitungTunjanganLembur();
    }

    public void displayRincianGaji() {
        System.out.println("Gaji Pokok: Rp " + String.format("%,.0f", getGajiPokok()));
        System.out.println("Lembur (" + this.jamLembur + " jam): Rp " + String.format("%,.0f", hitungTunjanganLembur()));
    }
}