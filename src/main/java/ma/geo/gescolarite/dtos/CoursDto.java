package ma.geo.gescolarite.dtos;

import java.time.LocalDate;
import java.time.LocalTime;

public class CoursDto {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private TeacherDto teacher;
    private GroupDto groupe;
    private SalleDto salle;

    public CoursDto(int id, LocalDate date, LocalTime heureDebut, LocalTime heureFin, TeacherDto teacher, GroupDto groupe, SalleDto salle) {
        this.id = id;
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.teacher = teacher;
        this.groupe = groupe;
        this.salle = salle;
    }

    public CoursDto() {
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

    public TeacherDto getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherDto teacher) {
        this.teacher = teacher;
    }

    public GroupDto getGroupe() {
        return groupe;
    }

    public void setGroupe(GroupDto groupe) {
        this.groupe = groupe;
    }

    public SalleDto getSalle() {
        return salle;
    }

    public void setSalle(SalleDto salle) {
        this.salle = salle;
    }

    @Override
    public String toString() {
        return "CoursDto{" +
                "id=" + id +
                ", date=" + date +
                ", heureDebut=" + heureDebut +
                ", heureFin=" + heureFin +
                ", teacher=" + teacher +
                ", groupe=" + groupe +
                ", salle=" + salle +
                '}';
    }
}
