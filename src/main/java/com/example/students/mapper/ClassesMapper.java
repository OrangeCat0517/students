package com.example.students.mapper;

import com.example.students.domain.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ClassesMapper {
    int save(Classes classes);
    Classes findById(Integer id);
    Integer findIdBy(@Param("number") String number, String name);
}
