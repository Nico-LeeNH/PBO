package Jobsheet7.studikasus;

public class PegawaiRestoran {
    // FINAL ATTRIBUTE
    public final String NAMA_RESTORAN = "Resto Laut Nusantara";
    // FINAL ATTRIBUTE #2: jam kerja standar per bulan, sama untuk semua pegawai,
    // tidak boleh diubah
    public final double JAM_KERJA_STANDAR = 160;

    private String nama;
    private String id;
    private double gaji;
    private double jamKerjaAktual; // jam kerja aktual pegawai per bulan, dipakai untuk hitung performa

    public PegawaiRestoran() {
        System.out.println("Objek PegawaiRestoran dibuat");
    }

    public PegawaiRestoran(String nama, String id, double gaji) {
        this.nama = nama;
        this.id = id;
        this.gaji = gaji;
        System.out.println("Objek PegawaiRestoran dibuat dengan constructor berparameter");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getJamKerjaAktual() {
        return jamKerjaAktual;
    }

    public void setJamKerjaAktual(double jamKerjaAktual) {
        this.jamKerjaAktual = jamKerjaAktual;
    }

    // performa dihitung dari rasio jam kerja aktual terhadap jam kerja standar
    // contoh: jamKerjaAktual 176 jam / JAM_KERJA_STANDAR 160 jam = performa 1.1
    // (melebihi standar)
    public double hitungPerforma() {
        return jamKerjaAktual / JAM_KERJA_STANDAR;
    }

    // FINAL METHOD: tidak boleh di-override di class Koki/Pelayan
    public final void lihatPeraturanKerja() {
        System.out.println("Peraturan " + NAMA_RESTORAN + ": datang tepat waktu, jaga kebersihan, utamakan pelanggan.");
    }

    public void tampilkanTugas() {
        System.out.println(nama + " (" + id + "): bertugas sesuai jobdesk masing-masing di " + NAMA_RESTORAN + ".");
    }

    public double hitungBonus() {
        return gaji * 0.05;
    }

    // OVERLOADING: hitungBonus() dengan parameter performa
    public double hitungBonus(double performa) {
        return hitungBonus() * performa;
    }

    public String getInfoDasar() {
        return "Nama: " + nama + " | ID: " + id + " | Gaji: Rp" + gaji;
    }
}
