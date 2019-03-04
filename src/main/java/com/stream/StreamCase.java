package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 初级操作
 */
public class StreamCase {
    public static void main(String[] args){
        //forEach 遍历
       Stream<String> stream=Stream.of("aaa","bb","ccc","ddd","ee","ee");
       //stream.forEach(str->System.out.println(str));
        //filter  过滤
       // stream.filter(str->str.length()==2).forEach(str->System.out.println(str));
        //distinct() 去重
       // stream.distinct().forEach(str -> System.out.println(str));
        //map() 转换
       // stream.map(str -> str.toUpperCase()).forEach(str -> System.out.println(str));
        //flatMap()把原stream中的所有元素都"摊平"之后组成的Stream，转换前后元素的个数和类型都可能会改变。
        Stream<List<Integer>>  integers=Stream.of(Arrays.asList(1,2,3),Arrays.asList(4,5,6,7));
        integers.flatMap(list->list.stream()).forEach(list->System.out.println(list));
    }

}
