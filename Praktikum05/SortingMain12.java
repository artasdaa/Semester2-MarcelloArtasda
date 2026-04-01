package Praktikum05;

public class SortingMain12 {
    public static void main(String[] args) {

        int c[] = {40, 10, 4, 9, 3};

        Sorting12 dataurut3 = new Sorting12(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.bubbleSort();
        dataurut3.SelectionSort();

        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut3.tampil();
    }
}