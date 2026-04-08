package Jobsheet6;

import java.util.Scanner;

public class MahasiswaDemo12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12(jumMhs);

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // penting!

            list.tambah(new Mahasiswa(nim, nama, kelas, ipk));
            System.out.println("--------------------------");
        }

        System.out.println("\nData Mahasiswa:");
        list.tampil();

        System.out.println("\nPencarian Data");
        System.out.print("Masukkan IPK yang dicari: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Binary Search");

        int posisi = list.findBinarySearch(cari, 0, list.idx - 1);
        list.tampilPosisi(cari, posisi);
        list.tampilDataSearch(cari, posisi);
    }
}