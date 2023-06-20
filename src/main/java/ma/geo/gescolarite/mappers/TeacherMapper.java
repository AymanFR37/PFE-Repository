package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.TeacherDto;
import ma.geo.gescolarite.entities.TeacherEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {
    TeacherDto teacherToTeacherDTO(TeacherEntity teacherEntity);
    TeacherEntity teacherDtoToTeacher(TeacherDto teacherDTO);
    List<TeacherDto> teachersToTeacherDTOs(List<TeacherEntity> teacherEntities);
    List<TeacherEntity> teacherDTOsToteachers(List<TeacherDto> teacherDTOS);
}
