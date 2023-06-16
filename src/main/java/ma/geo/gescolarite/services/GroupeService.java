package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.GroupeEntity;

import java.util.List;

public interface GroupeService {
    GroupeEntity createGroupe(GroupeEntity groupe);
    List<GroupeEntity> getAllGroupes();
}
