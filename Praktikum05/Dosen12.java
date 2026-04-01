package Praktikum05;

public class Dosen12 {
    String nidn, nama;
    int usia;

    Dosen12(String nidn, String nama, int usia) {
        this.nidn = nidn;
        this.nama = nama;
        this.usia = usia;
    }

    void tampil() {
        System.out.println(nidn + " | " + nama + " | " + usia);
    }
}