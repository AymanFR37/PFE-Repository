package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.CoursEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursRepository extends JpaRepository<CoursEntity,Integer> {
}
