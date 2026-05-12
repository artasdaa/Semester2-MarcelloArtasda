package Jobsheet12;

public class DoubleLinkedList12 {
    Node12 head;
    Node12 tail;

    public DoubleLinkedList12() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa12 data) {
        Node12 newNode = new Node12(data);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa12 data) {
        Node12 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node12 newNode = new Node12(data);

        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else {
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Data berhasil disisipkan setelah NIM " + keyNim);
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong.");
            return;
        }

        Node12 current = head;

        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
    if (isEmpty()) {
        System.out.println("Linked List masih kosong");
    } else {
        Node12 current = tail;

        System.out.println("Isi Linked List dari belakang:");

        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }
}

    public void removeFirst12() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }

    Mahasiswa12 data = head.data;

    if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }

    System.out.println("Data berhasil dihapus.");
    data.tampil();
}

    public void removeLast12() {
    if (isEmpty()) {
        System.out.println("Linked List kosong.");
        return;
    }

    Mahasiswa12 data = tail.data;

    if (head == tail) {
        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }

    System.out.println("Data berhasil dihapus.");
    data.tampil();
}
}