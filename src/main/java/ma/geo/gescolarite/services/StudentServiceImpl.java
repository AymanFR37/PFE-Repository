package ma.geo.gescolarite.services;


import ma.geo.gescolarite.Roles.Roles;
import ma.geo.gescolarite.dtos.StudentDto;
import ma.geo.gescolarite.mappers.StudentMapper;
import ma.geo.gescolarite.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    //add

    @Override
    public StudentDto addStudent(StudentDto studentDto) {

        Set<Roles> list = new HashSet<>();
        list.add(Roles.ETUDIANT);

/*        System.out.println("teeeeeeeeeeeeeeeeeeeeeeeeeeest" +  student_dto.getGroupe().getId());
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
        student_dto.setId(sEntity.getId());*/


        StudentDto dto = studentMapper.studentToStudentDTO(studentRepository.save(studentMapper.studentDTOToStudent(studentDto)));
        return dto;
    }

    //getAll

    @Override
    public List<StudentDto> getAll() {

        return studentMapper.studentsToStudentDTOs(studentRepository.findAll());
    }

    //update

    @Override
    public StudentDto updateStudent(int id, StudentDto student) {
        StudentDto existStudent = studentMapper.studentToStudentDTO(studentRepository.findById(id).orElse(null));

        existStudent.setFirstName(student.getFirstName());
        existStudent.setLastName(student.getLastName());
        existStudent.setDateOfBirth(student.getDateOfBirth());
        existStudent.setAddress(student.getAddress());
        existStudent.setSexe(student.getSexe());
        existStudent.setGroupe(student.getGroupe());
        existStudent.setEmail(student.getEmail());
        existStudent.setPassword(student.getPassword());

        return studentMapper.studentToStudentDTO(studentRepository.save(studentMapper.studentDTOToStudent(existStudent)));
    }

    //delete

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
