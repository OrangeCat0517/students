package com.example.students.domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Classes {
    private Integer id;
    private String number;
    private String name;
    private Integer status;
    private String createUser;
    private LocalDateTime createTime;
    private String operatorUser;
    private LocalDateTime operatorTime;
}
