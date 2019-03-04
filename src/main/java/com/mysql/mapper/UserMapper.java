package com.mysql.mapper;

import com.mysql.entity.User;

import java.util.List;

public interface UserMapper {
    List<User> findAll();
}
