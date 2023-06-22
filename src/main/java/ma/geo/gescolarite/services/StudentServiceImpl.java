package ma.geo.gescolarite.services;


import ma.geo.gescolarite.entities.ClasseEntity;
import ma.geo.gescolarite.entities.GroupeEntity;
import ma.geo.gescolarite.entities.StudentEntity;
import ma.geo.gescolarite.repositories.ClassRepository;
import ma.geo.gescolarite.repositories.GroupRepository;
import ma.geo.gescolarite.roles.Roles;
import ma.geo.gescolarite.dtos.StudentAddDto;
import ma.geo.gescolarite.dtos.StudentDto;
import ma.geo.gescolarite.mappers.StudentMapper;
import ma.geo.gescolarite.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
//    @Autowired
//    private ClassRepository classRepository;

    private StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);

    //add

    @Override
    public StudentAddDto addStudent(StudentAddDto studentDto) {

        Set<Roles> list = new HashSet<>();
        list.add(Roles.ETUDIANT);

        GroupeEntity groupe = groupRepository.findById(studentDto.getGroupe().getId()).orElse(null);
        ClasseEntity classe = groupe.getClasse();

        StudentEntity student = studentMapper.studentAddDTOToStudent(studentDto);
        student.setRoles(list);
        student.getGroupe().setClasse(student.getGroupe().getClasse());

//        int classId = groupRepository.findClassIdById(studentDto.getGroupe().getId());
//       // ClasseEntity classe = groupRepository.findClasseById(studentDto.getGroupe().getId());
        System.out.println("entiiiiiiiiiiiiiiiiiiiiiiiiity " + studentDto.getGroupe().getId());


        StudentAddDto dto = studentMapper.studentToStudentAddDTO(studentRepository.save(studentMapper.studentAddDTOToStudent(studentDto)));
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
        existStudent.setClasse(student.getClasse());

        return studentMapper.studentToStudentDTO(studentRepository.save(studentMapper.studentDTOToStudent(existStudent)));
    }

    //delete

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }
}
