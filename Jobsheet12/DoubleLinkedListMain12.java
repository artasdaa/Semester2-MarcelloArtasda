package Jobsheet12;

import java.util.Scanner;

public class DoubleLinkedListMain12 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleLinkedList12 list = new DoubleLinkedList12();
        int pilihan;

        do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("7. Tampilkan data reverse");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");

            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {

                case 1:
                    Mahasiswa12 mhsAwal = inputMahasiswa(scan);
                    list.addFirst(mhsAwal);
                    break;

                case 2:
                    Mahasiswa12 mhsAkhir = inputMahasiswa(scan);
                    list.addLast(mhsAkhir);
                    break;

                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNim = scan.nextLine();

                    System.out.println("Masukkan data baru : ");
                    Mahasiswa12 dataBaru = inputMahasiswa(scan);

                    list.insertAfter(keyNim, dataBaru);
                    break;

                case 4:
                    list.removeFirst12();
                    break;

                case 5:
                    list.removeLast12();
                    break;

                case 6:
                    list.print();
                    break;

                case 7:
                    list.printReverse();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }

        } while (pilihan != 0);

        scan.close();
    }

    public static Mahasiswa12 inputMahasiswa(Scanner scan) {
        System.out.print("NIM   : ");
        String nim = scan.nextLine();

        System.out.print("Nama  : ");
        String nama = scan.nextLine();

        System.out.print("Kelas : ");
        String kelas = scan.nextLine();

        System.out.print("IPK   : ");
        double ipk = scan.nextDouble();
        scan.nextLine();

        return new Mahasiswa12(nim, nama, kelas, ipk);
    }
}