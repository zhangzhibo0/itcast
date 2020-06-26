package com.itheima.day04Map.demo01Map;


//Map.Entry<k,v>:在Map接口中有一个内部接口Entry
//作用:当Map集合 创建，就会在Map集合中创建一个Entry对象，用来记录键与值；

/*
    Map集合遍历的第二种方式：使用Entry对象遍历

    Map集合中方法：
        Set<Map, Entry<K,v>> entrySet() 返回此映射中包含的映射关系 Set 视图

    实现步骤:
        1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储一个Set集合中
        2.遍历Set集合，取出每一个entry对象
        3.使用Entry对象中的方法getKey()和getValue()获取键与值.
 */

import org.omg.CORBA.OBJ_ADAPTER;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Demo03EntrySet {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);

        Set <Map.Entry<String,Integer>> set = map.entrySet();

        //迭代器
        Iterator<Map.Entry<String,Integer>> it = set.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("迭代器: " + key + "=" + value);
        }

        System.out.println("===============================");

        //增强for
        for(Map.Entry<String,Integer> entry : map.entrySet() ){
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("增强for: "+key + "=" + value);
        }

    }
}
