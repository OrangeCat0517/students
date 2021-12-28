package com.example.students.service.impl;

import com.example.students.domain.Classes;
import com.example.students.domain.Score;
import com.example.students.domain.Student;
import com.example.students.dto.StudentDTO;
import com.example.students.mapper.ClassesMapper;
import com.example.students.mapper.ScoreMapper;
import com.example.students.mapper.StudentMapper;
import com.example.students.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;
    private final ClassesMapper classesMapper;
    private final ScoreMapper scoreMapper;

    public StudentServiceImpl(StudentMapper studentMapper, ClassesMapper classesMapper, ScoreMapper scoreMapper) {
        this.studentMapper = studentMapper;
        this.classesMapper = classesMapper;
        this.scoreMapper = scoreMapper;
    }

    @Override
    public StudentDTO searchByStudentNumberAndName(String studentName, String studentNumber) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setStudentName(studentName);
        studentDTO.setStudentNumber(studentNumber);

        Student student = studentMapper.findByNumberAndName(studentNumber, studentName);
        Integer classesId = student.getClasses().getId();
        Classes classes = classesMapper.findById(classesId);

        studentDTO.setClassesName(classes.getName());
        studentDTO.setClassesNumber(classes.getNumber());
        studentDTO.setStudentAddress(student.getAddress());
        studentDTO.setStudentAge(student.getAge());

        Score score = scoreMapper.findByStudentId(student.getId());
        studentDTO.setChinese(score.getChinese());
        studentDTO.setMath(score.getMath());
        studentDTO.setEnglish(score.getEnglish());
        studentDTO.setTotalScore(studentDTO.getTotalScore());
        studentDTO.setAvgScore(studentDTO.getAvgScore());

        return studentDTO;
    }
}
