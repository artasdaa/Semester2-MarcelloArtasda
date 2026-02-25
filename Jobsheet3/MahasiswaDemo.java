package Jobsheet3;

import java.util.Scanner;

class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo() {
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
        System.out.println("----------------------------------");
    }
}

public class MahasiswaDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();

            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();

            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();

            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk = Float.parseFloat(dummy);

            System.out.println("----------------------------------");
        }

        System.out.println("\n===== DATA MAHASISWA =====");
        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa[i].cetakInfo();
        }

        sc.close();
    }
}