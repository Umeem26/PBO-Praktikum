public class matakuliah {

    private String dosenMK;
    private String namaMK;
    private int sks;

    public String getDosenMK() {
        return dosenMK;
    }

    public String getNamaMK() {
        return namaMK;
    }

    public int getSks() {
        return sks;
    }

    public void setDosenMK(String newDosen) {
        this.dosenMK = newDosen;
    }

    public void setNamaMK(String newNama) {
        this.namaMK = newNama;
    }

    public void setSks(int newSks) {
        if (newSks > 0) {
            this.sks = newSks;
        } 
        else {
            System.out.println("Error: SKS tidak boleh kurang dari 1.");
        }
    }
}