package CM1;

import java.util.Scanner;
public class Main {
    static void insertionSort(Peminjaman[] data) {
        for (int i = 1; i < data.length; i++) {
            Peminjaman key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].denda < key.denda) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    static void sortByNIM(Peminjaman[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].mhs.nim.compareTo(data[j + 1].mhs.nim) > 0) {
                    Peminjaman temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    static void binarySearch(Peminjaman[] data, String nim) {
        int left = 0, right = data.length - 1;
        boolean ketemu = false;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (data[mid].mhs.nim.equals(nim)) {
                int i = mid;
                while (i >= 0 && data[i].mhs.nim.equals(nim)) {
                    data[i].tampil();
                    i--;
                }
                i = mid + 1;
                while (i < data.length && data[i].mhs.nim.equals(nim)) {
                    data[i].tampil();
                    i++;
                }
                ketemu = true;
                break;
            } else if (data[mid].mhs.nim.compareTo(nim) < 0) {
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
        Scanner sc = new Scanner(System.in);

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
                    insertionSort(pinjam);
                    System.out.println("Setelah diurutkan (denda terbesar):");
                    for (Peminjaman p : pinjam) p.tampil();
                    break;

                case 5:
                    sortByNIM(pinjam);
                    System.out.print("Masukkan NIM: ");
                    String cari = sc.next();
                    binarySearch(pinjam, cari);
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}
