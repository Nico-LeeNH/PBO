package tugas;

public class HewanLautMain {
    public static void main(String[] args) {

        System.out.println("=== Instansiasi ikan1 dengan constructor berparameter ===");
        Ikan ikan1 = new Ikan("Ikan Badut (Clownfish)", "Terumbu Karang", 0.25, 3);
        System.out.println(ikan1.getAllInfo());

        System.out.println("=== Instansiasi paus1 dengan constructor tanpa parameter, lalu isi manual ===");
        Paus paus1 = new Paus();
        paus1.setNamaSpesies("Paus Biru");
        paus1.setHabitat("Laut Lepas");
        paus1.setBeratBadan(150000);
        paus1.setDurasiMenyelamMenit(15);
        System.out.println(paus1.getAllInfo());

        // ---- Modifikasi atribut (milik sendiri & warisan parent)
        System.out.println("=== Setelah modifikasi atribut pada ikan1 ===");
        ikan1.setHabitat("Akuarium"); 
        ikan1.setJumlahSirip(4); 
        System.out.println(ikan1.getAllInfo());
    }
}
