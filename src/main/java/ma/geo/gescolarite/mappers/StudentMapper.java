package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.StudentAddDto;
import ma.geo.gescolarite.dtos.StudentDto;
import ma.geo.gescolarite.entities.StudentEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    StudentDto studentToStudentDTO(StudentEntity student);
    StudentAddDto studentToStudentAddDTO(StudentEntity student);
    StudentEntity studentDTOToStudent(StudentDto studentDTO);
    StudentEntity studentAddDTOToStudent(StudentAddDto studentAddDto);
    List<StudentEntity> studentDTOsToStudents(List<StudentDto> all);
    List<StudentDto> studentsToStudentDTOs(List<StudentEntity> all);
}
