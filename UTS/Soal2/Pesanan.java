package UTS.Soal2;

public class Pesanan {
    public static void main(String[] args) {
        Makanan makanan = new Makanan("Ramen katsu", 18000, 3);
        Minuman minuman = new Minuman("Milky Matcha", 18000, 10, 300);
        Dessert dessert = new Dessert("pudding coklat", 15000, 2);

        System.out.println("\n=== Detail Pesanan ==== ");
        makanan.tampilkanInfo();
        makanan.status();
        System.out.println("--------------------");
        minuman.tampilkanInfo();
        minuman.status();
        System.out.println("--------------------");
        dessert.tampilkanInfo();
        dessert.status();
        System.out.println("--------------------");

    }
}
