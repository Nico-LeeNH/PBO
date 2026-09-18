package Jobsheet4.Restoran;

import java.time.LocalDate;

public class RestoranDemo {
    public static void main(String[] args) {
        Karyawan andi = new Karyawan("K1", "Andi");
        Karyawan budi = new Karyawan("K2", "Budi");
        Karyawan citra = new Karyawan("K3", "Citra");
        Karyawan dewi = new Karyawan("K4", "Dewi");

        Pelanggan pelanggan1 = new Pelanggan("P1", "Adi");
        pelanggan1.tambahPesanan(LocalDate.of(2026, 9, 18), andi, citra);
        pelanggan1.tambahPesanan(LocalDate.of(2026, 9, 17), budi, dewi);

        System.out.println(pelanggan1.getInfo());

        Pelanggan pelanggan2 = new Pelanggan("P2", "Ayu");
        System.out.println(pelanggan2.getInfo());
    }

}
