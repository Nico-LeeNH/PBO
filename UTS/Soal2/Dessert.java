package UTS.Soal2;

public class Dessert extends Menu {
    private int levelManis;

    public Dessert(String nama, double harga, int levelManis) {
        super(nama, harga);
        this.levelManis = levelManis;
    }

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
        System.out.println("Dessert: " + nama);
        System.out.println("Manis: " + "level " + levelManis + "/3");
        System.out.println("Harga: " + harga);
    }
}