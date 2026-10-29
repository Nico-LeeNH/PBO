public class KompasSaku extends Kompas{
    public KompasSaku(String nama, int beratGram, int akurasi){
        super(nama, beratGram, akurasi);
    }

    @Override 
    public void lipat(){
        System.out.println("Tutup " + getNama() + " ditutup dan disimpan di saku");
    }
}
