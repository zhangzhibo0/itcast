package com.itheima.day04Map.demo04Hashtable;

import java.util.Hashtable;

/*
    java.util.Hashtable<K,V> 集合 implements Map<K,V>接口

    Hashtable:底层是哈希表，安全单线程，速度慢，不可以存储null值和键
    HashMap:底层是哈希表，不安全多线程，速度快，可以存储null值和键

    Hashtable和V完成投入集合一样,在jdk1.2版本以后被更先进的集合(HashMap,ArrayList)取代
    Hashtable 的子类 Properties依然活跃在历史舞台
    propertes集合是一个唯一和IO流相结合的结合
 */
public class Demo01Hashtable {
    public static void main(String[] args) {
        Hashtable<String,String> table = new Hashtable<>();
        table.put(null,"a"); //报错
    }
}
