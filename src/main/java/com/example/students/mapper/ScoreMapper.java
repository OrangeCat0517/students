package com.example.students.mapper;

import com.example.students.domain.Score;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {
    Score findByStudentId(Integer studentId);
    Double findAvgChineseByClassesId(Integer classesId);
    Double findAvgMathByClassesId(Integer classesId);
    Double findAvgEnglishByClassesId(Integer classesId);
    Double findAvgTotalByClassesId(Integer classesId);
}
