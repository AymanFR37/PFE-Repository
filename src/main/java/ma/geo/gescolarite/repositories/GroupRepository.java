package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.ClasseEntity;
import ma.geo.gescolarite.entities.GroupeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<GroupeEntity,Integer> {
    //ClasseEntity findClasseById(int id);
    int findClassIdById(int groupId);
}
