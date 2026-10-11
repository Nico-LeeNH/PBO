package Jobsheet7.Tugas;

public class Main {
    public static void main(String[] args) {
        Manusia m;

        m = new Manusia();
        System.out.println("=== new Manusia ===");
        m.bernafas();
        m.makan();

        m = new Dosen();
        System.out.println("=== Dosen ===");
        m.bernafas();
        m.makan();
        ((Dosen) m).lembur();

        m = new Mahasiswa();
        System.out.println("=== Mahasiswa ===");
        m.bernafas();
        m.makan();
        ((Mahasiswa) m).tidur();

        System.out.println("=== Manusia(array) ===");
        Manusia[] daftar = { new Manusia(), new Dosen(), new Mahasiswa() };
        for (Manusia x : daftar) {
            x.makan();
        }
    }
}