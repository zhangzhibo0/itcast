package com.itheima.day03Collection02.demo05Collections;

/*
    java.util.Collections 是集合工具类，用来对集合进行操作。
    public static <T> boolean addAll(Collencito<T> c, T...elements);往集合中添加一些元素.
    //注意只能是list集合
    public static void shuffle(List<?> list);打乱顺序
    public static <T> void sort(List<?> list); 默认排序
    public static <T> void sort(List<T> list,Comparator<? super T>);按照指定规则排序

 */

import  java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Collections.addAll(list,"aa","bb","cc","dd");
        Collections.shuffle(list);

        System.out.println(list);
    }
}
