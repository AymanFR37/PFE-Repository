package ma.geo.gescolarite.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//@Entity
public class TeacherEntity extends PersonEntity{
    @Id
    private String id;

    //@ManyToOne : many teachers to one subject
    @ManyToOne
    private MatiereEntity matiere;

}
