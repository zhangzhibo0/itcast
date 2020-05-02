package com.itheima.day01_APIiml.demo05System;

import java.util.Arrays;

public class Demo01System {
    public static void main(String[] args) {

        demo01currentTImeMillis();

        demo02Arraycopy();


    }


    //打印1-1999的数值，计算出毫秒数.
    public static void demo01currentTImeMillis(){

        long currentTimeMillisStart = System.currentTimeMillis();

        for(int i = 1; i<= 999; i++){
            System.out.println(i);
        }

        long currentTimeMillisEnd = System.currentTimeMillis();

        System.out.println("程序耗时: " + (currentTimeMillisEnd - currentTimeMillisStart) + "毫秒");

    }

    /*将src数组中前3个元素，赋值到dest数组的前3个位置上.
      复制前src={1,2,3,4,5} dest={5,6,7,8,9}
      复制后src={1,2,3,4,5} dest={1,2,3,8,9}
       public static void arraycopy(Object src, int srcPos, Object dest, int descPos, int length);
                                        原数组    数组起始位     目标数组      数组起始位    长度
     */

    public static void demo02Arraycopy(){

        int [] src = {1,2,3,4,5};
        int [] dest = {5,6,7,8,9};
        System.out.println(Arrays.toString(dest));

        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));

    }

}
