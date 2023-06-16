package ma.geo.gescolarite.entities;

import ma.geo.gescolarite.Roles.Roles;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class StudentEntity extends UserEntity{

    private LocalDate dateOfBirth;



    //@ManyToOne : many students to one group
    @ManyToOne(cascade = CascadeType.PERSIST)
    private GroupeEntity groupe;

    @Transient
    private String groupName;

    public String getGroupName() {
        if (groupe != null) {
            return groupe.getNomGroupe();
        }
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


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

    public StudentEntity(String email, String password, String address, String firstName, String lastName, String sexe, Set<Roles> roles, LocalDate dateOfBirth, GroupeEntity groupe, String groupName) {
        super(email, password, address, firstName, lastName, sexe, roles);
        this.dateOfBirth = dateOfBirth;
        this.groupe = groupe;
        this.groupName = groupName;
    }

    public StudentEntity() {
    }
}
