package Jobsheet2;

public class MataKuliahMain12 {

    public static void main(String[] args) {

        MataKuliah12 mk1 = new MataKuliah12();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah12 mk2 = new MataKuliah12("IF102", "Basis Data", 3, 6);

        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
