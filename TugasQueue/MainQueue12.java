package TugasQueue;

import java.util.Scanner;

public class MainQueue12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList antrian = new QueueLinkedList();

        int pilih;

        do {
            System.out.println("\n=== SISTEM ANTRIAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Kosong");
            System.out.println("4. Kosongkan Antrian");
            System.out.println("5. Tampil Depan & Belakang");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Tampilkan Semua");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM        : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama       : ");
                    String nama = sc.nextLine();
                    System.out.print("Keperluan  : ");
                    String kep = sc.nextLine();

                    Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kep);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    antrian.dequeue();
                    break;

                case 3:
                    System.out.println(antrian.isEmpty() ? "Kosong" : "Tidak kosong");
                    break;

                case 4:
                    antrian.clear();
                    break;

                case 5:
                    antrian.tampilDepanBelakang();
                    break;

                case 6:
                    antrian.jumlah();
                    break;

                case 7:
                    antrian.print();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);
    }
}