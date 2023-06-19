package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer>{

}