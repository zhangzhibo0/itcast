package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo01Anonymous {

    public static void main(String[] args) {

        Person noe = new Person();
        new Person().name = "赵兴";
        new Person().showName();


    }


}
