package ma.geo.gescolarite.dtos;

public class SalleDto {
    private int id;
    private String nomSalle;

    public SalleDto(int id, String nomSalle) {
        this.id = id;
        this.nomSalle = nomSalle;
    }

    public SalleDto() {
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
        return "SalleDTO{" +
                "id=" + id +
                ", nomSalle='" + nomSalle + '\'' +
                '}';
    }
}
