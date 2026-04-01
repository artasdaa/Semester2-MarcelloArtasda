package Praktikum05;

import java.util.Scanner;

public class DosenMain12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen12 dd = new DataDosen12();
        int pilih;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC (Bubble Sort - Usia)");
            System.out.println("4. Sorting DSC (Selection Sort - Usia)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: "); String k = sc.nextLine();
                    System.out.print("Nama: "); String n = sc.nextLine();
                    System.out.print("Jenis Kelamin (true=L, false=P): "); boolean jk = sc.nextBoolean();
                    System.out.print("Usia: "); int u = sc.nextInt();
                    dd.tambah(new Dosen12(k, n, jk, u));
                    break;
                case 2:
                    System.out.println("\n--- Daftar Dosen ---");
                    dd.tampil();
                    break;
                case 3:
                    dd.sortingASC();
                    System.out.println("Data berhasil diurutkan (Termuda ke Tertua).");
                    break;
                case 4:
                    dd.sortingDSC();
                    System.out.println("Data berhasil diurutkan (Tertua ke Termuda).");
                    break;
            }
        } while (pilih != 5);
    }
}