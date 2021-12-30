package com.example.students.mapper;

import com.example.students.domain.Classes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClassesMapper {
    int save(Classes classes);
    Classes findById(Integer id);
    Integer findIdByNumberAndName(@Param("number") String number, @Param("name")String name);
    String findNumberByMaxId();
    List<Classes> findAll();
}
