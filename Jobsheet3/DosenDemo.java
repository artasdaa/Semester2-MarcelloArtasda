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

class DataDosen {

    void dataSemuaDosen(Dosen[] arrayOfDosen) {
        int no = 1;
        for (Dosen d : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + no++);
            d.tampilData();
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int pria = 0;
        int wanita = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }

        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jumlahPria++;
            } else {
                totalWanita += d.usia;
                jumlahWanita++;
            }
        }

        double rataPria = jumlahPria == 0 ? 0 : (double) totalPria / jumlahPria;
        double rataWanita = jumlahWanita == 0 ? 0 : (double) totalWanita / jumlahWanita;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        Dosen tertua = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }

        System.out.println("Dosen Paling Tua:");
        tertua.tampilData();
    }

    void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        Dosen termuda = arrayOfDosen[0];

        for (Dosen d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }

        System.out.println("Dosen Paling Muda:");
        termuda.tampilData();
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

        DataDosen data = new DataDosen();

        System.out.println("\n===== SEMUA DATA DOSEN =====");
        data.dataSemuaDosen(daftarDosen);

        System.out.println("\n===== JUMLAH DOSEN PER JENIS KELAMIN =====");
        data.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n===== RATA-RATA USIA DOSEN PER JENIS KELAMIN =====");
        data.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        System.out.println("\n===== DOSEN PALING TUA =====");
        data.infoDosenPalingTua(daftarDosen);

        System.out.println("\n===== DOSEN PALING MUDA =====");
        data.infoDosenPalingMuda(daftarDosen);

        sc.close();
    }
}