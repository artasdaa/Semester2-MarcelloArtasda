package CM1;

public class Mahasiswa {
    String nim, nama, prodi;

    //constructor
    Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    //method tampil
    void tampil() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}