package JobsheetCM;

public class Pembeli12 {
    String namaPembeli;
    String noHp;

    public Pembeli12(String namaPembeli, String noHp) {
        this.namaPembeli = namaPembeli;
        this.noHp = noHp;
    }

    public void tampilPembeli() {
        System.out.println(namaPembeli + "\t" + noHp);
    }
}