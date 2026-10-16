package Jobsheet7.studikasus;

final class ResepRahasia {
    private String namaResep;
    private String bahanRahasia;

    public ResepRahasia(String namaResep, String bahanRahasia) {
        this.namaResep = namaResep;
        this.bahanRahasia = bahanRahasia;
    }

    public void tampilkanResep() {
        System.out.println("Resep '" + namaResep + "' hanya boleh diakses Kepala Chef. Bahan rahasia: " + bahanRahasia
                + ". Dijaga ketat.");
    }
}