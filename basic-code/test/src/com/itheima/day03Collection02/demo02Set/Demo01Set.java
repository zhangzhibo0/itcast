package com.itheima.day03Collection02.demo02Set;


/*
    Set 接口 extends Collection
    java.util.Set extends Collection
    特点：
        1.不允许重复的元素
        2.无索引，没有带索引方法，也不能使用普通的FOR循环遍历

    HashSet集合 implements Set接口
    特点:
        1.不允许存储重复的元素
        2.无索引，没有带索引方法，也不能使用普通的FOR循环遍历
        3.是一个无序集合，存储元素和取出元素的顺序有可能不一致
        4.底层是一个哈希表结构(查询速度非常快)
 */

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Demo01Set {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        //使用iterator
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            int i = it.next();
            System.out.println(i);
        }
        //增强for
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
