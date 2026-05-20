package JobsheetCM;

public class DoubleLinkedListAntrian12 {
    NodeAntrian12 head;
    NodeAntrian12 tail;
    int size;

    public DoubleLinkedListAntrian12() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int nomorAntrian, Pembeli12 pembeli) {
        NodeAntrian12 newNode = new NodeAntrian12(tail,
                nomorAntrian, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("======================");
            System.out.println("Daftar Antrian Pembeli");
            System.out.println("======================");
            System.out.println("No Antrian\tNama\t\tNo HP");

            NodeAntrian12 current = head;
            while (current != null) {
                System.out.println(current.nomorAntrian + "\t"
                        + current.pembeli.namaPembeli + "\t\t"
                        + current.pembeli.noHp);
                current = current.next;
            }
        }
    }

    public NodeAntrian12 removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }

        NodeAntrian12 removed = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        size--;
        return removed;
    }
}