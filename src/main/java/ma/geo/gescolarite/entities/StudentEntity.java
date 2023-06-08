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
    @OneToMany
    private ClasseEntity classe;

    public StudentEntity(String firstName, String lastName, String sexe, int id, LocalDate dateOfBirth, String address, ClasseEntity classe) {
        super(firstName, lastName, sexe);
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.classe = classe;
    }

    public StudentEntity() {
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

    public ClasseEntity getClasse() {
        return classe;
    }

    public void setClasse(ClasseEntity classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", classe=" + classe +
                '}';
    }
}
