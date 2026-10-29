public class Tenda extends PerlengkapanCamping implements Foldable, Waterproof{
    private int muatan;

    public Tenda(String nama, int beratGram, int muatan) {
        super(nama, beratGram);
        this.muatan = muatan;
    }

    public int getMuatan() { return muatan; }
    public void setMuatan(int muatan) { this.muatan = muatan; }

    @Override
    public void gunakan() {
        System.out.println(getNama() + " dipasang untuk " + muatan + " orang.");
    }

    @Override
    public void lipat() {
        System.out.println(getNama() + " dilipat dan dimasukkan ke tas.");
    }

    @Override
    public void buka() {
        System.out.println(getNama() + " dibuka dan siap dipasang.");
    }

    @Override
    public void tahanAir() {
        System.out.println(getNama() + " tahan air, aman saat hujan.");
    }
}
