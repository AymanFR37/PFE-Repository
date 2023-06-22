package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.GroupDto;
import ma.geo.gescolarite.dtos.GroupeClassDto;

import java.util.List;

public interface GroupeService {
    GroupeClassDto createGroupe(GroupeClassDto groupe);
    List<GroupDto> getAllGroupes();
    GroupDto updateGroupe(int id,GroupDto groupe);
    void deleteGroupeById(int id);
}
