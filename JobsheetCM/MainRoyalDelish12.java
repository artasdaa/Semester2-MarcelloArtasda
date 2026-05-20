package JobsheetCM;

import java.util.Scanner;

public class MainRoyalDelish12 {

    public static void menu() {
        System.out.println("===========================");
        System.out.println("SISTEM ANTRIAN ROYAL DELISH");
        System.out.println("===========================");
        System.out.println("1. Tambah Antrian");
        System.out.println("2. Cetak Antrian");
        System.out.println("3. Hapus Antrian dan Pesan");
        System.out.println("4. Laporan Pesanan");
        System.out.println("0. Keluar");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DoubleLinkedListAntrian12 antrian =
                new DoubleLinkedListAntrian12();

        DoubleLinkedListPesanan12 pesanan =
                new DoubleLinkedListPesanan12();

        int pilih;
        int nomorAntrian = 1;

        do {
            menu();
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String noHp = sc.nextLine();

                    Pembeli12 pembeli = new Pembeli12(nama, noHp);

                    antrian.addLast(nomorAntrian, pembeli);

                    System.out.println("Antrian berhasil ditambahkan dengan nomor : "
                            + nomorAntrian);

                    nomorAntrian++;
                    break;

                case 2:
                    System.out.println();
                    antrian.print();
                    break;

                case 3:
                    System.out.println("\n====HAPUS ANTRIAN & PESAN====");

                    NodeAntrian12 dataKeluar = antrian.removeFirst();

                    if (dataKeluar != null) {
                        System.out.println("Pembeli : "
                                + dataKeluar.pembeli.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();
                        sc.nextLine();

                        Pesanan12 pesan = new Pesanan12(kode,
                                namaPesanan, harga);

                        pesanan.addLast(pesan);

                        System.out.println(dataKeluar.pembeli.namaPembeli
                                + " telah memesan " + namaPesanan);
                    }
                    break;

                case 4:
                    System.out.println();
                    pesanan.printPesanan();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);
    }
}