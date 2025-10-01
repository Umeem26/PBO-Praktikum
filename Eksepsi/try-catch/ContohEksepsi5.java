class ContohEksepsi5 {
    public static void main(String[] args) {
        int pembilang = 5;
        int penyebut = 0;
        try {
            int hasil = pembilang / penyebut; // akan timbul eksepsi
            System.out.println("hasil = " + hasil);
        }
        catch (Exception x) {
            x.printStackTrace();
        }
        System.out.println("statemen setelah blok try catch");
    }
}