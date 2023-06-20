package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.SalleDto;

import java.util.List;

public interface SalleService {
    SalleDto addSalle(SalleDto salleDto);
    SalleDto updateSalle(int id,SalleDto salleDto);
    void deleteSalleById(int id);
    List<SalleDto> getAllSalles();
}
