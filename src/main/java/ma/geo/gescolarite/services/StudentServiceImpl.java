package ma.geo.gescolarite.services;


import ma.geo.gescolarite.Roles.Roles;
import ma.geo.gescolarite.dtos.StudentDto;
import ma.geo.gescolarite.entities.GroupeEntity;
import ma.geo.gescolarite.entities.StudentEntity;
import ma.geo.gescolarite.repositories.GroupRepository;
import ma.geo.gescolarite.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public StudentDto addStudent(StudentDto student_dto) {


        System.out.println("teeeeeeeeeeeeeeeeeeeeeeeeeeest" +  student_dto.getGroupe().getId());

        Set<Roles> list = new HashSet<>();
        list.add(Roles.ETUDIANT);



        StudentEntity s = new StudentEntity();

        s.setFirstName(student_dto.getFirstName());
        s.setLastName(student_dto.getLastName());
        s.setEmail(student_dto.getEmail());
        s.setAddress(student_dto.getAddress());
        s.setDateOfBirth(student_dto.getDateOfBirth());
        s.setGroupe(new GroupeEntity(student_dto.getGroupe().getId()));
        s.setSexe(student_dto.getSexe());
        s.setPassword(student_dto.getPassword());

        StudentEntity sEntity = studentRepository.save(s);

        student_dto.setId(sEntity.getId());

        return student_dto;
    }

    @Override
    public List<StudentEntity> getAll() {
        List<StudentEntity> students = studentRepository.findAll();
        /*for (StudentEntity student : students) {
            if (student.getGroupe() != null) {
                student.setGroupName(student.getGroupe().getNomGroupe());
            }
        }*/
        return students;
    }

    @Override
    public StudentEntity updateStudent(int id, StudentEntity student) {
        StudentEntity existStudent = studentRepository.findById(id).orElse(null);
        existStudent.setFirstName(student.getFirstName());
        existStudent.setLastName(student.getLastName());
        existStudent.setDateOfBirth(student.getDateOfBirth());
        existStudent.setAddress(student.getAddress());
        existStudent.setSexe(student.getSexe());
        existStudent.setGroupe(student.getGroupe());
        existStudent.setRoles(student.getRoles());

        return studentRepository.save(existStudent);
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
