package Jobsheet7.studikasus;

public class PegawaiRestoran {
    public final String NAMA_RESTORAN = "Resto Laut Nusantara";
    public final double JAM_KERJA_STANDAR = 160;

    private String nama;
    private String id;
    private double gaji;
    private double jamKerja; // jam kerja pegawai per bulan

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
        return jamKerja;
    }

    public void setJamKerjaAktual(double jamKerjaAktual) {
        this.jamKerja = jamKerjaAktual;
    }

    public double hitungPerforma() {
        return jamKerja / JAM_KERJA_STANDAR;
    }

    public final void lihatPeraturanKerja() {
        System.out.println("Peraturan " + NAMA_RESTORAN + ": datang tepat waktu, jaga kebersihan, utamakan pelanggan.");
    }

    public void tampilkanTugas() {
        System.out.println(nama + " (" + id + "): bertugas sesuai jobdesk masing-masing di " + NAMA_RESTORAN + ".");
    }

    public double hitungBonus() {
        return gaji * 0.05;
    }

    public double hitungBonus(double performa) {
        return hitungBonus() * performa;
    }

    public String getInfoDasar() {
        return "Nama: " + nama + " | ID: " + id + " | Gaji: Rp" + gaji;
    }
}