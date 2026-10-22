package Praktikum8.Tugas;

public class Pesanan {
    public static void main(String[] args) {
        Menu makanan = new Makanan("Ramen katsu", 18000, 3);
        Menu minuman = new Minuman("Milky Matcha", 18000, 10, 300);
        Menu dessert = new Dessert("pudding coklat", 15000, 2);

        System.out.println("\n=== Detail Pesanan ==== ");
        System.out.println("\n===== Makanan =====");
        makanan.tampilkanInfo();
        makanan.status();
        System.out.println("\n===== Minuman =====");
        minuman.tampilkanInfo();
        minuman.status();
        System.out.println("\n===== Dessert =====");
        dessert.tampilkanInfo();
        dessert.status();
        System.out.println("=====================");

        double totalBayar = makanan.hitungHarga() + minuman.hitungHarga() + dessert.hitungHarga();
        System.out.println("Total Bayar: " + totalBayar);
    }
}
