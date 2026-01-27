package pract3_koshynskyi;

public class User {
    private String email;
    User(String email) {
        setEmail(email);
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("Email is null or blank");
        }
        this.email = email;
    }
    @Override
    public String toString() {
        return "UserEmail = " + email;
    }
}
