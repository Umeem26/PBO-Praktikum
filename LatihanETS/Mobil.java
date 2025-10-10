class Mesin {
    private String jenis;
    public Mesin(String jenis) { this.jenis = jenis; }
    public String getJenis() { return jenis; }
}

class Roda {
    private int ukuran;
    public Roda(int ukuran) { this.ukuran = ukuran; }
    public int getUkuran() { return ukuran; }
}

public class Mobil {
    private String merk;
    private Mesin mesin;
    private Roda[] roda;

    // Konstruktor Mobil yang langsung menciptakan Mesin dan Roda (Composition)
    public Mobil(String merk, String jenisMesin, int jumlahRoda, int ukuranRoda) {
        this.merk = merk;
        this.mesin = new Mesin(jenisMesin);
        this.roda = new Roda[jumlahRoda];
        for (int i = 0; i < jumlahRoda; i++) {
            this.roda[i] = new Roda(ukuranRoda);
        }
    }

    public Mesin getMesin() { return mesin; }
    public Roda[] getRoda() { return roda; }

    public void display() {
        System.out.println("    - Merk Mobil: " + merk);
        System.out.println("    - Jenis Mesin: " + mesin.getJenis());
        System.out.println("    - Jumlah Roda: " + roda.length + " (ukuran " + roda[0].getUkuran() + " inch)");
    }
}