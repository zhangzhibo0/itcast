package com.itheima.day01_APIiml.demo06.StringBuilder;

import java.util.Date;

public class Demo02StringBuilderAppend {
    public static void main(String[] args) {

        StringBuilder bu1 = new StringBuilder();

        bu1.append("张");
        bu1.append(true);
        bu1.append(1988);
        Date date = new Date();
        bu1.append(date);
        System.out.println("bu1: " + bu1);

        //链式编程

        StringBuilder bu2 = new StringBuilder();

        bu2.append("链式1").append("链式2").append("int" + 3);
        System.out.println("bu2: " + bu2);


    }
}
