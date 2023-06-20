package ma.geo.gescolarite.dtos;


public class GroupDto {

    private int id;
    private String nomGroupe;

    public GroupDto(int id, String nomGroupe) {
        this.id = id;
        this.nomGroupe = nomGroupe;

    }

    public GroupDto() {
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

    @Override
    public String toString() {
        return "GroupDto{" +
                "id=" + id +
                ", nomGroupe='" + nomGroupe + '\'' +
                '}';
    }
}
