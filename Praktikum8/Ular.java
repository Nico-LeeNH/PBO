package Praktikum8;

public class Ular extends Hewan {
    public boolean isBerbisa;

    public Ular(boolean isBerbisa, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.isBerbisa = isBerbisa;
    }

    @Override
    public void bernapas() {
        System.out.println("Otot tulang rusuk, udara masuk lewat hidung");
        System.out.println("Trakea mengirimkan udara ke paru-paru");
        System.out.println("Otot tulang rusuk relaksasi, udara dikeluarkan lewat hidung");
    }

    @Override
    public void bergerak() {
        System.out.println("Mengerutkan oto dari segala sisi hingga membentuk lengkungan");
        System.out.println("Menemukan titik penahan seperti batu pohon");
        System.out.println("Menggunakan sisik untuk mendorong tubuh ke depan");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Berbisa   :" + (this.isBerbisa ? "Ya" : "Tidak"));
    }
}