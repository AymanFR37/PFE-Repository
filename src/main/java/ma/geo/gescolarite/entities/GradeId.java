package ma.geo.gescolarite.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

//@Embeddable
public class GradeId implements Serializable {
    @ManyToOne
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @ManyToOne
    @JoinColumn(name = "matiere_id")
    private MatiereEntity matiere;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradeId gradeId = (GradeId) o;
        return Objects.equals(student, gradeId.student) && Objects.equals(matiere, gradeId.matiere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, matiere);
    }

    public StudentEntity getStudent() {
        return student;
    }

    public void setStudent(StudentEntity student) {
        this.student = student;
    }

    public MatiereEntity getMatiere() {
        return matiere;
    }

    public void setMatiere(MatiereEntity matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "GradeId{" +
                "student=" + student +
                ", matiere=" + matiere +
                '}';
    }
}
