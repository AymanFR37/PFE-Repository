package ma.geo.gescolarite.controllers;


import ma.geo.gescolarite.entities.ClasseEntity;
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
    public ResponseEntity<List<ClasseEntity>> getAll(){
        List<ClasseEntity> allClasses = classService.getAllClasses();
        return  ResponseEntity.ok(allClasses);
    }

    //Méthode pour ajouter une classe
    @PostMapping("/add")
    public ResponseEntity<ClasseEntity> add(@RequestBody ClasseEntity classe){
        ClasseEntity aClass = classService.createClass(classe);
        return new ResponseEntity<>(aClass, HttpStatus.CREATED);
    }
}
