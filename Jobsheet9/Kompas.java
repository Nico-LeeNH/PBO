public abstract class Kompas extends PerlengkapanCamping implements Foldable{
    private int akurasi;

    public Kompas(String nama, int beratGram, int akurasi) {
        super(nama, beratGram);
        this.akurasi = akurasi;
    }

    public int getAkurasi() { return akurasi; }
    public void setAkurasi(int akurasi) { this.akurasi = akurasi; }

    @Override
    public void gunakan() {
        System.out.println(getNama() + " dipakai untuk menentukan arah.");
    }

    @Override
    public void buka() {
        System.out.println("Tutup " + getNama() + " dibuka.");
    }
    // lipat() sengaja tidak ditulis, nanti diisi oleh class turunan Kompas
}
