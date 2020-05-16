package com.itheima.day02Collection.demo01Collection;

import java.util.Collection;
import java.util.ArrayList;

/*
    boolean add(E e); 向集合中添加元素.
    boolean remove(E e); 删除集合中的某个元素.
    void clear(); 清空集合所有元素.
    boolean contains(E e); 判断包含某个元素.
    boolean isEpty(); 判断集合是否为空。
    int size();获取集合长度.
    Object[] toArray(); 将集合转成一个数组.

 */
public class Demo01Collection {
    public static void main(String[] args) {

        //创建集合对象
        Collection<String> coll = new ArrayList<>();
        //向集合中添加元素
        coll.add("Hello");
        coll.add("World");
        coll.add("张志冬");
        coll.add("Java");
        //重写的toString方法;
        System.out.println(coll);

        //删除集合中某个元素
//        boolean result = coll.remove("Java");
//        System.out.println(result);
//        System.out.println(coll);

        //清空所有元素
        //coll.clear();

        //判断包含某个元素.
        boolean result = coll.contains("张志冬");
        System.out.println(result);

        //判断集合是否为空
        System.out.println(coll.isEmpty());

        //获取集合长度
        System.out.println(coll.size());

        //将集合转成一个数组
        Object[] arr = coll.toArray();
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }


    }
}
