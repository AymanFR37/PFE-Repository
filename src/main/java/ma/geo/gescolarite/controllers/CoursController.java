package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.dtos.CoursDto;
import ma.geo.gescolarite.dtos.GroupDto;
import ma.geo.gescolarite.dtos.GroupeClassDto;
import ma.geo.gescolarite.services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cours")
public class CoursController {
    @Autowired
    private CoursService coursService;

    //Méthode pour Sélectionner toutes les cours disponibles

    @GetMapping
    public ResponseEntity<List<CoursDto>> getAll(){
        List<CoursDto> allCours = coursService.getAllCours();
        return  ResponseEntity.ok(allCours);
    }

    //Méthode pour ajouter un cours

    @PostMapping("/add")
    public ResponseEntity<CoursDto> add(@RequestBody CoursDto cours){
        CoursDto coursDto = coursService.createCours(cours);
        return new ResponseEntity<>(coursDto, HttpStatus.CREATED);
    }

    //Méthode pour modifier un cours

    @PutMapping("/update/{id}")
    public ResponseEntity<CoursDto> update(@PathVariable int id,@RequestBody CoursDto cours){
        CoursDto updateCours = coursService.updateCours(id, cours);
        return ResponseEntity.ok(updateCours);
    }

    //Méthode pour supprimer un cours

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        coursService.deleteCoursById(id);
        return ResponseEntity.noContent().build();
    }

}
