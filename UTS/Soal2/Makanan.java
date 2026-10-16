package UTS.Soal2;

public class Makanan extends Menu {
    private int levelPedas;

    public Makanan(String nama, double harga, int levelPedas) {
        super(nama, harga);
        this.levelPedas = levelPedas;
    }

    public void status() {
        System.out.println("Status: " + nama + " sedang dimasak");
    }

    // pajak 10%
    @Override
    public double hitungHarga() {
        return harga * 1.10;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Makanan: " + nama);
        System.out.println("Pedas: " + "level " + levelPedas);
        System.out.println("Harga: " + harga);
    }
}
