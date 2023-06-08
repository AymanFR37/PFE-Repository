package ma.geo.gescolarite.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class CoursEntity {
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    @OneToMany
    private TeacherEntity teacher;
    @OneToMany
    private ClasseEntity classe;
    @OneToMany
    private SalleEntity salle;

    public CoursEntity(LocalDate date, LocalTime heureDebut, LocalTime heureFin, TeacherEntity teacher, ClasseEntity classe, SalleEntity salle) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.teacher = teacher;
        this.classe = classe;
        this.salle = salle;
    }

    public CoursEntity() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    public TeacherEntity getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherEntity teacher) {
        this.teacher = teacher;
    }

    public ClasseEntity getClasse() {
        return classe;
    }

    public void setClasse(ClasseEntity classe) {
        this.classe = classe;
    }

    public SalleEntity getSalle() {
        return salle;
    }

    public void setSalle(SalleEntity salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "CoursEntity{" +
                "date=" + date +
                ", heureDebut=" + heureDebut +
                ", heureFin=" + heureFin +
                ", teacher=" + teacher +
                ", classe=" + classe +
                ", salle=" + salle +
                '}';
    }
}
