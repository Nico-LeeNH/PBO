package Jobsheet7.Tugas;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        System.out.println("Dosen makan di kantin dosen");
    }

    public void lembur() {
        System.out.println("Dosen lembur menyiapkan materi dan menilai tugas");
    }
}