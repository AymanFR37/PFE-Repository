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
    private String heureDebut;
    private String heureFin;
    @ManyToOne
    private TeacherEntity teacher;
    @ManyToOne
    private GroupeEntity groupe;
    @ManyToOne
    private SalleEntity salle;

    public CoursEntity() {
    }

    public CoursEntity(int id, LocalDate date, String heureDebut, String heureFin, TeacherEntity teacher, GroupeEntity groupe, SalleEntity salle) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.teacher = teacher;
        this.groupe = groupe;
        this.salle = salle;
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

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public String getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(String heureFin) {
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
