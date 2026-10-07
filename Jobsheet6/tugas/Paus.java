package tugas;

public class Paus extends HewanLaut {
    private int durasiMenyelamMenit;

    // Constructor tanpa parameter
    public Paus() {
        System.out.println("Objek dari class Paus dibuat()");
    }

    // Constructor berparameter
    public Paus(String namaSpesies, String habitat, double beratBadan, int durasiMenyelamMenit) {
        super(namaSpesies, habitat, beratBadan);
        setDurasiMenyelamMenit(durasiMenyelamMenit);
        System.out.println("Objek dari class Paus dibuat dengan constructor berparameter");
    }

    public int getDurasiMenyelamMenit() {
        return durasiMenyelamMenit;
    }

    public void setDurasiMenyelamMenit(int durasiMenyelamMenit) {
        if (durasiMenyelamMenit > 0) {
            this.durasiMenyelamMenit = durasiMenyelamMenit;
        } else {
            System.out.println("Durasi menyelam tidak valid, harus lebih dari 0");
        }
    }

    public String getAllInfo() {
        String info = super.getInfo();
        info += "Durasi Menyelam : " + durasiMenyelamMenit + " menit\n";
        return info;
    }
}
