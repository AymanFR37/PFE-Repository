package ma.geo.gescolarite.dtos;


import java.io.Serializable;
import java.util.Objects;

public class GradeIdDto implements Serializable{
    private StudentDto student;
    private MatiereDto matiere;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradeIdDto that = (GradeIdDto) o;
        return Objects.equals(student, that.student) && Objects.equals(matiere, that.matiere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, matiere);
    }

    public GradeIdDto(StudentDto student, MatiereDto matiere) {
        this.student = student;
        this.matiere = matiere;
    }

    public GradeIdDto() {
    }

    public StudentDto getStudent() {
        return student;
    }

    public void setStudent(StudentDto student) {
        this.student = student;
    }

    public MatiereDto getMatiere() {
        return matiere;
    }

    public void setMatiere(MatiereDto matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "GradeIdDto{" +
                "student=" + student +
                ", matiere=" + matiere +
                '}';
    }
}
