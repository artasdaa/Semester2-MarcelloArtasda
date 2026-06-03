package Praktikum15;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo12 {
    public static void main(String[] args) {

        ArrayList<String> daftarSiswa = new ArrayList<>();

        daftarSiswa.add("Zainab");
        daftarSiswa.add("Andi");
        daftarSiswa.add("Rara");

        Collections.sort(daftarSiswa);

        System.out.println(daftarSiswa);

        ArrayList<Customer> Customers = new ArrayList<>();
        Customers.add(new Customer (201, "Della"));
        Customers.add(new Customer (202, "Victor"));
        Customers.add(new Customer (203, "Sarah"));

        Customers.sort((c1, c2) -> c1.name.compareTo(c2.name));

        System.out.println(Customers);
    }
}