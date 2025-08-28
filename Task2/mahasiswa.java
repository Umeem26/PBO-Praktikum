public class mahasiswa {

    private String nama;
    private String nim;
    private String prodi;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public void setNama(String newNama) {
        this.nama = newNama;
    }

    public void setNim(String newNim) {

        if (newNim.length() == 9) {
            this.nim = newNim;
        } 
        else {
            System.out.println("Error: NIM harus 9 digit.");
        }
    }

    public void setProdi(String newProdi) {
        this.prodi = newProdi;
    }
}