package Jobsheet14;

public class BinaryTreeArrayMain12 {
    public static void main(String[] args) {

        BinaryTreeArray12 bta = new BinaryTreeArray12();

        Mahasiswa12 m1 = new Mahasiswa12("244160121", "Ali", "TI-1I", 3.57);
        Mahasiswa12 m2 = new Mahasiswa12("244160185", "Candra", "TI-1I", 3.41);
        Mahasiswa12 m3 = new Mahasiswa12("244160221", "Badar", "TI-1I", 3.75);
        Mahasiswa12 m4 = new Mahasiswa12("244160220", "Dewi", "TI-1I", 3.35);

        Mahasiswa12[] dataMahasiswa = {m1, m2, m3, m4};

        bta.populateData(dataMahasiswa, 3);

        System.out.println("\nInOrder Traversal Mahasiswa:");
        bta.traverseInOrder(0);
    }
}