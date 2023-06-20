package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.ClasseDto;

import java.util.List;

public interface ClasseService {
    ClasseDto createClass(ClasseDto classe);
    List<ClasseDto> getAllClasses();
    ClasseDto updateClass(int id,ClasseDto classe);
    void deleteClassById(int id);

}
