package com.itheima.day02Collection.demo03doudizhu;

import  java.util.ArrayList;
import java.util.Collections;

/*
    斗地主综合案例：
        1.准备牌
        2.洗牌
        3.发牌
        4.看牌
 */
public class TestDoudizhu {
    public static void main(String[] args) {

         //1.准备牌
        //定义54牌ArrayList集合 ，使用泛型String
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组,一个花色，一个序号.
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //先把大王和小王存储到poker结合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组,52牌
        for(String color : colors){
            for(String number : numbers){
                poker.add(color + number);
            }
        }
        System.out.println("洗牌前: " + poker);

        //2.洗牌.使用集合的工具Collections.shuffle()方法.
        Collections.shuffle(poker);
        System.out.println("洗牌后: " + poker);

        //3.发牌.定义4个集合。存储玩家的牌和底牌

        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        /*
               遍历poker集合，获取每一张牌
               使用poker集合的索引%3给3个玩家轮流发牌
               剩余3张牌给底牌
               注意：先判断底牌 i >=51,否则牌就发没了
         */
        for( int i = 0 ; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else if (i % 3 == 0) {
                player01.add(p);
            } else if (i % 3 == 1) {
                player02.add(p);
            }else if(i % 3 == 2){
                player03.add(p);
            }
        }
        System.out.println("================发牌============");
        System.out.println("刘德华:"  + player01);
        System.out.println("钟南山:"  + player02);
        System.out.println("邓稼先:"  + player03);
        System.out.println("底牌:"  + dipai);


    }
}
