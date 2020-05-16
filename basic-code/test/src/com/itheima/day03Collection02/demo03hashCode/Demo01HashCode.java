package com.itheima.day03Collection02.demo03hashCode;

/*
    哈希值是一个十进制整数，有系统随机给出（就是对象地址值，也是一个逻辑值，是模拟出来得到的地址，不是数据实际存储物理地址）
    在object有一个方法，可以获得对象的哈希值。
    int  hashCode() 返回该对象的哈希值
    hashCode() 方法的源码
    public native int hashCode();
    native :该方法调用本地的操作系统方法

 */
public class Demo01HashCode {
    public static void main(String[] args) {

        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1); //1967205423

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2); //42121758

        System.out.println(p1); //com.itheima.day03Collection02.demo03hashCode.Person@282ba1e
        System.out.println(p2); //com.itheima.day03Collection02.demo03hashCode.Person@13b6d03

        /*
            String 类 的哈希值
                String 类重写Object类的hasCode方法
         */

        String s1 = new String("abc"); //96354
        String s2 = new String("abc"); //96354
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("重地".hashCode()); //1179395
        System.out.println("通话".hashCode()); //1179395


    }
}
