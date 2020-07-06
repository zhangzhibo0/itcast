package com.itheima.day05Throwable.demo05TryCatch;

import java.io.IOException;

/*
    try...catch : 异常处理的第二种方法,自己处理异常
    格式:
        try{
            可能产生异常的代码
        }catch(定义异常的变量,用来接收try中抛出的异常对象){
            异常的处理逻辑,产生异常对象后，怎么处理异常
            工作中，会把异常的信息记录在一个日志中
        }
        ...
        catch(异常类型 变量名){
        }
    注意:
        1.try可能会抛出多个异常对象,那么可以使用多个catch来处理异常对象
        2.如果try产生异常,那么会处理catch中的异常处理逻辑,执行完毕catch中的处理逻辑,继续执行try...catch后续代码
        3.如果try没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中代码,继续执行try...catch后续代码
 */
public class Demo01TryCatch {
    public static void main(String[] args) {
        try{
            readFile("a.tet");
        }catch(IOException e){
            System.out.println("catch,传递的后缀名不是.txt");
        }

        System.out.println("后续代码");
    }


    public static void  readFile(String fileName) throws IOException{
        if(!fileName.endsWith(".text")){
            throw new IOException("文件后缀名不正确");
        }
    }
}
