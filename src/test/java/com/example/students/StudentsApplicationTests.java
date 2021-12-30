package com.example.students;

import com.example.students.domain.Classes;
import com.example.students.service.ClassesService;
import com.example.students.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentsApplicationTests {

    @Autowired
    private StudentService studentService;

    @Autowired
    private ClassesService classesService;

    @Test
    void contextLoads() {
//        Classes classes = new Classes();
//        classesService.save(classes);
       // System.out.println(studentService.searchByStudentNumberAndName("Tom", "SN20211200001"));
        System.out.println(classesService.findByNumberAndName("CL202112001", "Java大数据358"));
    }


}
