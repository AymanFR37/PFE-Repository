package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.CoursDto;
import ma.geo.gescolarite.entities.CoursEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface CoursMapper {
    CoursEntity coursDtoToCours(CoursDto coursDto);
    CoursDto coursToCoursDto(CoursEntity coursEntity);
    List<CoursEntity> coursDtosToCourses(List<CoursDto> coursDtos);
    List<CoursDto> CoursesToClassesDtos(List<CoursEntity> coursEntities);
}
