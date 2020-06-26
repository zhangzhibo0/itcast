package com.itheima.day04Map.demo03LinkedHashMap;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map接口的哈希表和链表列表实现，具有可预知迭代顺序
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo01LinkedHashMap {
    public static void main(String[] args) {

        //HashMap 无序
        HashMap<String,String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","b");
        map.put("a","d");
        System.out.println(map);  //key不允许重复 无序 String 重写了hashCode 和 equals 方法

        //LinkedHashMap 有序
        LinkedHashMap<String,String> link = new LinkedHashMap<>();
        link.put("a","a");
        link.put("c","c");
        link.put("b","b");
        link.put("a","d");        //key不允许重复 有序 String 重写了hashCode 和 equals 方法
        System.out.println(link);

    }
}
