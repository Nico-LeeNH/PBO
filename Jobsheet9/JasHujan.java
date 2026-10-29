public class JasHujan extends PerlengkapanCamping implements Waterproof{
    private String warna;

    public JasHujan(String nama, int beratGram, String warna) {
        super(nama, beratGram);
        this.warna = warna;
    }

    public String getWarna() { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    @Override
    public void gunakan() {
        System.out.println(getNama() + " warna " + warna + " dipakai saat hujan.");
    }

    @Override
    public void tahanAir() {
        System.out.println(getNama() + " tahan air.");
    }
}