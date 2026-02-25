package Jobsheet2;

public class DosenMain12 {

    public static void main(String[] args) {

        Dosen12 d1 = new Dosen12();
        d1.idDosen = "D001";
        d1.nama = "Dr. Budi";
        d1.statusAktif = true;
        d1.tahunBergabung = 2015;
        d1.bidangKeahlian = "Basis Data";

        d1.tampilInformasi();
        System.out.println("Masa Kerja: " + d1.hitungMasaKerja(2025) + " tahun");
        d1.ubahKeahlian("Data Science");
        d1.setStatusAktif(false);
        d1.tampilInformasi();

        Dosen12 d2 = new Dosen12("D002", "Dr. Sinta", true, 2018, "Jaringan Komputer");

        d2.tampilInformasi();
        System.out.println("Masa Kerja: " + d2.hitungMasaKerja(2025) + " tahun");
    }
}