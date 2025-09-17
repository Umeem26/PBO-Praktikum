package id.ac.polban.service;

import id.ac.polban.model.Dosen;
import id.ac.polban.model.Mahasiswa;
import id.ac.polban.model.Orang;

public class Main {
    public static void main(String[] args) {
        Orang mhs1 = new Mahasiswa("MHS-2024001", "Budi Santoso");
        Dosen dosen1 = new Dosen("DSN-007", "Dr. Retno Wulandari");

        System.out.println("--- Demo Polimorfisme dari Abstract Method ---");
        mhs1.tampilkanProfil();
        dosen1.tampilkanProfil();
        System.out.println("------------------------------------------\n");

        System.out.println("--- Demo Penggunaan Interface IPengajar ---");
        dosen1.mengajar("Pemrograman Berorientasi Objek");
        dosen1.memberiNilai((Mahasiswa) mhs1, 90);
        System.out.println("-----------------------------------------\n");
    }
}