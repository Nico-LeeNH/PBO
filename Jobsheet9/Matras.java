public class Matras extends PerlengkapanCamping implements Foldable {
    private int tebal;

    public Matras(String nama, int beratGram, int tebal) {
        super(nama, beratGram);
        this.tebal = tebal;
    }

    public int getTebal() { return tebal; }
    public void setTebal(int tebal) { this.tebal = tebal; }

    @Override
    public void gunakan() {
        System.out.println(getNama() + " digelar sebagai alas tidur.");
    }

    @Override
    public void lipat() {
        System.out.println(getNama() + " dilipat.");
    }

    @Override
    public void buka() {
        System.out.println(getNama() + " dibuka.");
    }
}
