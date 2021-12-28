package com.example.students.mapper;

import com.example.students.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {
    Student findByNumberAndName(String number, String name);
    List<Student> findByClassName(String className);
    List<Student> findByClassId(String classId);
}
