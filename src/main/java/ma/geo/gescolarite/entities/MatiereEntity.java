package ma.geo.gescolarite.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class MatiereEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomMatiere;

    public MatiereEntity(int id, String nomMatiere) {
        this.id = id;
        this.nomMatiere = nomMatiere;
    }

    public MatiereEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomMatiere() {
        return nomMatiere;
    }

    public void setNomMatiere(String nomMatiere) {
        this.nomMatiere = nomMatiere;
    }

    @Override
    public String toString() {
        return "MatiereEntity{" +
                "id=" + id +
                ", nomMatiere='" + nomMatiere + '\'' +
                '}';
    }
}
