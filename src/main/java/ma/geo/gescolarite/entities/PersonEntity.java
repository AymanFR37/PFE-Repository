package ma.geo.gescolarite.entities;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PersonEntity {
    private String firstName;
    private String lastName;
    private String sexe;

    public PersonEntity(String firstName, String lastName, String sexe) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sexe = sexe;
    }

    public PersonEntity() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sexe='" + sexe + '\'' +
                '}';
    }
}
