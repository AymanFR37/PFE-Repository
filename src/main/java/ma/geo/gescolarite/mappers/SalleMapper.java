package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.SalleDto;
import ma.geo.gescolarite.entities.SalleEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface SalleMapper {
    SalleEntity salleDtoToSalle(SalleDto salleDTO);
    SalleDto salleToSalleDto(SalleEntity salleEntity);
    List<SalleEntity> salleDtosToSalles(List<SalleDto> salleDTOS);
    List<SalleDto> sallesToSallesDtos(List<SalleEntity> salleEntities);
}
