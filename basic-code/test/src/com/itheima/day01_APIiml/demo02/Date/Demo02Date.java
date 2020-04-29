package com.itheima.day01_APIiml.demo02.Date;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {

        demo01();
        demo02();
        demo03();

    }


    //无参数构造方法
    public static void demo01(){

        Date date = new Date();
        System.out.println("无参数构造方法返回时间: " + date);

    }

    //有参数构造方法
    public static void demo02(){

        Date date = new Date(0L);
        System.out.println("有参数构造方法返回1970年时间: " + date);

    }

    public static void demo03(){

        Date date = new Date();
        long timeMillis = date.getTime();
        System.out.println("date.getTime()方法返回毫秒时间: " + timeMillis + " [与System.currentTimeMillis()方法相同]");
    }
}
