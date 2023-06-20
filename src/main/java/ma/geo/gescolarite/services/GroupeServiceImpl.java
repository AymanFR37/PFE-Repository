package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.GroupDto;
import ma.geo.gescolarite.mappers.GroupeMapper;
import ma.geo.gescolarite.repositories.GroupRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeServiceImpl implements GroupeService{
    @Autowired
    private GroupRepository groupRepository;

    private GroupeMapper groupeMapper = Mappers.getMapper(GroupeMapper.class);

    @Override
    public GroupDto createGroupe(GroupDto groupDto) {
        GroupDto dto = groupeMapper.groupeToGroupeDto(groupRepository.save(groupeMapper.groupeDtoToGroupe(groupDto)));
        return dto;
    }

    @Override
    public GroupDto updateGroupe(int id, GroupDto groupDto) {
        GroupDto dto = groupeMapper.groupeToGroupeDto(groupRepository.findById(id).orElse(null));
        dto.setNomGroupe(groupDto.getNomGroupe());

        GroupDto savedDto = groupeMapper.groupeToGroupeDto(groupRepository.save(groupeMapper.groupeDtoToGroupe(dto)));
        return savedDto;
    }

    @Override
    public void deleteGroupeById(int id) {
        groupRepository.deleteById(id);
    }

    @Override
    public List<GroupDto> getAllGroupes() {
        return groupeMapper.groupesToGroupeDtos(groupRepository.findAll());
    }
}
