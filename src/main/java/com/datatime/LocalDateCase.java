package com.datatime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateCase {
    public static void main(String[] args){
        //LocalDate是一个不可变的类，它表示默认格式(yyyy-MM-dd)的日期，我们可以使用now()方法得到当前时间，
        // 也可以提供输入年份、月份和日期的输入参数来创建一个LocalDate实例。该类为now()方法提供了重载方法，
        // 我们可以传入ZoneId来获得指定时区的日期。该类提供与java.sql.Date相同的功能
        System.out.println("当前日期");
        System.out.println( LocalDate.now());
        System.out.println("通过传入的参数创建LocalDate对象");
        System.out.println( LocalDate.of(2018,2,28));
        // 获取不同时区的日期 "Asia/Kolkata", you can get it from ZoneId javadoc
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("当前印度标准日期=" + todayKolkata);
        //从基准日期(01/01/1970)获取日期  例如： 01/01/1970
        LocalDate dateFromBase = LocalDate.ofEpochDay(2);
        System.out.println("基准日期的第365天= " + dateFromBase);
        //2014年的第一百天
        LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
        System.out.println("2014年的第一百天=" + hundredDay2014);
    }
}
