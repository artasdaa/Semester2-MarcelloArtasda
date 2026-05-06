package Pertemuan12;

import java.util.Scanner;

public class SLLMain12 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    SingleLinkedList12 sll = new SingleLinkedList12();

    System.out.println("=== Input Data Mahasiswa ===");

    System.out.print("Masukkan jumlah data: ");
    int jumlah = sc.nextInt();
    sc.nextLine(); // buang enter

    for (int i = 0; i < jumlah; i++) {
        System.out.println("\nData ke-" + (i + 1));

        System.out.print("NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("IPK   : ");
        double ipk = sc.nextDouble();
        sc.nextLine(); // buang enter

        Mahasiswa12 mhs = new Mahasiswa12(nim, nama, kelas, ipk);

        // masukkan ke linked list
        sll.addLast(mhs);
    }

    System.out.println("\n=== Hasil Linked List ===");
sll.print();

// akses index
System.out.print("\ndata index 1 : ");
sll.getData(0);

// cari index
int idx = sll.indexOf("Bimon");
System.out.println("data mahasiswa an Bimon berada pada index : " + idx);

// hapus pertama
sll.removeFirst();
sll.print();

// hapus terakhir
sll.removeLast();
sll.print();
}
}