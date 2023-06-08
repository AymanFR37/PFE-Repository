package ma.geo.gescolarite.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TeacherEntity extends PersonEntity{
    @Id
    private String id;
    @OneToMany
    private MatiereEntity matiere;

    public TeacherEntity(String firstName, String lastName, String sexe, String id, MatiereEntity matiere) {
        super(firstName, lastName, sexe);
        this.id = id;
        this.matiere = matiere;
    }

    public TeacherEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MatiereEntity getMatiere() {
        return matiere;
    }

    public void setMatiere(MatiereEntity matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "TeacherEntity{" +
                "id='" + id + '\'' +
                ", matiere=" + matiere +
                '}';
    }
}
