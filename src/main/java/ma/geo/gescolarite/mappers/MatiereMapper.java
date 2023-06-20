package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.MatiereDto;
import ma.geo.gescolarite.entities.MatiereEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MatiereMapper {
    MatiereEntity matiereDtoToMatiere(MatiereDto matiereDTO);
    MatiereDto matiereToMatiereDto(MatiereEntity matiereEntity);
    List<MatiereEntity> matiereDtosToMatieres(List<MatiereDto> matiereDTOS);
    List<MatiereDto> matieresToMatieresDtos(List<MatiereEntity> matiereEntities);
}
