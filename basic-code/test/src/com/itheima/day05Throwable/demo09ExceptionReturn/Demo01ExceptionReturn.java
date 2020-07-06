package com.itheima.day05Throwable.demo09ExceptionReturn;

/*
    如果finally有return语句,永远返回finally中的结果,避免该情况. 不要在finally里写return
 */
public class Demo01ExceptionReturn {
    public static void main(String[] args) {
        int  a  = getA(10);
        System.out.println(a);
    }

    public static int getA(int a){
        try{

            return a;
        }catch(Exception e){
            System.out.println(e);
        }finally {
           a =100;
            return  a;
        }
    }
}
