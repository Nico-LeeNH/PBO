package Jobsheet4.Restoran;

import java.time.LocalDate;

public class Pesanan {
    private LocalDate tanggal;
    private Karyawan kasir;
    private Karyawan pelayan;

    public LocalDate getTanggal() {
        return tanggal;
    }

    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }

    public Karyawan getKasir() {
        return kasir;
    }

    public void setKasir(Karyawan kasir) {
        this.kasir = kasir;
    }

    public Karyawan getPelayan() {
        return pelayan;
    }

    public void setPelayan(Karyawan pelayan) {
        this.pelayan = pelayan;
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal: " + tanggal;
        info += ", Kasir: " + kasir.getInfo();
        info += ", Pelayan: " + pelayan.getInfo();
        info += "\n";

        return info;
    }
}
