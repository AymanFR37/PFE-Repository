package ma.geo.gescolarite.entities;

import javax.persistence.*;

@Entity
public class GroupeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomGroupe;

    // @ManyToOne : many groups to one classe
    @ManyToOne
    private ClasseEntity classe;

    public GroupeEntity(int id, String nomGroupe, ClasseEntity classe) {
        this.id = id;
        this.nomGroupe = nomGroupe;
        this.classe = classe;
    }

    public GroupeEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public ClasseEntity getClasse() {
        return classe;
    }

    public void setClasse(ClasseEntity classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "GroupeEntity{" +
                "id=" + id +
                ", nomGroupe='" + nomGroupe + '\'' +
                ", classe=" + classe +
                '}';
    }
}
