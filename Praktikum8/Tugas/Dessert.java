package Praktikum8.Tugas;

public class Dessert extends Menu {
    private int levelManis;

    public Dessert(String nama, double harga, int levelManis) {
        super(nama, harga);
        this.levelManis = levelManis;
    }

    @Override
    public void status() {
        System.out.println("Dessert: " + nama + " sedang didekorasi");
    }

    // pajak 10%
    @Override
    public double hitungHarga() {
        return harga * 1.10;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Level manis: " + levelManis);
        System.out.println("--------------------------");
        System.out.println("Total(kena pajak 10%): " + hitungHarga());
    }
}