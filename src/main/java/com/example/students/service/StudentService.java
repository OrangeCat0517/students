package com.example.students.service;

import com.example.students.domain.Classes;
import com.example.students.dto.StudentDTO;

public interface StudentService {
    StudentDTO searchByStudentNumberAndName(String studentName, String studentNumber);
    Classes save(Classes classes);
}
