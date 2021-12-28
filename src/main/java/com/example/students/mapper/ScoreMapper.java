package com.example.students.mapper;

import com.example.students.domain.Score;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {
    Score findByStudentId(Integer studentId);
}
