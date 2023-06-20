package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.MatiereDto;

import java.util.List;

public interface MatiereService {
    MatiereDto createMatiere(MatiereDto matiereDto);
    MatiereDto updateMatiere(int id,MatiereDto matiereDto);
    void deleteMatiereById(int id);
    List<MatiereDto> getAllMatieres();
}
