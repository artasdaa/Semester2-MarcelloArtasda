package CM1;

import java.util.Scanner;
public class Main {
    static void insertionSort(Peminjaman[] data) { //Method insertionSort()
        for (int i = 1; i < data.length; i++) {
            Peminjaman key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].denda < key.denda) { //Diurutkan dari denda terbesar ke terkecil (descending)
                data[j + 1] = data[j];
                j--;
            }   
            data[j + 1] = key;
        }
    }

    static void sortByNIM(Peminjaman[] data) { //Method sortByNIM() menggunakan bubble short
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].mhs.nim.compareTo(data[j + 1].mhs.nim) > 0) { //Data diurutkan ascending (kecil → besar) proses binary search
                    Peminjaman temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    static void binarySearch(Peminjaman[] data, String nim) { //Method binarySearch()
        Peminjaman[] copy = new Peminjaman [data.length];
        for (int i = 0; i < data.length; i++) {
            copy [i] = data[i];
        }

        sortByNIM(copy);

        int left = 0, right = data.length - 1;
        boolean ketemu = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (copy[mid].mhs.nim.equals(nim)) {
                System.out.println("Data ditemukan:");
                int i = mid;
                while (i >= 0 && copy[i].mhs.nim.equals(nim)) { //Bisa menampilkan lebih dari 1 data jika NIM sama
                    copy[i].tampil();
                    i--;
                }
                i = mid + 1;
                while (i < copy.length && copy[i].mhs.nim.equals(nim)) {
                    copy[i].tampil();
                    i++;
                }
                ketemu = true;
                break;
            } else if (copy[mid].mhs.nim.compareTo(nim) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!ketemu) {
            System.out.println("Data tidak ditemukan!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //menerima input user

        //Data Awal (Array Object)
        Mahasiswa[] mhs = {
            new Mahasiswa("22001", "Andi", "Teknik Informatika"),
            new Mahasiswa("22002", "Budi", "Teknik Informatika"),
            new Mahasiswa("22003", "Citra", "Sistem Informasi Bisnis")
        };

        Buku[] buku = {
            new Buku("B001", "Algoritma", 2020),
            new Buku("B002", "Basis Data", 2019),
            new Buku("B003", "Pemrograman", 2021),
            new Buku("B004", "Fisika", 2024)
        };

        Peminjaman[] pinjam = {
            new Peminjaman(mhs[0], buku[0], 7),
            new Peminjaman(mhs[1], buku[1], 3),
            new Peminjaman(mhs[2], buku[2], 10),
            new Peminjaman(mhs[2], buku[3], 6),
            new Peminjaman(mhs[0], buku[1], 4)
        };

        int pilih;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda (Insertion Sort)");
            System.out.println("5. Cari Berdasarkan NIM (Binary Search)");
            System.out.println("6. Tambah Peminjaman");
            System.out.println("7. Tampilkan Statistik");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    for (Mahasiswa m : mhs) m.tampil();
                    break;

                case 2:
                    for (Buku b : buku) b.tampil();
                    break;

                case 3:
                    for (Peminjaman p : pinjam) p.tampil();
                    break;

                case 4:
                    insertionSort(pinjam); //Mengurutkan denda terbesar ke terkecil
                    System.out.println("Setelah diurutkan (denda terbesar):");
                    for (Peminjaman p : pinjam) p.tampil();
                    break;

                case 5:
                    sortByNIM(pinjam);
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();
                    binarySearch(pinjam, cari);
                    break;

                case 6:
                    pinjam = tambahPeminjaman(pinjam, mhs, buku, sc);
                    break;

                case 7:
                    tampilStatistik(pinjam);
                    break;  
            }

        } while (pilih != 0);

        sc.close();
    }

    static Peminjaman[] tambahPeminjaman(Peminjaman[] data, Mahasiswa[] mhs, Buku[] buku, Scanner sc) {
        System.out.print ("Masukkan NIM:");
        String nim = sc.next();

        Mahasiswa mhsCari = null;
        for (Mahasiswa m : mhs) {
            if (m.nim.equals(nim)) {
                mhsCari = m;
                break;
            }
        }
        if (mhsCari == null) {
            System.out.println("NIM tidak ditemukan");
            return data;
        }

        System.out.print("Masukkan Kode Buku:");
        String kode = sc.next();

        Buku bukuCari = null;
        for (Buku b : buku) {
            if (b.kodeBuku.equals(kode)) {
                bukuCari = b;
                break;
            }
        }
        if (bukuCari == null) {
            System.out.println("Buku tidak ditemukan:");
            return data;
        }

        System.out.print("Masukkan Lama Pinjam (hari):");
        int lama = sc.nextInt();

        Peminjaman[] baru = new Peminjaman[data.length + 1];
        for (int i = 0; i < data.length; i++) {
            baru[i] = data[i];
        }

        baru[data.length] = new Peminjaman(mhsCari, bukuCari, lama);

        System.out.println("Peminjaman berhasil ditambahkan!");
        return baru;
    }

    static void tampilStatistik(Peminjaman[] data) {
        int totalDenda = 0;
        int terlambat = 0;
        int tepat = 0;

        for (Peminjaman p : data) {
            totalDenda += p.denda;

            if (p.terlambat > 0) {
                terlambat++;
            }else {
                tepat++;
            }
        }
        System.out.println("=== STATISTIK PEMINJAMAN");
        System.out.println("Total Denda: " + totalDenda);
        System.out.println("Peminjaman Terlambat: " + terlambat);
        System.out.println("Peminjaman Tepat Waktu: " + tepat);
    }

}
