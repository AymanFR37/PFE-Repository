package ma.geo.gescolarite.controllers;


import ma.geo.gescolarite.dtos.ClasseDto;
import ma.geo.gescolarite.services.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/classes")
public class ClasseController {

    @Autowired
    private ClasseService classService;

    //Méthode pour Sélectionner toutes les classes disponibles
    @GetMapping
    public ResponseEntity<List<ClasseDto>> getAll(){
        List<ClasseDto> allClasses = classService.getAllClasses();
        return  ResponseEntity.ok(allClasses);
    }

    //Méthode pour ajouter une classe
    @PostMapping("/add")
    public ResponseEntity<ClasseDto> add(@RequestBody ClasseDto classe){
        ClasseDto aClass = classService.createClass(classe);
        return new ResponseEntity<>(aClass, HttpStatus.CREATED);
    }

    //Méthode pour modifier une classe
    @PutMapping("/update/{id}")
    public ResponseEntity<ClasseDto> update(@PathVariable int id,@RequestBody ClasseDto classe){
        ClasseDto updateClass = classService.updateClass(id, classe);
        return ResponseEntity.ok(updateClass);
    }

    //Méthode pour supprimer une classe
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        classService.deleteClassById(id);
        return ResponseEntity.noContent().build();
    }
}
