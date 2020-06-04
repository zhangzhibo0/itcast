package com.itheima.day03Collection02.demo01List;
/*
    java.util.List接口extends Collection接口
    List接口的特点：
        1.有序集合，存储元素和取出元素的顺序是一致的。(存123,取123)
        2.有索引，包含了一些索引方法
        3.允许存储重复的元素

    List接口中带索引的方法(特有)
        public void add(int index, E element_元素);
        public E get(int index);
        public E remove (int index);
        public E set(int index, E element)

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Demo01List {
    public static void main(String[] args) {

        //创建一个List和，多态
        List<String> list = new ArrayList<>();
        //使用add方法添加元素
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        // 打印集合
        System.out.println(list);  //不是地址值,重写了toString

        list.add(3,"itheima");
        System.out.println(list);

        String removeE = list.remove(2);
        System.out.println("被移除的元素:" + removeE);
        System.out.println(list);

        String setE = list.set(4,"A");
        System.out.println("被替换的元素:" + setE);
        System.out.println(list);

        // 遍历有3种方式

        //for
        System.out.println("-普通for-");
        for( int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.print(s);
        }
        System.out.println();
        //interator迭代器;
        System.out.println("-interator-");
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s1 = it.next();
            System.out.print(s1);
        }
        System.out.println();
        //增强for
        System.out.println("增强for");
        for(String s : list){
            System.out.print(s);
        }
    }
}
