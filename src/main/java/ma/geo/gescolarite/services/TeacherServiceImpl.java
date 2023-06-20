package ma.geo.gescolarite.services;


import ma.geo.gescolarite.dtos.TeacherDto;
import ma.geo.gescolarite.mappers.TeacherMapper;
import ma.geo.gescolarite.repositories.TeacherRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService{
    private TeacherRepository teacherRepository;

    public TeacherServiceImpl(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    private TeacherMapper teacherMapper = Mappers.getMapper(TeacherMapper.class);

    @Override
    public List<TeacherDto> getAllTeachers() {
        return teacherMapper.teachersToTeacherDTOs(teacherRepository.findAll());
    }

    @Override
    public TeacherDto addTeacher(TeacherDto teacherDTO) {
        TeacherDto dto = teacherMapper.teacherToTeacherDTO(teacherRepository.save(teacherMapper.teacherDtoToTeacher(teacherDTO)));
        return dto;
    }

    @Override
    public TeacherDto updateTeacher(int id, TeacherDto teacherDto) {
        TeacherDto existTeacher = teacherMapper.teacherToTeacherDTO(teacherRepository.findById(id).orElse(null));

        existTeacher.setFirstName(teacherDto.getFirstName());
        existTeacher.setLastName(teacherDto.getLastName());
        existTeacher.setEmail(teacherDto.getEmail());
        existTeacher.setPassword(teacherDto.getPassword());
        existTeacher.setSexe(teacherDto.getSexe());
        existTeacher.setDateOfBirth(teacherDto.getDateOfBirth());
        existTeacher.setAddress(teacherDto.getAddress());
        existTeacher.setMatiere(teacherDto.getMatiere());

        TeacherDto dto = teacherMapper.teacherToTeacherDTO(teacherRepository.save(teacherMapper.teacherDtoToTeacher(teacherDto)));
        return dto;
    }

    @Override
    public void deleteTeacherById(int id) {
        teacherRepository.deleteById(id);
    }
}