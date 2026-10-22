package Praktikum8.Tugas;

public abstract class Menu {
    protected String nama;
    protected double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract void status();

    public abstract double hitungHarga();

    public void tampilkanInfo() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: Rp" + harga);

    }
}