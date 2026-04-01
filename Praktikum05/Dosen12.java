package Praktikum05;
    
public class Dosen12 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    Dosen12(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    void tampil() {
        String jk = (jenisKelamin) ? "Laki-laki" : "Perempuan";
        System.out.println("Kode: " + kode + " | Nama: " + nama + 
                           " | Gender: " + jk + " | Usia: " + usia);
    }
}
