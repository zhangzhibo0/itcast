package com.itheima.day02Collection.demo01Collection;

import java.util.ArrayList;

public class Demo03foreach {
    public static void main(String[] args) {

        //集合
        Demo01();
        //数组
        Demo02();
    }

    private static void Demo01(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        System.out.println("集合:");
        for(String li : list){
            System.out.println(li);
        }
    }
    private static void Demo02(){
        int [] arr = {1,2,3,4,5};
        System.out.println("数组:");
        for(int ar: arr){
            System.out.println(ar);
        }
    }
}

