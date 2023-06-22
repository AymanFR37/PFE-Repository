package ma.geo.gescolarite.mappers;

import ma.geo.gescolarite.dtos.GroupDto;
import ma.geo.gescolarite.dtos.GroupeClassDto;
import ma.geo.gescolarite.entities.GroupeEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface GroupeMapper {
    GroupeEntity groupeDtoToGroupe(GroupDto groupeDTO);
    GroupeEntity groupeClassDtoToGroupe(GroupeClassDto groupeDTO);
    GroupDto groupeToGroupeDto(GroupeEntity groupeEntity);
    GroupeClassDto groupeToGroupeClassDto(GroupeEntity groupeEntity);
    List<GroupDto> groupesToGroupeDtos(List<GroupeEntity> groupeEntities);
    List<GroupeClassDto> groupesToGroupeClassDtos(List<GroupeEntity> groupeEntities);
    List<GroupeEntity> groupeDtosToGroupes(List<GroupDto> groupeDTOS);
}
