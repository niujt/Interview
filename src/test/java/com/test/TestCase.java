package com.test;

import com.mysql.mapper.CityMapper;
import com.mysql.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.Reader;

public class TestCase {
    private static Reader reader;
    private static SqlSession session;
    @Before
    public void before()throws  Exception{
        reader= Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory sf=new SqlSessionFactoryBuilder().build(reader);
        session= sf.openSession();
    }
    @Test
    public void test1() {
        UserMapper userMapper=session.getMapper(UserMapper.class);
        userMapper.findAll().forEach(System.out::println);
        session.close();
}
    @Test
    public void test2(){
        CityMapper cityMapper=session.getMapper(CityMapper.class);
        cityMapper.findAll().forEach(System.out::println);
        session.close();
    }
}
