package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.dtos.GroupDto;
import ma.geo.gescolarite.services.GroupeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groupes")
public class GroupeController {
    @Autowired
    private GroupeService groupeService;

    public GroupeController(GroupeService groupeService) {
        this.groupeService = groupeService;
    }

    //Méthode pour Sélectionner toutes les groupes disponibles

    @GetMapping
    public ResponseEntity<List<GroupDto>> getAll(){
        List<GroupDto> allGroupes = groupeService.getAllGroupes();
        return  ResponseEntity.ok(allGroupes);
    }

    //Méthode pour ajouter un groupe

    @PostMapping("/add")
    public ResponseEntity<GroupDto> add(@RequestBody GroupDto groupe){
        GroupDto aGroupe = groupeService.createGroupe(groupe);
        return new ResponseEntity<>(aGroupe, HttpStatus.CREATED);
    }

    //Méthode pour modifier un groupe

    @PutMapping("/update/{id}")
    public ResponseEntity<GroupDto> update(@PathVariable int id,@RequestBody GroupDto groupe){
        GroupDto updateGroupe = groupeService.updateGroupe(id, groupe);
        return ResponseEntity.ok(updateGroupe);
    }

    //Méthode pour supprimer un groupe

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id){
        groupeService.deleteGroupeById(id);
        return ResponseEntity.noContent().build();
    }
}
