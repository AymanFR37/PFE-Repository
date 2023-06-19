package ma.geo.gescolarite.controllers;

import ma.geo.gescolarite.entities.UserEntity;
import ma.geo.gescolarite.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Méthode pour selectionner tous les users
    @GetMapping
    public List<UserEntity> getAllUsers() {
        return userService.getAll();
    }

    // Méthode pour ajouter un user
    @PostMapping("/add")
    public ResponseEntity<UserEntity> saveUser(@RequestBody UserEntity user) {
        UserEntity savedUser = userService.addUser(user);
        return ResponseEntity.ok(savedUser);
    }

    // Méthode pour modifier un user
    @PutMapping("/{id}")
    public ResponseEntity<UserEntity> updateUser(@PathVariable int id, @RequestBody UserEntity user) {
        UserEntity updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    // Méthode pour Supprimer un user
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable("id") int id) {
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
