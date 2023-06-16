package ma.geo.gescolarite.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.time.LocalTime;

//@Entity
public class CoursEntity {
    private int id;
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    @OneToMany
    private TeacherEntity teacher;
    @OneToMany
    private ClasseEntity classe;
    @OneToMany
    private SalleEntity salle;


}
