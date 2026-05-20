package JobsheetCM;

public class NodePesanan12 {
    Pesanan12 pesanan;
    NodePesanan12 prev;
    NodePesanan12 next;

    public NodePesanan12(NodePesanan12 prev,
            Pesanan12 pesanan, NodePesanan12 next) {
        this.prev = prev;
        this.pesanan = pesanan;
        this.next = next;
    }
}