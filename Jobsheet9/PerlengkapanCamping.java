public abstract class PerlengkapanCamping {
    private String nama;
    private int beratGram;

    public PerlengkapanCamping(String nama, int beratGram) {
        this.nama = nama;
        this.beratGram = beratGram;
    }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getBeratGram() { return beratGram; }
    public void setBeratGram(int beratGram) { this.beratGram = beratGram; }

    // Method abstract: cara pakai tiap perlengkapan berbeda-beda
    public abstract void gunakan();
}
