package Jobsheet6;

public class MahasiswaBerprestasi12 {
    Mahasiswa[] listMhs = new Mahasiswa[5];
    int idx;

    void tambah(Mahasiswa m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Mahasiswa m : listMhs) {
            m.tampilInformasi();
        }
    }

    int sequentialSearching(double cari) {
        int posisi = -1;
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i].ipk == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    // tampil posisi
    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan IPK " + x + " tidak ditemukan");
        }
    }

    // tampil data
    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM   : " + listMhs[pos].nim);
            System.out.println("Nama  : " + listMhs[pos].nama);
            System.out.println("Kelas : " + listMhs[pos].kelas);
            System.out.println("IPK   : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}