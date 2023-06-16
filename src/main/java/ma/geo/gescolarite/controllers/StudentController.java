package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.entities.StudentEntity;
import ma.geo.gescolarite.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<StudentEntity> getAllStudents() {
        return studentService.getAll();
    }

    @PostMapping("/add")
    public ResponseEntity<StudentEntity> saveStudent(@RequestBody StudentEntity student) {
        StudentEntity savedStudent = studentService.addStudent(student);
        return ResponseEntity.ok(savedStudent);
    }
}
