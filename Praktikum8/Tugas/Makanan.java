package Praktikum8.Tugas;

public class Makanan extends Menu {
    private int levelPedas;

    public Makanan(String nama, double harga, int levelPedas) {
        super(nama, harga);
        this.levelPedas = levelPedas;
    }

    @Override
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
        super.tampilkanInfo();
        System.out.println("Level pedas: " + levelPedas);
        System.out.println("--------------------------");
        System.out.println("Total(kena pajak 10%): " + hitungHarga());
    }
}