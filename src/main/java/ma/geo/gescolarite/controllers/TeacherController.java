package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.dtos.TeacherDto;
import ma.geo.gescolarite.services.TeacherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/teachers")
public class TeacherController {
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    // Méthode pour créer un enseignant
    @PostMapping
    public ResponseEntity<TeacherDto> addTeacher(@RequestBody TeacherDto teacherDto) {
        TeacherDto teacher = teacherService.addTeacher(teacherDto);
        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }

    // Méthode pour modifier un enseignant
    @PutMapping("/{id}")
    public ResponseEntity<TeacherDto> updateTeacher(@PathVariable int id, @RequestBody TeacherDto teacherDto) {
        TeacherDto updatedTeacher = teacherService.updateTeacher(id, teacherDto);
        return ResponseEntity.ok(updatedTeacher);
    }

    // Méthode pour Supprimer un enseignant
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTeacher(@PathVariable("id") int id) {
        teacherService.deleteTeacherById(id);
        return ResponseEntity.noContent().build();
    }

    // Méthode pour sélectionner toutes les enseignants
    @GetMapping
    public ResponseEntity<List<TeacherDto>> getAllTeachers() {
        List<TeacherDto> teachers = teacherService.getAllTeachers();
        return ResponseEntity.ok(teachers);
    }

}
