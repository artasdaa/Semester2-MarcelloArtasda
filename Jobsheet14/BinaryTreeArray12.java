package Jobsheet14;

public class BinaryTreeArray12 {
    Mahasiswa12[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray12() {
        dataMahasiswa = new Mahasiswa12[10];
    }

    void populateData(Mahasiswa12[] data, int idxLast) {
        this.dataMahasiswa = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {

            if (dataMahasiswa[idxStart] != null) {

                traverseInOrder(2 * idxStart + 1);

                dataMahasiswa[idxStart].tampilInformasi();

                traverseInOrder(2 * idxStart + 2);
            }
        }
    }
}