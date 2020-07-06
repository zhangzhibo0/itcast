package com.itheima.day05Throwable.demo04Throws;
/*
    throws关键字:异常处理第一种方式,交给别人处理
    作用:
        当方法内部跑出异常对象时，那么我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理(自己不处理，给别人处理),最终交给JVM-->中断处理
    使用格式:在方法声明时使用
        修饰符 返回值类型 方法名(参数列表) throws AAAException,BBBException...{
            throw new AAAException("产生原因");
            throw new BBBException("产生原因");
            ...
        }
     注意:
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明异常必须是Exception或Exception的子类
        3.方法内部如果抛出了多个异常对象，那么throws后边必须也声明多个异常
            如果抛出的多个异常对象有子父类关系，那么直接声明父类的异常即可
        4.调用了一个声明异常抛出的方法,我们必须处理声明异常
            要么继续使用throws声明抛出,交给方法调用者处理，最终交给JVM
            要么try...catch自己处理异常


 */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01Throws {

    //public static void main(String[] args) throws IOException{
    public static void main(String[] args) throws IOException{
        readFile("c:\\a.xt");
    }

    /*
        定义一个方法,对传递的路径进行合法的判断
        如路径不是"c:\\a.txt",那么我们就抛出文件找不到异常对象,告知方法的调用者
        注意:
            FileNotFoundException是编译异常,抛出了编译异常，就必须处理这个异常
            可以使用throws继续声明抛出FileNotFoundException这个异常对象,让方法的调用者处理
     */

      //直接声明父类
    //public static void readFile(String fileName) throws FileNotFo1undException,IOException{
    public static void readFile(String fileName) throws IOException{
        /*
            传递路径不是.txt结尾，并告知
         */

        if(!fileName.endsWith(".txt")){
            throw new IOException("文件后缀名不正确");
        }


        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("文件路径不对");
        }

        System.out.println("路径正确,读取文件");
    }
}
