public abstract class Employee {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private Department department; 

    public Employee(String nama, String jabatan, Department department) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = tentukanGajiPokok(jabatan);
        this.department = department; 
    }

    private double tentukanGajiPokok(String jabatan) {
        switch (jabatan.toLowerCase()) {
            case "staf manager":
                return 5000000;
            case "staf programmer":
                return 3000000;
            case "staf analis":
                return 3000000;
            default:
                return 2500000;
        }
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public Department getDepartment() {
        return department;
    }

    public abstract double hitungGajiTotal();
}