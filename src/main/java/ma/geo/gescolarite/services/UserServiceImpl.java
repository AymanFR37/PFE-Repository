package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.UserEntity;
import ma.geo.gescolarite.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserEntity addUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public List<UserEntity> getAll() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity updateUser(int id, UserEntity user) {
        UserEntity existUser = userRepository.findById(id).orElse(null);
        existUser.setFirstName(user.getFirstName());
        existUser.setLastName(user.getLastName());
        existUser.setAddress(user.getAddress());
        existUser.setSexe(user.getSexe());
        existUser.setRoles(user.getRoles());

        return userRepository.save(existUser);
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);
    }
}
