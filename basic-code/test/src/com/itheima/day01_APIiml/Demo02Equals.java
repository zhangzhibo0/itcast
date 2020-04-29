package com.itheima.day01_APIiml;

public class Demo02Equals {
    public static void main(String[] args) {

        Person p1 = new Person("迪丽热巴" ,18);
        Person p2 = new Person("迪丽热巴", 18);

        System.out.println("p1=" + p1);
        System.out.println("p2=" + p2);

        boolean b = p1.equals(p2);
        System.out.println("对象参数:" + b);

        boolean b1 = p1.equals(null);
        System.out.println("null值: "+ b1);

    }
}
