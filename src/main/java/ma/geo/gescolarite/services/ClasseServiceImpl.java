package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.ClasseEntity;
import ma.geo.gescolarite.repositories.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseServiceImpl implements ClasseService{
    @Autowired
    private ClassRepository classRepository;

    @Override
    public ClasseEntity createClass(ClasseEntity classe) {
        return classRepository.save(classe);
    }

    @Override
    public List<ClasseEntity> getAllClasses() {
        return classRepository.findAll();
    }
}
