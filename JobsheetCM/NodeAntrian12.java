package JobsheetCM;

public class NodeAntrian12 {
    int nomorAntrian;
    Pembeli12 pembeli;
    NodeAntrian12 prev;
    NodeAntrian12 next;

    public NodeAntrian12(NodeAntrian12 prev, int nomorAntrian,
            Pembeli12 pembeli, NodeAntrian12 next) {
        this.prev = prev;
        this.nomorAntrian = nomorAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}