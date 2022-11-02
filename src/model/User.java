package model;

public class User {
    private String firstName;
    private String lastName;
    private final String email;
    private String image;
    private boolean isBanned;

    public User(String firstName, String lastName, String email, String image) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.image = image;
        this.isBanned = false;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", image='" + image + '\'' +
                ", isBanned=" + isBanned +
                '}';
    }
}
