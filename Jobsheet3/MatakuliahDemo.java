package Jobsheet3;

import java.util.Scanner;

    class Matakuliah {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah() {
    }

    public Matakuliah(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        String dummy;

        System.out.print("Kode       : ");
        kode = sc.nextLine();

        System.out.print("Nama       : ");
        nama = sc.nextLine();

        System.out.print("SKS        : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);

        System.out.print("Jumlah Jam : ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);

        System.out.println("----------------------------------");
    }

    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("----------------------------------");
    }
}

public class MatakuliahDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        Matakuliah[] arrayOfMatakuliah = new Matakuliah[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i] = new Matakuliah();
            arrayOfMatakuliah[i].tambahData();
        }

        System.out.println("\n===== DATA MATAKULIAH =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }

        sc.close();
    }
}