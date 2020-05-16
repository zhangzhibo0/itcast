package com.itheima.day02Collection.demo01Collection;


import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();

        coll.add("姚明");
        coll.add("科比");
        coll.add("詹姆斯");
        coll.add("安佛森");
        coll.add("赵兴");

        //接口 等于 实现类，就是多态
        Iterator<String> it = coll.iterator();
        //使用Iterator方法判断 和 取出数据.
        while(it.hasNext()){
            String e = it.next();
            System.out.println(e);
        }
        System.out.println("============");

        //使用for循环
        for(Iterator<String> it2 = coll.iterator(); it2.hasNext(); ){
            String e = it2.next();
            System.out.println("for循环:  " + e);
        }

    }
}
