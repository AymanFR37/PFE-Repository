package ma.geo.gescolarite.services;

import ma.geo.gescolarite.entities.GroupeEntity;
import ma.geo.gescolarite.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeServiceImpl implements GroupeService{
    @Autowired
    private GroupRepository groupRepository;

    @Override
    public GroupeEntity createGroupe(GroupeEntity groupe) {
        return groupRepository.save(groupe);
    }

    @Override
    public List<GroupeEntity> getAllGroupes() {
        return groupRepository.findAll();
    }

    @Override
    public GroupeEntity updateGroupe(int id, GroupeEntity groupe) {
        GroupeEntity existGroupe = groupRepository.findById(id).orElse(null);
        existGroupe.setNomGroupe(groupe.getNomGroupe());
        existGroupe.setClasse(groupe.getClasse());
        return groupRepository.save(existGroupe);
    }

    @Override
    public void deleteGroupeById(int id) {
        groupRepository.deleteById(id);
    }
}
