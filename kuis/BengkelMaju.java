import java.util.ArrayList;
import java.util.List;

class Pelanggan {
    private String nama;
    private String nomorTelepon;
    private List<Kendaraan> daftarKendaraan = new ArrayList<>();

    public Pelanggan(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    void tambahKendaraan(Kendaraan kendaraan) {
        daftarKendaraan.add(kendaraan);
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public List<Kendaraan> getDaftarKendaraan() {
        return daftarKendaraan;
    }
}

abstract class Kendaraan {
    private String platNomor;
    private String merek;
    private String model;
    private String tipeKendaraan;
    private Pelanggan pemilik;

    public Kendaraan(String platNomor, String merek, String model, String tipeKendaraan, Pelanggan pemilik) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.model = model;
        this.tipeKendaraan = tipeKendaraan;
        this.pemilik = pemilik;
        pemilik.tambahKendaraan(this);
    }

    // method abstrak: setiap jenis kendaraan punya biaya tambahan layanan yang berbeda
    public abstract double getBiayaTambahan();

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public Pelanggan getPemilik() {
        return pemilik;
    }

    public String getInfo() {
        return tipeKendaraan + " " + merek + " " + model + " (" + platNomor + ")";
    }
}

class Mobil extends Kendaraan {
    public Mobil(String platNomor, String merek, String model, Pelanggan pemilik) {
        super(platNomor, merek, model, "Mobil", pemilik);
    }

    @Override
    public double getBiayaTambahan() {
        return 50000;
    }
}

class SepedaMotor extends Kendaraan {
    public SepedaMotor(String platNomor, String merek, String model, Pelanggan pemilik) {
        super(platNomor, merek, model, "Sepeda Motor", pemilik);
    }

    @Override
    public double getBiayaTambahan() {
        return 20000;
    }
}

class Layanan {
    private String serviceName;
    private double servicePrice;

    public Layanan(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }
}

class Karyawan {
    private String idKaryawan;
    private String namaKaryawan;
    private String posisi;
    private List<Layanan> layananDitangani = new ArrayList<>();

    public Karyawan(String idKaryawan, String namaKaryawan, String posisi) {
        this.idKaryawan = idKaryawan;
        this.namaKaryawan = namaKaryawan;
        this.posisi = posisi;
    }

    // Karyawan mengerjakan sebuah layanan untuk kendaraan tertentu
    public double kerjakanLayanan(Layanan layanan, Kendaraan kendaraan) {
        layananDitangani.add(layanan);
        double totalBiaya = layanan.getServicePrice() + kendaraan.getBiayaTambahan();
        System.out.println(namaKaryawan + " (" + posisi + ") mengerjakan " + layanan.getServiceName()
                + " untuk " + kendaraan.getInfo()
                + " -> Rp" + totalBiaya);
        return totalBiaya;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public List<Layanan> getLayananDitangani() {
        return layananDitangani;
    }
}

public class BengkelMaju {
    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("Andi Chandra", "081211112222");
        Pelanggan p2 = new Pelanggan("Rachma Nur C", "081333334444");

        Mobil mobil1 = new Mobil("N 1234 ABC", "Toyota", "Avanza", p1);
        Mobil mobil2 = new Mobil("N 5678 DEF", "Honda", "Brio", p2);
        SepedaMotor motor1 = new SepedaMotor("L 1233 QR", "Yamaha", "NMAX", p1);
        SepedaMotor motor2 = new SepedaMotor("B 4456 RQ", "Honda", "Beat", p2);

        Layanan gantiOli = new Layanan("Ganti Oli", 100000);
        Layanan servisRem = new Layanan("Servis Rem", 150000);
        Layanan tuneUp = new Layanan("Tune Up", 200000);

        Karyawan mekanik1 = new Karyawan("K01", "Joko", "Mekanik Senior");
        Karyawan mekanik2 = new Karyawan("K02", "Asep", "Mekanik");

        System.out.println("=== Proses Servis ===");
        double totalMobil1 = mekanik1.kerjakanLayanan(gantiOli, mobil1);
        double totalMobil2 = mekanik2.kerjakanLayanan(tuneUp, mobil2);
        double totalMotor1 = mekanik1.kerjakanLayanan(servisRem, motor1);
        double totalMotor2 = mekanik2.kerjakanLayanan(gantiOli, motor2);

        System.out.println("\n=== Ringkasan Layanan perPelanggan ===");
        cetakRingkasan(p1);
        cetakRingkasan(p2);

        double Total = totalMobil1 + totalMobil2 + totalMotor1 + totalMotor2;
        System.out.println("Total perkiraan biaya seluruh layanan: Rp" + Total);
    }

    private static void cetakRingkasan(Pelanggan pelanggan) {
        System.out.println("Pelanggan: " + pelanggan.getNama() + " (" + pelanggan.getNomorTelepon() + ")");
        for (Kendaraan k : pelanggan.getDaftarKendaraan()) {
            System.out.println("  - " + k.getInfo());
        }
    }
}