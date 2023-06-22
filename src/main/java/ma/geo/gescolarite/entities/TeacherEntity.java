package ma.geo.gescolarite.entities;

import ma.geo.gescolarite.roles.Roles;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Set;

@Entity

public class TeacherEntity extends UserEntity{

    @ManyToOne
    private MatiereEntity matiere;

    public TeacherEntity(String email, String password, String address, String firstName, String lastName, String sexe, Set<Roles> roles, MatiereEntity matiere) {
        super(email, password, address, firstName, lastName, sexe, roles);
        this.matiere = matiere;
    }

    public TeacherEntity() {
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
                "matiere=" + matiere +
                '}';
    }
}
