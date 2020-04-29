package com.itheima.day01_APIiml.demo03.DateFormat;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01DateFormat {
    public static void main(String[] args) throws ParseException {

    demo01Format();
    demo02Parse();

    }

    public static void demo02Parse() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH时mm分ss秒");

        Date date = sdf.parse("2020-04-29 20时06分49秒");

        System.out.println("解析日期时间：" + date);

    }

    public static void demo01Format(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");

        Date date = new Date();

        String time = sdf.format(date);

        System.out.println("格式化时间日期： " + time);

    }
}
