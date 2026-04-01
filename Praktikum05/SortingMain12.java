package Praktikum05;

public class SortingMain12 {
    public static void main(String[] args) {

        int b[] = {30, 20, 2, 8, 14};

        Sorting12 dataurut2 = new Sorting12(b, b.length);

        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.bubbleSort();
        dataurut2.SelectionSort();

        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut2.tampil();
    }
}