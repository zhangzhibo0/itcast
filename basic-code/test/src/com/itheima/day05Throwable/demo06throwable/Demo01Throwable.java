package com.itheima.day05Throwable.demo06throwable;

import java.io.IOException;

/*
    throwable类 提供了3个方法
     String getMessage() 返回此throwable简短描述
     String toString() 返回throwable详细详细
     void pringStackTrace()jvm打印异常对象 默认方法，异常信息
 */
public class Demo01Throwable {
    public static void main(String[] args) {
        try{
            readFile("a.tet");
        }catch(Exception e){

            //System.out.println("文件后缀名不正确");

            //String getMessage() 返回此throwable简短描述
            System.out.println(e.getMessage());
            //String toString() 返回throwable详细详细
            System.out.println(e.toString());
            //void pringStackTrace()jvm打印异常对象 默认方法，异常信息
            e.printStackTrace();

        }
        System.out.println("后续代码");
    }
    public static void readFile(String fileName) throws IOException{

        if(!fileName.endsWith(".txt")){
            throw new  IOException("文件后缀名不正确");
        }
    }

}
