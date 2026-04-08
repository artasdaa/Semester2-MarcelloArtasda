package Jobsheet6;

public class MahasiswaBerprestasi12 {
    Mahasiswa[] listMhs;
    int idx;

    MahasiswaBerprestasi12(int kapasitas) {
    listMhs = new Mahasiswa[kapasitas];
}

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

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data dengan IPK " + x + " tidak ditemukan");
        }
    }

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

    int findBinarySearch(double cari, int left, int right) {
    int mid;

    if (right >= left) {
        mid = (left + right) / 2;

        if (cari == listMhs[mid].ipk) {
            return mid;
        } else if (listMhs[mid].ipk > cari) {
            return findBinarySearch(cari, left, mid - 1);
        } else {
            return findBinarySearch(cari, mid + 1, right);
        }
    }

    return -1;
}
}