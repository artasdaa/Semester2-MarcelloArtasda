package Jobsheet14;

public class Node12 {
    Mahasiswa12 mahasiswa;
    Node12 left, right;

    public Node12() {
    }

    public Node12(Node12 left, Mahasiswa12 mahasiswa) {
        this.mahasiswa = mahasiswa;
        left = right = null;
    }
}