package com.itheima.day02Collection.demo02Generic;

public class Demo02GenericMethod {
    public static void main(String[] args) {

        GenericMethod gm = new GenericMethod();
        gm.method01("asd");
        gm.method01(123);
        gm.method01(true);
        gm.method01(8.8);

        gm.method02("静态方法，不建议创建对象使用");
    }
}
