package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity addUser(UserEntity user);
    List<UserEntity> getAll();
    UserEntity updateUser(int id, UserEntity user);
    void deleteUserById(int id);
}
