package com.example.students.mapper;

import com.example.students.domain.Score;

public interface ScoreMapper {
    Score findByStudentId(Integer studentId);
}
