package com.example.students;

import com.example.students.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentsApplicationTests {

    @Autowired
    private StudentService studentService;

    @Test
    void contextLoads() {
        System.out.println(studentService.searchByStudentNumberAndName("Tom", "SN20211200001"));
    }

}
