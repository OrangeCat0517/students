package com.example.students.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Score {
    private Integer id;
    private Integer chinese;
    private Integer math;
    private Integer english;
    private Student student;
    private Integer status;
    private String createUser;
    private LocalDateTime createTime;
    private String operatorUser;
    private LocalDateTime operatorTime;
}