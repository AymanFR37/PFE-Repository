package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.ClasseDto;
import ma.geo.gescolarite.entities.ClasseEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface ClasseMapper {
    ClasseEntity classDtoToClass(ClasseDto classDTO);
    ClasseDto classToClassDto(ClasseEntity classEntity);
    List<ClasseEntity> classeDtosToClasses(List<ClasseDto> classDTOS);
    List<ClasseDto> ClassesToClassesDtos(List<ClasseEntity> classEntities);
}
