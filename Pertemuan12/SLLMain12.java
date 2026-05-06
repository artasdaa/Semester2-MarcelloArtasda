package Pertemuan12;

public class SLLMain12 {
    public static void main(String[] args) {

        SingleLinkedList12 sll = new SingleLinkedList12();

        Mahasiswa12 mhs1 = new Mahasiswa12("22212203", "Dirga", "4D", 3.6);
        Mahasiswa12 mhs2 = new Mahasiswa12("22212202", "Cintia", "3C", 3.5);
        Mahasiswa12 mhs3 = new Mahasiswa12("22212201", "Bimon", "2B", 3.8);
        Mahasiswa12 mhs4 = new Mahasiswa12("22212200", "Akbar", "1A", 4.0);

        sll.print();

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs4);
        sll.print();

        sll.insertAt(1, mhs2);

        sll.insertAfter("Cinta", mhs3);

        sll.print();    

    }
}
