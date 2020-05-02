package com.itheima.day01_APIiml.demo07.Integer;

public class Demo03Integer {
    public static void main(String[] args) {

        /*
            基本类型转字符串
         */
        String s1 = 100+"";
        //转换后打印100200，未转换值300；
        System.out.println(s1 + 200);

        String s2 = Integer.toString(100);
        System.out.println(s2 + 200);

        String s3 = String.valueOf(100);
        System.out.println(s3 + 200);

        /*
        字符串转基本类型
         */


        int i = Integer.parseInt("100");
        System.out.println(i);



    }
}
