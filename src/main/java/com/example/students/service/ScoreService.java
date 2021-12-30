package com.example.students.service;

import com.example.students.dto.ScoreDTO;
import com.example.students.form.ScoreCondition;

public interface ScoreService {
    ScoreDTO findByScoreCondition(ScoreCondition scoreCondition);
}
