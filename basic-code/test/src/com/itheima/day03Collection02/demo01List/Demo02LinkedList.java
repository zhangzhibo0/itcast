package com.itheima.day03Collection02.demo01List;


/*
    java.util.LinkedList 集合 implements 接口
    特点
    1：底层链表结构，查询慢，增删快，
    2：里边包含大量操作首尾元素的方法
    注意：使用LinkedList集合特有方法，不能使用多态

    public void addFirst(E e);
    public void addlast(E e);
    public void push(E e);

    public E getFirst(E e);
    public E getLast(E e);


    public E removeFirst(E e);
    public E removeLast(E e);
    public E pop();   //从此列表所显示的堆栈处弹出一个元素

    public boolean isEmpty(); //如果列表中不包含元素，返回true;

 */

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }

    private static void show03() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a2");
        linked.add("b2");
        linked.add("c2");
        linked.add("d2");
        System.out.println(linked);

        String first = linked.removeFirst();
        String last = linked.removeLast();
        System.out.println("删除第一个元素" + first +"  删除到最后一个元素" + last );
        System.out.println(linked);
        String pop = linked.pop();
        System.out.println("删除第一个元素" + pop);
        System.out.println(linked.get(0));

    }

    private static void show02() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a1");
        linked.add("b1");
        linked.add("c1");
        linked.add("d1");
        System.out.println(linked);

        if(!linked.isEmpty()){
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println(first);
            System.out.println(last);
        }
        linked.clear();
    }

    public static void show01(){
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);

        linked.addFirst("www");
        linked.push("www1");
        System.out.println(linked);

        linked.addLast("com");
        linked.add("com1");



    }
}
