package Quiz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Perpustakaan perpus = new Perpustakaan();
        int pilihan;

        do {
            System.out.println("\nMenu Perpustakaan:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Mahasiswa");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("5. Tampilkan Peminjaman");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("\nMasukkan kode buku: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan judul buku: ");
                    String judul = sc.nextLine();
                    System.out.print("Masukkan penulis: ");
                    String penulis = sc.nextLine();

                    perpus.tambahBuku(new Buku(kode, judul, penulis));
                    break;

                case 2:
                    System.out.print("\nMasukkan NIM mahasiswa: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = sc.nextLine();

                    perpus.tambahMahasiswa(new Mahasiswa(nim, nama));
                    break;

                case 3:
                    System.out.print("\nMasukkan NIM mahasiswa: ");
                    String nimPinjam = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodePinjam = sc.nextLine();

                    Mahasiswa mhs = perpus.cariMahasiswa(nimPinjam);
                    Buku buku = perpus.cariBuku(kodePinjam);

                    if (mhs != null && buku != null) {
                        mhs.pinjamBuku(buku);
                    }
                    break;

                case 4:
                    System.out.print("\nMasukkan NIM mahasiswa: ");
                    String nimKembali = sc.nextLine();
                    System.out.print("Masukkan kode buku: ");
                    String kodeKembali = sc.nextLine();

                    Mahasiswa mhsKembali = perpus.cariMahasiswa(nimKembali);
                    if (mhsKembali != null) {
                        mhsKembali.kembalikanBuku(kodeKembali);
                    }
                    break;

                case 5:
                    perpus.tampilkanPeminjaman();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 6);

        sc.close();
    }
}