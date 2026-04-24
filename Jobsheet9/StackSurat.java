package Jobsheet9;

class StackSurat {
    Surat[] stack;
    int top;
    int size;

    public StackSurat(int size) {
        this.size = size;
        stack = new Surat[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat s) {
        if (!isFull()) {
            stack[++top] = s;
            System.out.println("Surat berhasil ditambahkan.");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public Surat peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Tidak ada surat!");
            return null;
        }
    }

    public void cari(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                stack[i].tampilkan();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }
}