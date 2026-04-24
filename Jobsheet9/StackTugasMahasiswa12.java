package Jobsheet9;

public class StackTugasMahasiswa12 {
    Mahasiswa12[] stack;
    int top;
    int size;

    public StackTugasMahasiswa12(int size) {
        this.size = size;
        stack = new Mahasiswa12[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa12 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambah tugas.");
        }
    }

    public Mahasiswa12 pop() {
        if (!isEmpty()) {
            Mahasiswa12 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas.");
            return null;
        }
    }

    public Mahasiswa12 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa12 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public int count() {
        return top + 1;
    }

    public void print() {
        System.out.println("Nama\tNIM\tKelas\tNilai");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t" + stack[i].nilai);
        }
    }
}