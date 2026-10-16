package UTS.Soal3;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "adi123", "Adi", 21, "adi@gmail.com");
        Admin admin = new Admin(2, "admin99", "Sari", 30, "sari@mail.com");

        customer.logIn(1, "adi123");
        customer.applyVerification("ktp.jpg");
        System.out.println("Sudah terverifikasi? " + customer.getVerificationStatus());

        admin.logIn(2, "admin01");
        admin.verifyUser(customer);
        System.out.println("Sudah terverifikasi? " + customer.getVerificationStatus());
        admin.addVehicle(111);
        admin.updateVehicleDetails(111);
        admin.retrieveComplain();
        admin.logOut();
    }
}