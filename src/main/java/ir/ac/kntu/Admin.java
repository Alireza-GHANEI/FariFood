package ir.ac.kntu;

public class Admin {

    private final String username;
    private final String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    boolean verifyAdmin(String username,String password) {
        return username.equals(this.username) && password.equals(this.password);
    }
}
