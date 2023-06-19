package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.CoursEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoursRepository extends JpaRepository<CoursEntity,Integer> {
}
