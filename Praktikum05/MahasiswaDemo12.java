package Praktikum05;

public class MahasiswaDemo12 {
    public static void main(String[] args) {

        MahasiswaBerprestasi12 list = new MahasiswaBerprestasi12();

        Mahasiswa12 m1 = new Mahasiswa12("123", "Zidan", "2A", 3.2);
        Mahasiswa12 m2 = new Mahasiswa12("124", "Ayu", "2A", 3.5);
        Mahasiswa12 m3 = new Mahasiswa12("125", "Sofi", "2A", 3.1);
        Mahasiswa12 m4 = new Mahasiswa12("126", "Sita", "2A", 3.9);
        Mahasiswa12 m5 = new Mahasiswa12("127", "Miki", "2A", 3.7);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa Sebelum Sorting:");
        list.tampil();
        list.bubbleSort();

        System.out.println("Data Mahasiswa Setelah Sorting Berdasarkan IPK (DESC):");
        list.tampil();
    }
}