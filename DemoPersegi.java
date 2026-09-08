public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang persegi1 = new PersegiPanjang();
        persegi1.panjang = 12;
        persegi1.lebar = 8;

        persegi1.displayInfo();
        System.out.println("Luas     : " + persegi1.getLuas());
        System.out.println("Keliling : " + persegi1.getKeliling());
    }
}
