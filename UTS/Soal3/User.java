package UTS.Soal3;

public class User {
    protected UserProfile profile;

    public User(int userId, String password, String name, int age, String emailId) {
        this.profile = new UserProfile(userId, password, name, age, emailId);
    }

    public boolean logIn(int userId, String password) {
        System.out.println("ID User " + userId + " berhasil login");
        return true;
    }

    public void recoverPassword() {
        System.out.println("Link reset password telah dikirim ");
    }

    public void logOut() {
        System.out.println("User berhasil logout");
    }
}