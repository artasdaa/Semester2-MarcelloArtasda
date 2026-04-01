package Praktikum05;

public class DataDosen12 {
    Dosen12[] listDsn = new Dosen12[100];
    int idx;

    void tambah(Dosen12 d) {
        if (idx < listDsn.length) {
            listDsn[idx] = d;
            idx++;
        } else {
            System.out.println("Data penuh!");
        }
    }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listDsn[i].tampil();
            System.out.println("-------------------");
        }
    }

    // ASC (termuda → tertua) - Bubble Sort
    void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 1; j < idx - i; j++) {
                if (listDsn[j].usia < listDsn[j - 1].usia) {
                    Dosen12 tmp = listDsn[j];
                    listDsn[j] = listDsn[j - 1];
                    listDsn[j - 1] = tmp;
                }
            }
        }
    }

    // DESC (tertua → termuda) - Selection Sort
    void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int max = i;
            for (int j = i + 1; j < idx; j++) {
                if (listDsn[j].usia > listDsn[max].usia) {
                    max = j;
                }
            }
            Dosen12 tmp = listDsn[max];
            listDsn[max] = listDsn[i];
            listDsn[i] = tmp;
        }
    }
}