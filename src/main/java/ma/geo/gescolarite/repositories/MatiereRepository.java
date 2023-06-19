package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.MatiereEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatiereRepository extends JpaRepository<MatiereEntity,Integer> {
}
