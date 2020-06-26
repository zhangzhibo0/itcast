package com.itheima.day04Map.demo05MapTest;

//计算一个字符串中每个字符出现的次数

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String str = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()){
            if(map.containsKey(c)){
                int value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        for(Character k : map.keySet()){
            Integer value = map.get(k);
            System.out.println(k + "-->" +value);
        }
    }
}
