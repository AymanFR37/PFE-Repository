package ma.geo.gescolarite.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ma.geo.gescolarite.roles.Roles;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class StudentEntity extends UserEntity {

    private LocalDate dateOfBirth;

    @ManyToOne
    private GroupeEntity groupe;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public GroupeEntity getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupeEntity groupe) {
        this.groupe = groupe;
    }

    public StudentEntity(String email, String password, String address, String firstName, String lastName, String sexe, Set<Roles> roles, LocalDate dateOfBirth, GroupeEntity groupe) {
        super(email, password, address, firstName, lastName, sexe, roles);
        this.dateOfBirth = dateOfBirth;
        this.groupe = groupe;
    }

    public StudentEntity() {
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "dateOfBirth=" + dateOfBirth +
                ", groupe=" + groupe +
                '}';
    }
}
