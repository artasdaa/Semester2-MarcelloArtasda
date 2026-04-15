package CM1;

public class Buku {
    String kodeBuku, judul;
    int tahunTerbit;

    //method constructor
    Buku(String kodeBuku, String judul, int tahunTerbit) {
        this.kodeBuku = kodeBuku; //nilai parameter
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    //method tampil
    void tampil() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}