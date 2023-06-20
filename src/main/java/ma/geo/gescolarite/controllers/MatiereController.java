package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.dtos.MatiereDto;
import ma.geo.gescolarite.services.MatiereService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/matieres")
public class MatiereController {
    private MatiereService matiereService;

    public MatiereController(MatiereService matiereService) {
        this.matiereService = matiereService;
    }
    //Méthode pour Sélectionner toutes les matieres disponibles

    @GetMapping
    public ResponseEntity<List<MatiereDto>> getAll(){
        List<MatiereDto> allMatiere = matiereService.getAllMatieres();
        return  ResponseEntity.ok(allMatiere);
    }

    //Méthode pour ajouter une matiere

    @PostMapping("/add")
    public ResponseEntity<MatiereDto> add(@RequestBody MatiereDto matiereDto){
        MatiereDto aMatiere = matiereService.createMatiere(matiereDto);
        return new ResponseEntity<>(aMatiere, HttpStatus.CREATED);
    }

    //Méthode pour modifier une matiere

    @PutMapping("/update/{id}")
    public ResponseEntity<MatiereDto> update(@PathVariable int id,@RequestBody MatiereDto matiereDto){
        MatiereDto updateMatiere = matiereService.updateMatiere(id, matiereDto);
        return ResponseEntity.ok(updateMatiere);
    }

    //Méthode pour supprimer une matiere

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        matiereService.deleteMatiereById(id);
        return ResponseEntity.noContent().build();
    }
}
