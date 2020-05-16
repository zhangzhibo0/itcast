package com.itheima.day03Collection02.demo02Set;

import java.util.HashSet;

/*
 视频讲原理
 */
public class Demo02HashSetSaveString {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }
}
