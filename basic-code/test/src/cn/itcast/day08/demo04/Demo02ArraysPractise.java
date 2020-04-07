package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo02ArraysPractise {

    public static void main(String[] args){

        String str = "laksjdl123asj1nv167asd2";

        char [] arrayStr = str.toCharArray();
        Arrays.sort(arrayStr);

        System.out.println("正序:" + Arrays.toString
                            (arrayStr));

        System.out.print("倒序:");
        for(int i = arrayStr.length - 1 ; i >=0; i-- ){
            System.out.print( arrayStr[i]+",");
        }

    }
}
