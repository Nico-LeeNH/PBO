public class Mouse {
    public String merk;
    public String ukuran;
    public String tipe;
    public String warna;
    public double harga;

    public String getMerk() {
        return merk;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void klik() {
        System.out.println("[" + merk + "] Mouse diklik.");
    }

    public void tampilInfo() {
        System.out.println("Merek        : " + merk);
        System.out.println("Ukuran       : " + ukuran);
        System.out.println("Tipe         : " + tipe);
        System.out.println("Warna        : " + warna);
        System.out.println("Harga        : " + harga);
    }
}
