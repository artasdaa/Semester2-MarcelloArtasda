package Jobsheet3;

import java.util.Scanner;

class Dosen {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilData() {
        System.out.println("Kode          : " + kode);
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia          : " + usia);
        System.out.println("--------------------------------");
    }
}

public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();

        Dosen[] daftarDosen = new Dosen[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

            System.out.print("Kode          : ");
            String kode = sc.nextLine();

            System.out.print("Nama          : ");
            String nama = sc.nextLine();

            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            String jkInput = sc.nextLine();
            Boolean jenisKelamin = jkInput.equalsIgnoreCase("Pria");

            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftarDosen[i] = new Dosen(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\n===== DATA DOSEN =====");
        int no = 1;
        for (Dosen d : daftarDosen) {
            System.out.println("Data Dosen ke-" + no++);
            d.tampilData();
        }

        sc.close();
    }
}