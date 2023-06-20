package ma.geo.gescolarite.dtos;

public class ClasseDto {
    private int id;
    private String nomClass;

    public ClasseDto(int id, String nomClass) {
        this.id = id;
        this.nomClass = nomClass;
    }

    public ClasseDto() {
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
        return "ClassDTO{" +
                "id=" + id +
                ", nomClass='" + nomClass + '\'' +
                '}';
    }
}
