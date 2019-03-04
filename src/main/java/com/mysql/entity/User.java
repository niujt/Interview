package com.mysql.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@ToString
public class User {
    private int id;
    private String name;
    private String email;
    private String phone;
    private int sex;
    private int age;
    private BigDecimal salary;
    private Date createtime;
}
