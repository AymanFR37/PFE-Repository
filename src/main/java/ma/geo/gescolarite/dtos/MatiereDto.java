package ma.geo.gescolarite.dtos;

public class MatiereDto {
    private int id;
    private String nomMatiere;

    public MatiereDto(int id, String nomMatiere) {
        this.id = id;
        this.nomMatiere = nomMatiere;
    }

    public MatiereDto() {
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
        return "MatiereDTO{" +
                "id=" + id +
                ", nomMatiere='" + nomMatiere + '\'' +
                '}';
    }
}
