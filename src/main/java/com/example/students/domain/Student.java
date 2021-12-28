package com.example.students.domain;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Student {
    private Integer id;
    private String number;
    private String name;
    private Sex sex;
    private Integer age;
    private LocalDate birthday;
    private String address;
    private String tel;
    private Classes classes;
    private Integer status;
    private String createUser;
    private LocalDateTime createTime;
    private String operatorUser;
    private LocalDateTime operatorTime;
}