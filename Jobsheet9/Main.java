public class Main {
    public static void main(String[] args) {
        Matras matras = new Matras("Matras Angin", 500, 5);
        Tenda tenda = new Tenda("Tenda Dome", 2500, 4);
        JasHujan jasHujan = new JasHujan("Jas Hujan Poncho", 300, "Biru");

        System.out.println("=== Gunakan perlengkapan ===");
        matras.gunakan();
        tenda.gunakan();
        jasHujan.gunakan();

        System.out.println("\n=== Foldable(bisa dilipat) ===");
        matras.lipat();
        matras.buka();
        tenda.lipat();
        tenda.buka();

        System.out.println("\n==== Waterproof(tahan air) ====");
        tenda.tahanAir();
        jasHujan.tahanAir();

        System.out.println("\n==== Interface sebagai tipe ====");
        Foldable benda = tenda;
        benda.lipat();

        System.out.println("\n==== Kompas ====");
        Kompas k = new KompasSaku("Kompas Lipat", 120, 90);
        k.gunakan();
        System.out.println("Akurasi: " + k.getAkurasi());
    }
}
