package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    StudentEntity addStudent(StudentEntity student);
    List<StudentEntity> getAll();
}
