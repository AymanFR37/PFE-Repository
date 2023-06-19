package ma.geo.gescolarite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ma.geo.gescolarite.entities.UserEntity,Integer> {
}
