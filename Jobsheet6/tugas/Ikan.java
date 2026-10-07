package tugas;

public class Ikan extends HewanLaut {
    private int jumlahSirip;

    // Constructor tanpa parameter
    public Ikan() {
        System.out.println("Objek dari class Ikan dibuat");
    }

    // Constructor berparameter: memanggil super() berparameter milik parent
    public Ikan(String namaSpesies, String habitat, double beratBadan, int jumlahSirip) {
        super(namaSpesies, habitat, beratBadan);
        setJumlahSirip(jumlahSirip);
        System.out.println("Objek dari class Ikan dibuat dengan constructor berparameter");
    }

    public int getJumlahSirip() {
        return jumlahSirip;
    }

    public void setJumlahSirip(int jumlahSirip) {
        if (jumlahSirip > 0) {
            this.jumlahSirip = jumlahSirip;
        } else {
            System.out.println("Jumlah sirip tidak valid, harus lebih dari 0");
        }
    }

    // method gabungan info parent + info tambahan milik Ikan
    public String getAllInfo() {
        String info = super.getInfo();
        info += "Jumlah Sirip    : " + jumlahSirip + "\n";
        return info;
    }
}
