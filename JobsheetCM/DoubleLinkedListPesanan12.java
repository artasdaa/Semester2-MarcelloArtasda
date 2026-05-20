package JobsheetCM;

public class DoubleLinkedListPesanan12 {
    NodePesanan12 head;
    NodePesanan12 tail;
    int size;

    public DoubleLinkedListPesanan12() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(Pesanan12 pesanan) {
        NodePesanan12 newNode = new NodePesanan12(tail,
                pesanan, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void sortPesanan() {
        if (isEmpty()) {
            return;
        }

        boolean tukar;

        do {
            tukar = false;
            NodePesanan12 current = head;

            while (current.next != null) {
                if (current.pesanan.namaPesanan.compareToIgnoreCase(
                        current.next.pesanan.namaPesanan) > 0) {

                    Pesanan12 temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;

                    tukar = true;
                }
                current = current.next;
            }
        } while (tukar);
    }

    public void printPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
        } else {
            sortPesanan();

            System.out.println("===================================");
            System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
            System.out.println("===================================");
            System.out.println("Kode\tNama Pesanan\t\tHarga");

            NodePesanan12 current = head;
            int total = 0;

            while (current != null) {
                current.pesanan.tampilPesanan();
                total += current.pesanan.harga;
                current = current.next;
            }
            System.out.println("Total Pendapatan : Rp " + total);
        }
    }
}