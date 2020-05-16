package com.itheima.day03Collection02.demo02Set;

/*
    java.util.LinkedHashSet extends HashedSet
    特点： 底层是一个哈希表，多了一条链表，记录元素的存储顺序，保证元素有序
 */

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("itcast");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("abc");
        linked.add("abc");
        linked.add("itcast");
        System.out.println(linked);

    }
}
