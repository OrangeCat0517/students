package com.example.students.controller;

import com.example.students.dto.StudentDTO;
import com.example.students.service.ClassesService;
import com.example.students.service.ScoreService;
import com.example.students.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class StudentsController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private ClassesService classesService;


    @RequestMapping("/students")
    public StudentDTO students(String studentNumber, String studentName) {
        return studentService.searchByStudentNumberAndName(studentName, studentNumber);
    }
}
