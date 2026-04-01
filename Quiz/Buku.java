package Quiz;

public class Buku {
    String kode;
    String judul;
    String penulis;
    boolean sedangDipinjam;

    public Buku(String kode, String judul, String penulis) {
        this.kode = kode;
        this.judul = judul;
        this.penulis = penulis;
        this.sedangDipinjam = false;
    }
}