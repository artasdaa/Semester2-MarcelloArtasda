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
}
}