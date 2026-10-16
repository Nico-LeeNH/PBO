package UTS.Soal3;

public class Customer extends User {
    private boolean verificationStatus = false;

    public Customer(int userId, String password, String name, int age, String emailId) {
        super(userId, password, name, age, emailId);
    }

    public boolean getVerificationStatus() {
        return verificationStatus;
    }

    public void applyVerification(String doc) {
        this.profile.setDoc(doc);
        System.out.println("Customer apply verifikasi menggunakan dokuman: " + doc);
        this.verificationStatus = true;
    }
}