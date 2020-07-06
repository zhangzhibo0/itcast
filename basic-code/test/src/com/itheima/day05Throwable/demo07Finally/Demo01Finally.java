package com.itheima.day05Throwable.demo07Finally;

/*
    finally代码块
    格式:
        try{
            可能产生异常的代码
        }catch(定义一个异常变量,用来接收try中抛出的异常对象){
            异常的处理逻辑,调用异常对象之后，怎么处理异常对象
            一般在工作中，会把异常的信息记录一个日志中
        }finally{
            无论是否出现异常都会执行
        }
     注意:
        1.finally不能单独使用,必须和try一起使用
        2.finally一般用于资源释放(资源回收),无论程序是否出现异常，最后都要资源释放(IO)
 */

import java.io.IOException;

public class Demo01Finally {
    public static void main(String[] args) {

        try{
            readFile("a.tat");
        }catch(Exception e){
            System.out.println("文件后缀名不正确");
        }finally {
            System.out.println("资源释放");
        }
    }

    public static void readFile(String fileName) throws IOException{
        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不正确");
        }
        System.out.println("读取文件");
    }
}
