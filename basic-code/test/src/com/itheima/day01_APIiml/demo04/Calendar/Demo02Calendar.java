package com.itheima.day01_APIiml.demo04.Calendar;

/*
    Calendar 类的成员方法:
    返回给定日历字段值
    public int get(int field);
    将给定的日历字段设置为给定值
    public void set(int field, int value);
    根据日历的规则，为给定的日历字段添加或减去指定的时间量.
    public abstarct void add(int field, int amount);
    返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量) 的Date对象
    public Date getTime();

    成员方法的参数:
    int field : 日历类的字段，可以使用Calendar类的静态成员变量获取.
    public static final int YEAR = 1; 年
    public static final int MONTH = 2;月
    public static final int DATE = 5;月中的莫一天
    public static finale int DATY_OF_MONTH  = 5;时
    public static finale int MINUTE = 12; 分
    public static finale int SECOND = 13; 秒

 */



import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar {
    public static void main(String[] args) {

        System.out.println("=======Get============");
        demo01Get();

        System.out.println("=============c.set(Calendar.YEAR)===========");
        demo02Set();

        System.out.println("=======Set========");
        demo03Set();

        System.out.println("========add=======");
        demo04Add();

        System.out.println("========getTime======");
        demo05getTIme();

    }

    private static void demo01Get(){

        Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);
        int year1 = c.get(1);
        System.out.println(year);
        System.out.println(year1);

        int month = c.get(Calendar.MONTH) + 1;
        System.out.println(month);

        int date = c.get(Calendar.DATE);
        System.out.println(date);
    }


    private static void demo02Set(){

        Calendar c = Calendar.getInstance();

        c.set(Calendar.YEAR, 1988);
        System.out.println(c.get(Calendar.YEAR));
        c.set(Calendar.MONTH,4);
        System.out.println(c.get(Calendar.MONTH));
        c.set(Calendar.DATE, 7);
        System.out.println(c.get(Calendar.DATE));

    }

    private static void demo03Set(){

        Calendar c = Calendar .getInstance();

        c.set(2020,7,7);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(date);

    }

    private static void demo04Add(){

        Calendar c = Calendar.getInstance();

        c.add(Calendar.YEAR, 2);

        System.out.println(c.get(1));

    }

    private static void demo05getTIme(){

        Calendar c = Calendar.getInstance();

        Date date = c.getTime();

        System.out.println(date);
    }
}
