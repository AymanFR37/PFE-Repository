package ma.geo.gescolarite.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class SalleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomSalle;

    public SalleEntity(int id, String nomSalle) {
        this.id = id;
        this.nomSalle = nomSalle;
    }

    public SalleEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomSalle() {
        return nomSalle;
    }

    public void setNomSalle(String nomSalle) {
        this.nomSalle = nomSalle;
    }

    @Override
    public String toString() {
        return "SalleEntity{" +
                "id=" + id +
                ", nomSalle='" + nomSalle + '\'' +
                '}';
    }
}
