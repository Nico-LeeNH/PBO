package UTS.Soal3;

public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc; // dokumen: .jpg, .png, .pdf

    public UserProfile(int userId, String password, String name, int age, String emailId) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return emailId;
    }

    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        System.out.println("Profil diperbarui");
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public void showDocuments() {
        System.out.println("Dokumen: " + doc);
    }
}