package com.itheima.day01_APIiml.demo06.StringBuilder;

import java.util.Arrays;
public class Demo04Test {
    public static void main(String[] args) {

        long time = System.currentTimeMillis();
        System.out.println(time);

        int [] src = {1,2,3,4,5};
        int [] dest = {6,7,8,9,10};
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后： " + Arrays.toString(dest));

        StringBuilder bu = new StringBuilder();
        bu.append("赵兴").append(123);
        System.out.println(bu);
        StringBuilder buReverse = bu.reverse();
        System.out.println(buReverse);
        String buString = bu.toString();
        System.out.println(buString);
    }
}
