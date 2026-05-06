package TugasQueue;

public class QueueLinkedList {
    Node12 front, rear;
    int size = 0;

    // d. cek kosong
    public boolean isEmpty() {
        return front == null;
    }

    // (opsional) cek penuh
    public boolean isFull() {
        return false; // linked list tidak terbatas
    }

    // e. tambah antrian
    public void enqueue(Mahasiswa12 data) {
        Node12 newNode = new Node12(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa masuk antrian.");
    }

    // f. panggil antrian
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Memanggil: ");
            front.data.tampil();
            front = front.next;

            if (front == null) {
                rear = null;
            }
            size--;
        }
    }

    // d. kosongkan
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    // g. tampil depan & belakang
    public void tampilDepanBelakang() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();

            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    // h. jumlah antrian
    public void jumlah() {
        System.out.println("Jumlah antrian: " + size);
    }

    // tambahan: tampil semua
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            Node12 tmp = front;
            System.out.println("Isi Antrian:");
            while (tmp != null) {
                tmp.data.tampil();
                tmp = tmp.next;
            }
        }
    }
}