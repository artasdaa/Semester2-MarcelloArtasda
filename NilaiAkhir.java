import java.util.Scanner;
public class NilaiAkhir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUTS = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUAS = scanner.nextDouble();
        
        if (nilaiTugas < 0 || nilaiTugas >100 ||
            nilaiKuis < 0 || nilaiKuis >100 ||
            nilaiUTS < 0 || nilaiUTS >100 ||
            nilaiUAS < 0 || nilaiUAS >100) {

                System.out.println("Nilai yang dimasukkan tidak valid.");
                return;
            }
            double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 *nilaiUAS);
            String nilaiHuruf;
            double nilaiSetara;
            String kualifikasi;
            String status;

        if (nilaiAkhir > 80) {
            nilaiHuruf = "A";
            nilaiSetara = 4.0;
            kualifikasi = "Sangat Baik";
            status = "LULUS";
        } else if (nilaiAkhir > 73) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari Baik";
            status = "LULUS";
        } else if (nilaiAkhir > 65) {
            nilaiHuruf = "B";
            nilaiSetara = 3.0;
            kualifikasi = "Baik";
            status = "LULUS";
        } else if (nilaiAkhir > 60) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari Cukup";
            status = "LULUS";
        } else if (nilaiAkhir > 50) {
            nilaiHuruf = "C";
            nilaiSetara = 2.0;
            kualifikasi = "Cukup";
            status = "LULUS";
        } else if (nilaiAkhir > 39) {
            nilaiHuruf = "D";
            nilaiSetara = 1.0;
            kualifikasi = "Kurang";
            status = "TIDAK LULUS";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0.0;
            kualifikasi = "Gagal";
            status = "TIDAK LULUS";
        }

        System.out.println("====================");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("Nilai Setara: " + nilaiSetara);
        System.out.println("Kualifikasi : " + kualifikasi);
        System.out.println(status.equals("LULUS") 
                ? "SELAMAT ANDA LULUS" 
                : "ANDA TIDAK LULUS");

        scanner.close();
    }
}