public class MouseDemo {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse();
        mouse1.merk = "Logitech";
        mouse1.ukuran = "Medium";
        mouse1.tipe = "Wireless";
        mouse1.warna = "Hitam";
        mouse1.setHarga(150000);

        Mouse mouse2 = new Mouse();
        mouse2.merk = "Razer";
        mouse2.ukuran = "Large";
        mouse2.tipe = "USB";
        mouse2.warna = "Hijau";
        mouse2.setHarga(450000);

        System.out.println("=== Data awal ===");
        mouse1.tampilInfo();
        mouse1.klik();
        System.out.println();
        mouse2.tampilInfo();
        mouse2.klik();

        mouse1.setHarga(120000);
        mouse1.warna = "Putih";

        mouse2.setHarga(400000);
        mouse2.merk = "Razer Viper";

        System.out.println("\n=== Setelah update atribut ===");
        mouse1.tampilInfo();
        mouse1.klik();

        System.out.println();

        mouse2.tampilInfo();
        mouse2.klik();
    }
}
