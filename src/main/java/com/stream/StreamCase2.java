package com.stream;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 进阶操作
 */
public class StreamCase2 {
    public static void main(String[] args){
        //多面手reduce()
        //reduce操作可以实现从一组元素中生成一个值，sum()、max()、min()、count()等都是reduce操作，将他们单独设为函数只是因为常用。reduce()的方法定义有三种重写形式：
        // 找出最长的单词
        Stream<String> stream = Stream.of("I", "love", "you", "too");
        //Optional是null容器
       // Optional<String> longest = stream.reduce((s1, s2) -> s1.length()>=s2.length() ? s1 : s2);
        //Optional<String> longest = stream.max((s1, s2) -> s1.length()-s2.length());
       // System.out.println(longest.get());

        // 求单词长度之和
       // Integer lengthSum = stream.reduce(0,// 初始值　// (1)
      //  (sum, str) -> sum+str.length(), // 累加器 // (2)
         //       (a, b) -> a+b);// 部分和拼接器，并行执行时才会用到 // (3)
        // int lengthSum = stream.mapToInt(str -> str.length()).sum();
        //System.out.println(lengthSum);

        // 终极武器collect()
       // List<String> list = stream.collect(Collectors.toList()); // (1)
       // System.out.println(list);
        //Set<String> set = stream.collect(Collectors.toSet()); // (2)
       // System.out.println(set);
        //Function 接收T对象，返回R对象
        Map<String, Integer> map = stream.collect(Collectors.toMap(Function.identity(), String::length)); // (3)
      System.out.println(map);
    }
}
