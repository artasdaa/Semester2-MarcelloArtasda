import java.util.Scanner;
public class JadwalKuliah {
    static void inputJadwal(String[][] jadwal, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah : ");
            jadwal[i][0] = sc.nextLine();
            System.out.print("Ruang            : ");
            jadwal[i][1] = sc.nextLine();
            System.out.print("Hari             : ");
            jadwal[i][2] = sc.nextLine();
            System.out.print("Jam              : ");
            jadwal[i][3] = sc.nextLine();
        }
    }

    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\nDAFTAR JADWAL KULIAH");
        System.out.println("==========================================================================");
        System.out.printf("%-25s %-20s %-15s %-15s%n",
                "Mata Kuliah", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%-25s %-20s %-15s %-15s%n",
                    jadwal[i][0], jadwal[i][1], jadwal[i][2], jadwal[i][3]);
        }

        System.out.println("==========================================================================");
    }

    static void cariHari(String[][] jadwal, int n, String hari) {
        boolean ditemukan = false;

        System.out.println("\nJadwal Hari " + hari);
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(jadwal[i][0] + " | " + jadwal[i][1] + " | " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari tersebut.");
        }
    }

    static void cariMatkul(String[][] jadwal, int n, String matkul) {
        boolean ditemukan = false;

        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(matkul)) {
                System.out.println("\nDetail Jadwal:");
                System.out.println("Mata Kuliah : " + jadwal[i][0]);
                System.out.println("Ruang       : " + jadwal[i][1]);
                System.out.println("Hari        : " + jadwal[i][2]);
                System.out.println("Jam         : " + jadwal[i][3]);
                ditemukan = true;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal kuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        String[][] jadwal = new String[n][4];

        inputJadwal(jadwal, n, sc);
        tampilSemua(jadwal, n);

        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = sc.nextLine();
        cariHari(jadwal, n, hari);

        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String matkul = sc.nextLine();
        cariMatkul(jadwal, n, matkul);
        sc.close();
    }
}
