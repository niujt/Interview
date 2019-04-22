package com.repeat;

import java.util.*;

public class RepeatDemo {
    public static void main(String[] args) {
        String aaa="哈速度噶觉得小明认为啊实打实大苏打·1";
        List<String> list=new ArrayList<String>();
        String aaa2="小明认为啊哈速度噶觉得实打实大苏打·1";
        String aaa3="啊啊啊实打实大苏打·1";
        String aaa4="哈速度噶觉得cxcz热特瑞特侮辱我";
        String aaa5="哈速热特瑞特侮辱我小明认为回家同意同意";
        list.add(aaa2);
        list.add(aaa3);
        list.add(aaa4);
        list.add(aaa5);
        list.add(aaa);
        Set<String> keyWord=new HashSet<>();
        Map<String,List<String>> map=new HashMap<>();

        for(int k=0;k<list.size();k++){
            for(int i=0;i<list.get(k).length();i++){
                for(int j=i+1;j<aaa.length();j++){
                    String regex=aaa.substring(i,j);
                    keyWord.add(regex);
                }
            }
        }

        keyWord.forEach(key->{
            List<String> newlist=new ArrayList<>();
            for(int i=0;i<list.size();i++){
                if(list.get(i).contains(key)){
                    newlist.add(list.get(i));
                }
            }
            map.put(key,newlist);
        });
        System.out.println(map);
    }
}
