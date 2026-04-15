package CM1;

public class Peminjaman {
    Mahasiswa mhs;
    Buku buku;
    int lamaPinjam;
    int terlambat;
    int denda;

    //konstanta
    final int batasPinjam = 5;
    final int dendaPerHari = 2000;

    //Constructor
    Peminjaman(Mahasiswa mhs, Buku buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    //method
    void hitungDenda() {
        if (lamaPinjam > batasPinjam) {
            terlambat = lamaPinjam - batasPinjam;
            denda = terlambat * dendaPerHari;
        } else {
            terlambat = 0;
            denda = 0;
        }
    }

    //method
    void tampil() {
        System.out.println(
            mhs.nama + " | " + buku.judul +
            " | Lama: " + lamaPinjam +
            " | Terlambat: " + terlambat +
            " | Denda: " + denda
        );
    }
}
