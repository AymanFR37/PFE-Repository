package ma.geo.gescolarite.dtos;

import ma.geo.gescolarite.Roles.Roles;
import ma.geo.gescolarite.entities.GroupeEntity;

import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.Set;

public class StudentDto {

    private int id;
    private String email;
    private String password;
    private String address;
    private String firstName;
    private String lastName;
    private String sexe;
    private GroupDto groupe;
    private LocalDate dateOfBirth;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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



    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public GroupDto getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupDto groupe) {
        this.groupe = groupe;
    }

    public StudentDto() {
    }

    public StudentDto(String email, String password, String address, String firstName, String lastName, String sexe, LocalDate dateOfBirth, GroupDto groupe) {
        this.email = email;
        this.password = password;
        this.address = address;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sexe = sexe;
        this.dateOfBirth = dateOfBirth;
        this.groupe = groupe;
    }
}
