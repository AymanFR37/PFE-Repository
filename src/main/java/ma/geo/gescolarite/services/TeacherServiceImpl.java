package ma.geo.gescolarite.services;


import ma.geo.gescolarite.dtos.TeacherDto;
import ma.geo.gescolarite.mappers.TeacherMapper;
import ma.geo.gescolarite.repositories.TeacherRepository;
import ma.geo.gescolarite.roles.Roles;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        //Set Role for Teacher
        Set<Roles> list = new HashSet<>();
        list.add(Roles.ENSEIGNAT);
        teacherDTO.setRoles(list);

        //Save the teacher
        TeacherDto dto = teacherMapper.teacherToTeacherDTO(teacherRepository.save(teacherMapper.teacherDtoToTeacher(teacherDTO)));
        return dto;
    }

    @Override
    public TeacherDto updateTeacher(int id, TeacherDto teacherDto) {
        TeacherDto existTeacher = teacherMapper.teacherToTeacherDTO(teacherRepository.findById(id).orElse(null));

        existTeacher.setFirstName(teacherDto.getFirstName());
        existTeacher.setLastName(teacherDto.getLastName());
        existTeacher.setSexe(teacherDto.getSexe());
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