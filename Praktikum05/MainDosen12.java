package Praktikum05;

import java.util.Scanner;

public class MainDosen12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen12 data = new DataDosen12();
        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda → Tertua)");
            System.out.println("4. Sorting DESC (Usia Tertua → Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIDN : ");
                    String nidn = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Usia : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen12 d = new Dosen12(nidn, nama, usia);
                    data.tambah(d);
                    break;

                case 2:
                    data.tampil();
                    break;

                case 3:
                    data.bubbleSort();
                    System.out.println("Data berhasil diurutkan ASC!");
                    data.tampil();
                    break;

                case 4:
                    data.selectionSort();
                    System.out.println("Data berhasil diurutkan DESC!");
                    data.tampil();
                    break;

                case 5:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 5);

        sc.close();
    }
}