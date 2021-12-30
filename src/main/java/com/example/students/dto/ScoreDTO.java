package com.example.students.dto;

import lombok.Data;

@Data
public class ScoreDTO {
    private String studentName;
    private String classesName;
    private String classesNumber;
    private Integer chinese;
    private Integer math;
    private Integer english;
}
