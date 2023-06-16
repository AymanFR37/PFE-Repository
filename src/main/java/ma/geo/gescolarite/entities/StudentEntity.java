package ma.geo.gescolarite.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class StudentEntity extends PersonEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate dateOfBirth;
    private String address;

    //@ManyToOne : many students to one classe
    @ManyToOne(cascade = CascadeType.PERSIST)
    private ClasseEntity classe;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public GroupeEntity getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupeEntity groupe) {
        this.groupe = groupe;
    }
}
