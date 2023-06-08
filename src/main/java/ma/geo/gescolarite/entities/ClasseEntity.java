package ma.geo.gescolarite.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClasseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomClass;

    public ClasseEntity(int id, String nomClass) {
        this.id = id;
        this.nomClass = nomClass;
    }

    public ClasseEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomClass() {
        return nomClass;
    }

    public void setNomClass(String nomClass) {
        this.nomClass = nomClass;
    }

    @Override
    public String toString() {
        return "ClasseEntity{" +
                "id=" + id +
                ", nomClass='" + nomClass + '\'' +
                '}';
    }
}
