package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.SalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends JpaRepository<SalleEntity,Integer> {
}
