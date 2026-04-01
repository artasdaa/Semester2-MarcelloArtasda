package Quiz;

public class Mahasiswa {
    String nim;
    String nama;
    Buku[] bukuDipinjam = new Buku[2];
    int jumlahPinjam = 0;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public boolean pinjamBuku(Buku buku) {
        if (jumlahPinjam >= 2) {
            System.out.println("Gagal meminjam buku: batas maksimal 2 buku.");
            return false;
        }

        if (buku.sedangDipinjam) {
            System.out.println("Gagal meminjam buku: " + buku.judul + " karena sudah dipinjam orang lain.");
            return false;
        }

        bukuDipinjam[jumlahPinjam++] = buku;
        buku.sedangDipinjam = true;

        System.out.println(nama + " berhasil meminjam " + buku.judul);
        return true;
    }

    public boolean kembalikanBuku(String kodeBuku) {
        for (int i = 0; i < jumlahPinjam; i++) {
            if (bukuDipinjam[i].kode.equals(kodeBuku)) {
                bukuDipinjam[i].sedangDipinjam = false;

                for (int j = i; j < jumlahPinjam - 1; j++) {
                    bukuDipinjam[j] = bukuDipinjam[j + 1];
                }

                bukuDipinjam[--jumlahPinjam] = null;
                System.out.println(nama + " berhasil mengembalikan " + kodeBuku);
                return true;
            }
        }
        return false;
    }
}