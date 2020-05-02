package com.itheima.day01_APIiml.demo06.StringBuilder;

public class Demo03StringBuilderToString  {

    public static void main(String[] args) {

        String str = "HELLO";
        System.out.println("String: " + str);

        StringBuilder bu = new StringBuilder(str);

        StringBuilder bu1 = bu.append("WORLD");
        System.out.println("StringBuilder: " + bu1);

        String str1 = bu1.toString();
        System.out.println("String: " + str1);



    }

}
