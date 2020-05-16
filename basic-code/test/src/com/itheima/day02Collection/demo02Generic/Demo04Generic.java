package com.itheima.day02Collection.demo02Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04Generic {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aaa");
        list1.add("bbb");
        list1.add("ccc");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);

        printArray(list1);
        printArray(list2);

    }

    public static  void printArray(ArrayList<?> list){

        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.println(o);

        }
    }
}
