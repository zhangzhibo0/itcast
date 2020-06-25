package com.itheima.day03Collection02.demo05Collections;

import java.util.Collections;
import java.util.ArrayList;


public class Demo02Sort {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2);
        System.out.println("排序前：" + list);


        Collections.sort(list);
        System.out.println("排序后: " + list);


        ArrayList<Person> list01= new ArrayList<>();
        list01.add(new Person("张三", 18));
        list01.add(new Person("李四",20));
        list01.add(new Person("王五",15));

        Collections.sort(list01);

        System.out.println(list01);




    }
}
