package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer>{

}