package hello;

public class User {
    private long id;
    private String email;
    private String username;
    private String password;

    public User() {

    }

    public User(long id, String email, String username, String password) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        String info = String.format("User Info: id = %d, email = %s, username = %s, password = %s", id, email, username, password);
        return info;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof User) {
            User that = (User) other;
            if (this.id == that.id && this.username.equals(that.username) && this.email.equals(that.email)) {
                return true;
            }
            return false;
        }
        return false;
    }

}