package tugas;

public class HewanLaut {
    private String namaSpesies;
    private String habitat;
    private double beratBadan;

    public HewanLaut() {
    
    }

    public HewanLaut(String namaSpesies, String habitat, double beratBadan) {
        this.namaSpesies = namaSpesies;
        this.habitat = habitat;
        setBeratBadan(beratBadan);
    }

    public String getNamaSpesies() {
        return namaSpesies;
    }

    public String getHabitat() {
        return habitat;
    }

    public double getBeratBadan() {
        return beratBadan;
    }

    // Setter
    public void setNamaSpesies(String namaSpesies) {
        this.namaSpesies = namaSpesies;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setBeratBadan(double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public String getInfo() {
        String info = "";
        info += "Nama Spesies    : " + namaSpesies + "\n";
        info += "Habitat         : " + habitat + "\n";
        info += "Berat Badan     : " + beratBadan + " kg\n";
        return info;
    }
}
