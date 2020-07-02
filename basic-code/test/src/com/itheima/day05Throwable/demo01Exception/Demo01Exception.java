package com.itheima.day05Throwable.demo01Exception;

/*
    java.lang.Throwable:类是 Java 语言中所有错误或异常的超类
        Exception:编译期异常，进行编译(写代码)java程序出现的问题
        RuntimeException:运行期异常,java程序运行过程中出现的问题
        异常就相当于程序得了一个小毛病病(感冒发烧),把异常处理掉，程序可以继续执行(吃药，继续革命工作)
       Error:错误
          错误相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行
 */


import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Demo01Exception {
    public static void main(String[] args) throws ParseException {
        //编译期异常，进行编译(写代码)java程序出现的问题
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("199010-10");
        System.out.println(date);
        System.out.println("后续代码");

/*        Date date = null;
        try {
            date = sdf.parse("199009-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        System.out.println("后续代码");*/

        //RuntimeException:运行期异常,java程序运行过程中出现的问题
/*        int[] arr = {1,2,3};

        try{
            //可能会
            System.out.println(arr[3]);
        }catch(Exception e){
            System.out.println(e);

        }
        System.out.println("后续代码");*/


        /*
            Error:错误
            OutOfMemoryError: Java heap space
            内存溢出错误，创建数组太大了，超出了给JVM分配的内存

         */
/*        int[] arr = new int[1024*1024*1024];
        //必须修改代码，创建的数组小一点
        System.out.println("后续代码");*/
        
    }
}
