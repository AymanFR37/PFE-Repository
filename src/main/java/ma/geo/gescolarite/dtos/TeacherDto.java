package ma.geo.gescolarite.dtos;

import ma.geo.gescolarite.roles.Roles;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class TeacherDto{
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String sexe;
    private MatiereDto matiere;
    private Set<Roles> roles;

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    public TeacherDto(String id, String firstName, String lastName, String address, String sexe, MatiereDto matiere, Set<Roles> roles) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.sexe = sexe;
        this.matiere = matiere;
        this.roles = roles;
    }

    public TeacherDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public MatiereDto getMatiere() {
        return matiere;
    }

    public void setMatiere(MatiereDto matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "TeacherDto{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", sexe='" + sexe + '\'' +
                ", matiere=" + matiere +
                ", roles=" + roles +
                '}';
    }
}
