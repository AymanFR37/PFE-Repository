package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.GroupDto;

import java.util.List;

public interface GroupeService {
    GroupDto createGroupe(GroupDto groupe);
    List<GroupDto> getAllGroupes();
    GroupDto updateGroupe(int id,GroupDto groupe);
    void deleteGroupeById(int id);
}
