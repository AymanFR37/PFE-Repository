package ma.geo.gescolarite.services;

import ma.geo.gescolarite.dtos.TeacherDto;

import java.util.List;

public interface TeacherService {
    TeacherDto addTeacher(TeacherDto teacherDTO);
    TeacherDto updateTeacher(int id,TeacherDto teacherDto);
    void deleteTeacherById(int id);
    List<TeacherDto> getAllTeachers();
}
