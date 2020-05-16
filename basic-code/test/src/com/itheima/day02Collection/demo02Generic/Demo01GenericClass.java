package com.itheima.day02Collection.demo02Generic;

public class Demo01GenericClass {
    public static void main(String[] args) {

        GenericClass gc = new  GenericClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();
        System.out.println(obj);


        GenericClass<Integer> gc2= new GenericClass<>();
        gc2.setName(1);
        Integer name = gc2.getName();
        System.out.println(name);

        GenericClass<String> gc3 = new GenericClass<>();
        gc3.setName("字符串字符串");
        String name1 = gc3.getName();
        System.out.println(name1);

    }
}
