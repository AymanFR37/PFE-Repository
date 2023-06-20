package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.GradeIdDto;
import ma.geo.gescolarite.dtos.NoteDto;
import ma.geo.gescolarite.entities.GradeId;
import ma.geo.gescolarite.entities.NoteEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface NoteMapper {
    NoteEntity noteDtoToNote(NoteDto noteDto);
    NoteDto noteToNoteDto(NoteEntity noteEntity);
    List<NoteEntity> noteDtosToNotes(List<NoteDto> noteDtos);
    List<NoteDto> notesToNotesDtos(List<NoteEntity> noteEntities);
    GradeId gradeIdDtoToGradeId(GradeIdDto gradeIdDto);
    GradeIdDto GradeIdToGradeIdDto(GradeId gradeId);
}
