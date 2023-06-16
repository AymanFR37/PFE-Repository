package ma.geo.gescolarite.entities;

import javax.persistence.Entity;

//@Entity
public class UserEntity extends PersonEntity{
    private String email;
    private String password;

    public UserEntity(String firstName, String lastName, String sexe, String email, String password) {
        super(firstName, lastName, sexe);
        this.email = email;
        this.password = password;
    }

    public UserEntity() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
