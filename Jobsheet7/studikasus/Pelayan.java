package Jobsheet7.studikasus;

public class Pelayan extends PegawaiRestoran {
    private int jumlahMejaDitangani;

    public Pelayan() {
        System.out.println("Objek Pelayan dibuat");
    }

    public Pelayan(String nama, String id, double gaji, int jumlahMejaDitangani) {
        super(nama, id, gaji);
        this.jumlahMejaDitangani = jumlahMejaDitangani;
        System.out.println("Objek Pelayan dibuat dengan constructor berparameter");
    }

    public int getJumlahMejaDitangani() {
        return jumlahMejaDitangani;
    }

    public void setJumlahMejaDitangani(int jumlahMejaDitangani) {
        this.jumlahMejaDitangani = jumlahMejaDitangani;
    }

    // OVERRIDING #1: tugas pelayan beda dari tugas umum pegawai
    @Override
    public void tampilkanTugas() {
        System.out.println(getNama() + " (Pelayan): melayani " + jumlahMejaDitangani
                + " meja dan mengantar pesanan di " + NAMA_RESTORAN + ".");
    }

    // OVERRIDING #2: rumus bonus pelayan beda dengan bonus dasar (dari parent)
    @Override
    public double hitungBonus() {
        double bonusDasar = super.hitungBonus();
        double bonusPerMeja = jumlahMejaDitangani * 10000;
        return bonusDasar + bonusPerMeja;
    }
}