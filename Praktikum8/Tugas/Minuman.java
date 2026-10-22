package Praktikum8.Tugas;

public class Minuman extends Menu {
    private int suhu;
    private int ukuranGelas;

    public Minuman(String nama, double harga, int suhu, int ukuranGelas) {
        super(nama, harga);
        this.suhu = suhu;
        this.ukuranGelas = ukuranGelas;
    }

    @Override
    public void status() {
        System.out.println("Minuman: " + nama + " sedang dibuat");
    }

    // pajak 10%
    @Override
    public double hitungHarga() {
        return harga * 1.10;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suhu: " + suhu + " derajat");
        System.out.println("Ukuran gelas: " + ukuranGelas + " ml");
        System.out.println("--------------------------");
        System.out.println("Total(kena pajak 10%): " + hitungHarga());
    }
}