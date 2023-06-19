package ma.geo.gescolarite.entities;

import javax.persistence.*;

@Entity
@Table(name = "grade")
public class NoteEntity {

    @EmbeddedId
    private GradeId gradeId;

    @Column(name = "grade")
    private double grade;
    private String description;

    public NoteEntity(GradeId gradeId, double grade, String description) {
        this.gradeId = gradeId;
        this.grade = grade;
        this.description = description;
    }

    public NoteEntity() {
    }

    public GradeId getGradeId() {
        return gradeId;
    }

    public void setGradeId(GradeId gradeId) {
        this.gradeId = gradeId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "NoteEntity{" +
                "gradeId=" + gradeId +
                ", grade=" + grade +
                ", description='" + description + '\'' +
                '}';
    }
}
