package Jobsheet3;

class Mahasiswa {
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;
}

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa[] arrayOfMahasiswa = new Mahasiswa[3];

        arrayOfMahasiswa[0] = new Mahasiswa();
        arrayOfMahasiswa[0].nim = "244107060033";
        arrayOfMahasiswa[0].nama = "AGNES TIARA SISINTI";
        arrayOfMahasiswa[0].kelas = "SIB-1E";
        arrayOfMahasiswa[0].ipk = 3.75f;

        arrayOfMahasiswa[1] = new Mahasiswa();
        arrayOfMahasiswa[1].nim = "244107060077";
        arrayOfMahasiswa[1].nama = "ACHMAD MAULANA RAMZANI";
        arrayOfMahasiswa[1].kelas = "TI-2A";
        arrayOfMahasiswa[1].ipk = 3.36f;

        arrayOfMahasiswa[2] = new Mahasiswa();
        arrayOfMahasiswa[2].nim = "244107060086";
        arrayOfMahasiswa[2].nama = "PRIMANANDA PUTRANTO";
        arrayOfMahasiswa[2].kelas = "TI-2E";
        arrayOfMahasiswa[2].ipk = 3.80f;

        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("NIM   : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama  : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK   : " + arrayOfMahasiswa[i].ipk);
            System.out.println("-----------------------------");
        }
    }
}