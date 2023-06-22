package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.dtos.StudentAddDto;
import ma.geo.gescolarite.dtos.StudentDto;
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

    // Méthode pour selectionner tous les étudiants
    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getAll();
    }

    // Méthode pour ajouter un étudiant
    @PostMapping("/add")
    public ResponseEntity<StudentAddDto> saveStudent(@RequestBody StudentAddDto student) {
        StudentAddDto savedStudent = studentService.addStudent(student);
        return   ResponseEntity.ok(savedStudent);
    }

    // Méthode pour modifier un étudiant
    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable int id, @RequestBody StudentDto studentDto) {
        StudentDto updatedStudent = studentService.updateStudent(id, studentDto);
        return ResponseEntity.ok(updatedStudent);
    }

    // Méthode pour Supprimer un étudiant
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }

}
