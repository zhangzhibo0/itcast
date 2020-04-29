package com.itheima.day01_APIiml.demo03.DateFormat;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

/*
输入一个日期时间，计算出一个人已经出生了多少天.
 */
public class Demo02Test {
    public static void main(String[] args) throws ParseException {


        Scanner sc = new Scanner(System.in);

        System.out.println("请输入你的出生日期，格式为yyyy-MM-dd");
        //获取出生日期
        String birthDayDateString = sc.next();
        //将字符日期转成DATE类型
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthDayDateString);

        liveDays(date);


    }

    public static void liveDays(Date date){
        //获取今天的日期毫秒
        long todayTime = new Date().getTime();
        //获取生日的日期毫秒
        long birthdayDateTime = date.getTime();
        //绝对值相减
        long time = Math.abs(todayTime - birthdayDateTime);

        System.out.println(time / 1000 / 60 / 60 / 24 );
    }

}
