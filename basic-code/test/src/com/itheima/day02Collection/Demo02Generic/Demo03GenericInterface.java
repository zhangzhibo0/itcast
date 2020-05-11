package com.itheima.day02Collection.Demo02Generic;

public class Demo03GenericInterface {
    public static void main(String[] args) {

        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");

        GenericInterfaceImpl2<String> gi2 = new GenericInterfaceImpl2<>();
        gi2.method("impl2<String>");

        GenericInterfaceImpl2<Integer> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(1);
    }
}
