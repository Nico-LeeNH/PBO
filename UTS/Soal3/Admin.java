package UTS.Soal3;

public class Admin extends User {
    public Admin(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public void updateVehicleDetails(int vehicleId) {
        System.out.println("Admin memperbarui detail kendaraan dengan id" + vehicleId);
    }

    public void addVehicle(int vehicleId) {
        System.out.println("Admin menambahkan kendaraan dengan id " + vehicleId);
    }

    public void retrieveComplain() {
        System.out.println("Admin membaca keluhan pelanggan");
    }

    public void verifyUser(Customer customer) {
        System.out.println("Customer berhasil diverifikasi");
    }
}