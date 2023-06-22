package ma.geo.gescolarite.dtos;

import ma.geo.gescolarite.roles.Roles;

import java.time.LocalDate;
import java.util.Set;

public class StudentAddDto {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String address;
    private String sexe;
    private GroupDto groupe;
    private Set<Roles> roles;


    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }

    public StudentAddDto(String firstName, String lastName, LocalDate dateOfBirth, String address, String sexe, GroupDto groupe, Set<Roles> roles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.sexe = sexe;
        this.groupe = groupe;
        this.roles = roles;
    }

    public StudentAddDto() {
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
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


    public GroupDto getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupDto groupe) {
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "StudentAddDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", sexe='" + sexe + '\'' +
                ", groupe=" + groupe +
                '}';
    }
}
