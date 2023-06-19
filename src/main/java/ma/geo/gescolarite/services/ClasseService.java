package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.ClasseEntity;

import java.util.List;

public interface ClasseService {
    ClasseEntity createClass(ClasseEntity classe);
    List<ClasseEntity> getAllClasses();
    ClasseEntity updateClass(int id,ClasseEntity classe);
    void deleteClassById(int id);

}
