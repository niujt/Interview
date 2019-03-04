package com.mysql.mapper;

import com.mysql.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityMapper {
    @Select("select * from city")
    List<City> findAll();
}
