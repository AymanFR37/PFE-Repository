package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.CoursDto;
import ma.geo.gescolarite.mappers.CoursMapper;
import ma.geo.gescolarite.repositories.CoursRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements CoursService{
    @Autowired
    private CoursRepository coursRepository;
    private CoursMapper coursMapper = Mappers.getMapper(CoursMapper.class);

    @Override
    public CoursDto createCours(CoursDto cours) {
        return coursMapper.coursToCoursDto(coursRepository.save(coursMapper.coursDtoToCours(cours)));
    }

    @Override
    public List<CoursDto> getAllCours() {
        return coursMapper.CoursesToCoursesDtos(coursRepository.findAll());
    }

    @Override
    public CoursDto updateCours(int id, CoursDto cours) {
        CoursDto existCours = coursMapper.coursToCoursDto(coursRepository.findById(id).orElse(null));
        existCours.setDate(cours.getDate());
        existCours.setHeureDebut(cours.getHeureDebut());
        existCours.setHeureFin(cours.getHeureFin());
        existCours.setGroupe(cours.getGroupe());
        existCours.setTeacher(cours.getTeacher());
        existCours.setSalle(cours.getSalle());

        return coursMapper.coursToCoursDto(coursRepository.save(coursMapper.coursDtoToCours(existCours)));
    }

    @Override
    public void deleteCoursById(int id) {
        coursRepository.deleteById(id);
    }
}
