public class Praktikumfungsi {
    static int[] harga = {75000, 50000, 60000, 10000};
    static int[][] stok = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };

    static String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
    };

    public static int hitungPendapatan(int indexCabang) {
        int total = 0;
        for (int i = 0; i < stok[indexCabang].length; i++) {
            total += stok[indexCabang][i] * harga[i];
        }
        return total;
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        System.out.println("Pendapatan dan Status Cabang RoyalGarden");
        System.out.println("================================================");

        for (int i = 0; i < cabang.length; i++) {
            int pendapatan = hitungPendapatan(i);
            String status = statusCabang(pendapatan);

            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println("------------------------------------------------");
        }
    }
}