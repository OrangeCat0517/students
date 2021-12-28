package com.example.students.dto;

import lombok.Data;

@Data
public class StudentDTO {
    private String studentNumber;
    private String studentName;
    private String studentAddress;
    private Integer studentAge;
    private String classesNumber;
    private String classesName;
    private Integer chinese;
    private Integer math;
    private Integer english;
    private Integer totalScore;
    private Double avgScore;

    public Integer getTotalScore() {
        return totalScore = chinese + math + english;
    }

    public Double getAvgScore() {
        return getTotalScore() / 3.0;
    }
}
