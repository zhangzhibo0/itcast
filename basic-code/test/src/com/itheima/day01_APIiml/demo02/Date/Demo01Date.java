package com.itheima.day01_APIiml.demo02.Date;

public class Demo01Date {
    public static void main(String[] args) {

        dateCurrentTimeMillis();

    }

    public static void dateCurrentTimeMillis(){


        //获取中国时间;
        long chinaTime = 60*60*8*1000;
        long currentTime = System.currentTimeMillis();
        long totalMilliSeconds = chinaTime + currentTime;
        long totalSeconds = totalMilliSeconds / 1000;

        //求出现在秒
        long currentSecond = totalSeconds % 60 ;

        //求出现在的分钟
        long totalMinutes = totalSeconds / 60 ;
        long currentMinute = totalMinutes % 60;


        //求出现在的小时
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;


        System.out.println("总毫秒为: "  + totalMilliSeconds);
        System.out.println(currentHour + ":" + currentMinute + ":" + currentSecond + " GTM");
    }

}


