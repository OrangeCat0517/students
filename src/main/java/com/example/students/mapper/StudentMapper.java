package com.example.students.mapper;

import com.example.students.domain.Student;

import java.util.List;

public interface StudentMapper {
    Student findByNumberAndName(String number, String name);
    List<Student> findByClassName(String className);
    List<Student> findByClassId(String classId);
}
