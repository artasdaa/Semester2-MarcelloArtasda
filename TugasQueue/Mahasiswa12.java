package TugasQueue;

public class Mahasiswa12 {
    String nim, nama, keperluan;

    public Mahasiswa12(String nim, String nama, String keperluan) {
        this.nim = nim;
        this.nama = nama;
        this.keperluan = keperluan;
    }

    public void tampil() {
        System.out.println(nim + " | " + nama + " | " + keperluan);
    }
}