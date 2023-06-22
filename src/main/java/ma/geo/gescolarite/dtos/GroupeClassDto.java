package ma.geo.gescolarite.dtos;

public class GroupeClassDto {
    private String nomGroupe;
    private ClasseDto classe;

    public GroupeClassDto(String nomGroupe, ClasseDto classe) {
        this.nomGroupe = nomGroupe;
        this.classe = classe;
    }

    public GroupeClassDto() {
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public ClasseDto getClasse() {
        return classe;
    }

    public void setClasse(ClasseDto classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "GroupeClassDto{" +
                "nomGroupe='" + nomGroupe + '\'' +
                ", classe=" + classe +
                '}';
    }
}
