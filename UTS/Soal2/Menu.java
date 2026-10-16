package UTS.Soal2;

public class Menu {
    protected String nama;
    protected double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void sajikan() {
        System.out.println(nama + "disajikan");
    }

    public double hitungHarga() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println("Menu: " + nama);
        System.out.println("Harga: Rp" + harga);

    }
}
