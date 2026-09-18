package Jobsheet4.Restoran;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private ArrayList<Pesanan> riwayatPesanan;

    public Pelanggan(String idPelanggan, String nama) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.riwayatPesanan = new ArrayList<Pesanan>();
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tambahPesanan(LocalDate tanggal, Karyawan kasir, Karyawan pelayan) {
        Pesanan pesanan = new Pesanan();
        pesanan.setTanggal(tanggal);
        pesanan.setKasir(kasir);
        pesanan.setPelayan(pelayan);
        riwayatPesanan.add(pesanan);
    }

    public String getInfo() {
        String info = "";
        info += "ID Pelanggan   : " + this.idPelanggan + "\n";
        info += "Nama           : " + this.nama + "\n";

        if (!riwayatPesanan.isEmpty()) {
            info += "Riwayat Pesanan:\n";
            for (Pesanan pesanan : riwayatPesanan) {
                info += pesanan.getInfo();
            }
        } else {
            info += "Belum ada riwayat pesanan";
        }

        info += "\n";
        return info;
    }
}