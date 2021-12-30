package com.example.students.service;

import com.example.students.domain.Classes;
import com.example.students.dto.ClassesDTO;

public interface ClassesService {
    Classes save(Classes classes);
    ClassesDTO findByNumberAndName(String number, String name);
}
