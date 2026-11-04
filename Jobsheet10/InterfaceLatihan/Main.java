package Jobsheet10.InterfaceLatihan;

public class Main {
    public static void main(String[] args) {
        Kipas kipas = new Kipas("Kipas Bloweri", 1000000, "Hitam", "Sekai");
        TV tv = new TV("LED", 50, 3500000, "Hitam", "LG");
        Kulkas kulkas = new Kulkas(2, 2800000, "Silver", "Samsung");
        SmartFridge smartFridge = new SmartFridge(10, 3, 9500000, "Abu-abu", "LG");

        System.out.println("==== KIPAS ====");
        System.out.println(kipas.getInfo());

        System.out.println("\n==== KULKAS ====");
        System.out.println(kulkas.getInfo());

        System.out.println("\n==== TV ====");
        System.out.println(tv.getInfo());

        System.out.println("\n==== SMART FRIDGE ====");
        System.out.println(smartFridge.getInfo());

        System.out.println("\n==== Uji Volume (Audible) ====");
        tv.naikkanVolume(5);
        System.out.println("Volume TV setelah dinaikkan 5          : " + tv.getVolume());
        smartFridge.turunkanVolume(4);
        System.out.println("Volume SmartFridge setelah diturunkan 4: " + smartFridge.getVolume());
    }
}
