package com.itheima.day01_APIiml.demo07.Integer;

public class Demo01Integer {
    public static void main(String[] args) {

        //装箱
        Integer in1 = new Integer(1);
        System.out.println(in1);

        Integer in2 = new Integer("1");
        System.out.println(in2);

        Integer in3 = Integer.valueOf("2");
        System.out.println(in3);

        //拆箱
        int in4 = in1.intValue();
        System.out.println(in4);

    }
}
