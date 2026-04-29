package P2Jobsheet10;

import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan antrian = new AntrianLayanan(5);

        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Terdepan");
            System.out.println("4. Lihat Semua");
            System.out.println("5. Jumlah Antrian");
            System.out.println("6. Lihat Terakhir");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Panggil 2 Mahasiswa");
            System.out.println("9. Lihat 2 Terdepan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.print("Dilayani: ");
                        dilayani.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.lihatTerdepan();
                    break;

                case 4:
                    antrian.tampilkanSemua();
                    break;

                case 5:
                    System.out.println("Jumlah: " + antrian.getJumlahAntrian());
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;
                
                case 7:
                    antrian = new AntrianLayanan(5); // Reset antrian
                    System.out.println("Antrian dikosongkan.");
                    break;

                case 8:
                    System.out.println("Memanggil 2 mahasiswa...");

                    for (int i = 0; i < 2; i++) {
                        Mahasiswa m = antrian.layaniMahasiswa();
                        if (m != null) {
                            System.out.print("Dilayani: ");
                            m.tampilkanData();
                        } else {
                            System.out.println("Antrian sudah kosong.");
                            break;
                        }
                    }

                case 9:
                    System.out.println("Mahasiswa terdepan:");
                    antrian.lihat2Terdepan();
                    break;

                case 0:
                    System.out.println("Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan salah.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}