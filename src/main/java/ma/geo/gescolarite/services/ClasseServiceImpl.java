package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.ClasseDto;
import ma.geo.gescolarite.mappers.ClasseMapper;
import ma.geo.gescolarite.repositories.ClassRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasseServiceImpl implements ClasseService{
    @Autowired
    private ClassRepository classRepository;
    private ClasseMapper classMapper = Mappers.getMapper(ClasseMapper.class);

    @Override
    public ClasseDto createClass(ClasseDto classeDto) {
        ClasseDto dto = classMapper.classToClassDto(classRepository.save(classMapper.classDtoToClass(classeDto)));
        return dto;
    }

    @Override
    public ClasseDto updateClass(int id, ClasseDto classeDto) {
        ClasseDto dto = classMapper.classToClassDto(classRepository.findById(id).orElse(null));
        dto.setNomClass(classeDto.getNomClass());

        ClasseDto savedDto = classMapper.classToClassDto(classRepository.save(classMapper.classDtoToClass(dto)));
        return savedDto;
    }

    @Override
    public void deleteClassById(int id) {
        classRepository.deleteById(id);
    }

    @Override
    public List<ClasseDto> getAllClasses() {
        return classMapper.ClassesToClassesDtos(classRepository.findAll());
    }
}
