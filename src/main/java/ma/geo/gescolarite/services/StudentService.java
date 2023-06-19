package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.StudentDto;
import ma.geo.gescolarite.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentDto addStudent(StudentDto student);
    List<StudentEntity> getAll();
    StudentEntity updateStudent(int id, StudentEntity student);
    void deleteStudentById(int id);
}