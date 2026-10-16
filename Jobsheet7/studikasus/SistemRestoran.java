package Jobsheet7.studikasus;

public class SistemRestoran {
        public static void main(String[] args) {

                Koki koki1 = new Koki("Andi", "K001", 4500000, "Seafood");
                Pelayan pelayan1 = new Pelayan("Budi", "P001", 3000000, 8);

                koki1.setJamKerjaAktual(176);
                pelayan1.setJamKerjaAktual(120);

                System.out.println("\n=== Menampilkan tugas spesifik tiap role) ===");
                koki1.tampilkanTugas();
                pelayan1.tampilkanTugas();

                System.out.println("\n=== Perhitungan logika bonus ===");
                System.out.println(koki1.getNama() + " (Koki)    -> Bonus: Rp" + koki1.hitungBonus()
                                + "  (dasar 5% gaji + tunjangan dapur tetap)");
                System.out.println(pelayan1.getNama() + " (Pelayan) -> Bonus: Rp" + pelayan1.hitungBonus()
                                + "  (dasar 5% gaji + Rp10.000 x jumlah meja)");

                System.out.println("\n=== Menghitung performa kerja sesuai jam kerja ===");
                double performaKoki = koki1.hitungPerforma();
                double performaPelayan = pelayan1.hitungPerforma();
                System.out.println(
                                koki1.getNama() + ": " + koki1.getJamKerjaAktual() + " jam / " + koki1.JAM_KERJA_STANDAR
                                                + " jam standar -> performa = " + performaKoki);
                System.out.println(
                                pelayan1.getNama() + ": " + pelayan1.getJamKerjaAktual() + " jam / "
                                                + pelayan1.JAM_KERJA_STANDAR
                                                + " jam standar -> performa = " + performaPelayan);

                System.out.println(
                                "\n=== Menghitung bonus dari performa ===");
                System.out.println(koki1.getNama() + " -> Rp" + koki1.hitungBonus(performaKoki));
                System.out.println(pelayan1.getNama() + " -> Rp" + pelayan1.hitungBonus(performaPelayan));

                System.out.println("\n=== Peraturan Kerja ===");
                koki1.lihatPeraturanKerja();
                pelayan1.lihatPeraturanKerja();

                System.out.println("\n=== Menampilkan nama restoran ===");
                System.out.println("Koki bekerja di: " + koki1.NAMA_RESTORAN);
                System.out.println("Pelayan bekerja di: " + pelayan1.NAMA_RESTORAN);

                System.out.println("\n=== ResepRahasia ===");
                ResepRahasia resep1 = new ResepRahasia("Sup Ikan Rempah", "campuran rempah khas keluarga");
                resep1.tampilkanResep();
        }
}