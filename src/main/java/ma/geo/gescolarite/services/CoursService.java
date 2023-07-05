package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.CoursDto;

import java.util.List;

public interface CoursService {
    CoursDto createCours(CoursDto cours);
    List<CoursDto> getAllCours();
    CoursDto updateCours(int id,CoursDto cours);
    void deleteCoursById(int id);
}
