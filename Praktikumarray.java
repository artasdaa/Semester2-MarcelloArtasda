import java.util.Scanner;

public class Praktikumarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mk = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };

        int[] sks = {2, 3, 2, 3, 2, 3, 1, 2};
        double[] nilaiAngka = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] nilaiSetara = new double[mk.length];

        System.out.println("Program Menghitung IP Semester");
        System.out.println("==========================================================================");

        for (int i = 0; i < mk.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + mk[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();

            if (nilaiAngka[i] < 0 || nilaiAngka[i] > 100) {
                System.out.println("Nilai tidak valid!");
                return;
            }
        }

        double totalBobot = 0;
        int totalSKS = 0;

        for (int i = 0; i < mk.length; i++) {
            if (nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                nilaiSetara[i] = 4.0;
            } else if (nilaiAngka[i] > 73) {
                nilaiHuruf[i] = "B+";
                nilaiSetara[i] = 3.5;
            } else if (nilaiAngka[i] > 65) {
                nilaiHuruf[i] = "B";
                nilaiSetara[i] = 3.0;
            } else if (nilaiAngka[i] > 60) {
                nilaiHuruf[i] = "C+";
                nilaiSetara[i] = 2.5;
            } else if (nilaiAngka[i] > 50) {
                nilaiHuruf[i] = "C";
                nilaiSetara[i] = 2.0;
            } else if (nilaiAngka[i] > 39) {
                nilaiHuruf[i] = "D";
                nilaiSetara[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilaiSetara[i] = 0.0;
            }

            totalBobot += nilaiSetara[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobot / totalSKS;

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("==========================================================================");
        System.out.printf("%-45s %12s %12s %15s%n",
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < mk.length; i++) {
            System.out.printf("%-45s %12.2f %12s %15.2f%n",
                    mk[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("==========================================================================");
        System.out.printf("IP : %.2f%n", ip);

        sc.close();
    }
}