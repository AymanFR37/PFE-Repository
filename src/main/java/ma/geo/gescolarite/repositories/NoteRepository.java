package ma.geo.gescolarite.repositories;

import ma.geo.gescolarite.entities.GradeId;
import ma.geo.gescolarite.entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NoteEntity, GradeId> {
}
