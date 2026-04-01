package Quiz;

public class Perpustakaan {
    Buku[] daftarBuku = new Buku[10];
    Mahasiswa[] daftarMahasiswa = new Mahasiswa[10];
    int jumlahBuku = 0;
    int jumlahMahasiswa = 0;

    public void tambahBuku(Buku buku) {
        daftarBuku[jumlahBuku++] = buku;
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tambahMahasiswa(Mahasiswa mhs) {
        daftarMahasiswa[jumlahMahasiswa++] = mhs;
        System.out.println("Mahasiswa berhasil ditambahkan!");
    }

    public Buku cariBuku(String kode) {
        for (int i = 0; i < jumlahBuku; i++) {
            if (daftarBuku[i].kode.equals(kode)) {
                return daftarBuku[i];
            }
        }
        return null;
    }

    public Mahasiswa cariMahasiswa(String nim) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].nim.equals(nim)) {
                return daftarMahasiswa[i];
            }
        }
        return null;
    }

    public void tampilkanPeminjaman() {
        System.out.println("\nDaftar Peminjaman Buku:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (daftarMahasiswa[i].jumlahPinjam > 0) {
                for (int j = 0; j < daftarMahasiswa[i].jumlahPinjam; j++) {
                    System.out.println(daftarMahasiswa[i].nama + " meminjam: "
                            + daftarMahasiswa[i].bukuDipinjam[j].judul);
                }
            }
        }
    }
}