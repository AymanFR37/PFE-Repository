package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.GroupeEntity;
import ma.geo.gescolarite.entities.StudentEntity;
import ma.geo.gescolarite.repositories.GroupRepository;
import ma.geo.gescolarite.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public StudentEntity addStudent(StudentEntity student) {
        // Check if the groupId is provided in the request
            Optional<GroupeEntity> optionalGroup = groupRepository.findById(student.getGroupe().getId());
            if (optionalGroup.isPresent()) {
                GroupeEntity group = optionalGroup.get();
                student.setGroupe(group);
            } else {
                // Handle the case when the provided groupId does not exist
                throw new IllegalArgumentException("Invalid groupId provided.");
            }

        return studentRepository.save(student);
    }

    @Override
    public List<StudentEntity> getAll() {
        List<StudentEntity> students = studentRepository.findAll();
        for (StudentEntity student : students) {
            if (student.getGroupe() != null) {
                student.setGroupName(student.getGroupe().getNomGroupe());
            }
        }
        return students;
    }
}
