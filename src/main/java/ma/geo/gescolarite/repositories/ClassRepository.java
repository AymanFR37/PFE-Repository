package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.ClasseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClasseEntity,Integer> {
    //ClasseEntity findClassByGroupId(int groupId);

}
