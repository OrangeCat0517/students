package com.example.students.service.impl;

import com.example.students.domain.Classes;
import com.example.students.dto.ClassesDTO;
import com.example.students.mapper.ClassesMapper;
import com.example.students.mapper.ScoreMapper;
import com.example.students.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;

@Service
@Transactional
public class ClassesServiceImpl implements ClassesService {
    private final ClassesMapper classesMapper;
    private final ScoreMapper scoreMapper;

    public ClassesServiceImpl(ClassesMapper classesMapper, ScoreMapper scoreMapper) {
        this.classesMapper = classesMapper;
        this.scoreMapper = scoreMapper;
    }

    @Override
    public Classes save(Classes classes) {
        classes.setNumber(newNumber(classesMapper.findNumberByMaxId()));
        classesMapper.save(classes);
        return classes;
    }

    @Override
    public ClassesDTO findByNumberAndName(String number, String name) {
        Integer classesId = classesMapper.findIdByNumberAndName(number, name);
        ClassesDTO classesDTO = new ClassesDTO();
        classesDTO.setClassesNumber(number);
        classesDTO.setClassesName(name);
        classesDTO.setAvgChinese(scoreMapper.findAvgChineseByClassesId(classesId));
        classesDTO.setAvgEnglish(scoreMapper.findAvgEnglishByClassesId(classesId));
        classesDTO.setAvgMath(scoreMapper.findAvgMathByClassesId(classesId));
        classesDTO.setAvgTotal(scoreMapper.findAvgTotalByClassesId(classesId));
        return classesDTO;
    }

    private String newNumber(String oldNumber) {
        Integer id = Integer.parseInt(oldNumber.substring(8))+1;
        LocalDate now = LocalDate.now();
        String newNumber = "CL"+
                now.getYear() +
                String.format("%02d", now.getMonthValue()) +
                String.format("%03d", id);
        System.out.println(newNumber);
        return newNumber;
    }
}
