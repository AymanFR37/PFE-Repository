package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.StudentAddDto;
import ma.geo.gescolarite.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    StudentAddDto addStudent(StudentAddDto student);
    List<StudentDto> getAll();
    StudentDto updateStudent(int id, StudentDto student);
    void deleteStudentById(int id);
}
