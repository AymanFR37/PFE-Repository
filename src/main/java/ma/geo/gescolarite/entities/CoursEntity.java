package ma.geo.gescolarite.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class CoursEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    @ManyToOne
    private TeacherEntity teacher;
    @ManyToOne
    private GroupeEntity groupe;
    @ManyToOne
    private SalleEntity salle;

    public CoursEntity() {
    }

    public GroupeEntity getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupeEntity groupe) {
        this.groupe = groupe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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



    public SalleEntity getSalle() {
        return salle;
    }

    public void setSalle(SalleEntity salle) {
        this.salle = salle;
    }
}
