package Jobsheet7.studikasus;

public class Koki extends PegawaiRestoran {
    private String spesialisasiMasakan;

    public Koki() {
        System.out.println("Objek Koki dibuat");
    }

    public Koki(String nama, String id, double gaji, String spesialisasiMasakan) {
        super(nama, id, gaji);
        this.spesialisasiMasakan = spesialisasiMasakan;
        System.out.println("Objek Koki dibuat dengan constructor berparameter");
    }

    public String getSpesialisasiMasakan() {
        return spesialisasiMasakan;
    }

    public void setSpesialisasiMasakan(String spesialisasiMasakan) {
        this.spesialisasiMasakan = spesialisasiMasakan;
    }

    @Override
    public void tampilkanTugas() {
        System.out.println(getNama() + " (Koki, spesialisasi " + spesialisasiMasakan
                + "): memasak pesanan sesuai menu di dapur " + NAMA_RESTORAN + ".");
    }

    @Override
    public double hitungBonus() {
        double bonusDasar = super.hitungBonus();
        double tunjanganDapur = 150000;
        return bonusDasar + tunjanganDapur;
    }
}