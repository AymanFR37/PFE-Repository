package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.entities.GroupeEntity;
import ma.geo.gescolarite.services.GroupeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/groupes")
public class GroupeController {
    private GroupeService groupeService;

    public GroupeController(GroupeService groupeService) {
        this.groupeService = groupeService;
    }

    //Méthode pour Sélectionner toutes les groupes disponibles

    @GetMapping
    public ResponseEntity<List<GroupeEntity>> getAll(){
        List<GroupeEntity> allGroupes = groupeService.getAllGroupes();
        return  ResponseEntity.ok(allGroupes);
    }

    //Méthode pour ajouter un groupe

    @PostMapping("/add")
    public ResponseEntity<GroupeEntity> add(@RequestBody GroupeEntity groupe){
        GroupeEntity aGroupe = groupeService.createGroupe(groupe);
        return new ResponseEntity<>(aGroupe, HttpStatus.CREATED);
    }
}
