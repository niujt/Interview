package com.repeat;

import java.util.*;

public class RepeatDemo {
    private static int length=5;
    public static Map check(List<String> list){
        Set<String> keyWord=new HashSet<>();
        Map<String,List<String>> map=new HashMap<>();

        for(int k=0;k<list.size();k++){
            for(int i=0;i<list.get(k).length();i++){
                for(int j=i+1;j<list.get(k).length();j++){
                    String regex=list.get(k).substring(i,j);
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
        Iterator<Map.Entry<String, List<String>>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, List<String>> entry=it.next();
            String key=entry.getKey();
            if(key.length()<length||map.get(key).size()<=1){
                it.remove();        //OK
            }
        }
        for(String key:map.keySet()){
            System.out.println(key+"===="+map.get(key));
        }
        return map;
    }
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        String aaa="哈速度噶觉得小明认为啊实打实大苏打·1";
        String aaa2="小明认为啊哈速度噶觉得实打实大苏打·1";
        String aaa3="啊啊啊实打实大苏打·1";
        String aaa4="哈速度噶觉得cxcz热特瑞特侮辱我";
        String aaa5="哈速热特瑞特侮辱我小明认为回家同意同意";
        list.add(aaa2);
        list.add(aaa3);
        list.add(aaa4);
        list.add(aaa5);
        list.add(aaa);
        check(list);
    }
}
