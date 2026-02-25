package Jobsheet3;

import java.util.Scanner;
    
    class Matakuliah {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public Matakuliah(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}

public class MatakuliahDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matakuliah[] arrayOfMatakuliah = new Matakuliah[3];

        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

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

            arrayOfMatakuliah[i] = new Matakuliah(kode, nama, sks, jumlahJam);
        }

        System.out.println("\n===== DATA MATAKULIAH =====");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah[i].nama);
            System.out.println("SKS        : " + arrayOfMatakuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah[i].jumlahJam);
            System.out.println("----------------------------------");
        }

        sc.close();
    }
}