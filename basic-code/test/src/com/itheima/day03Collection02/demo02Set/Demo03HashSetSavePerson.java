package com.itheima.day03Collection02.demo02Set;


/*
    HashSet 存储自定义类型元素

    Set集合保证元素唯一：
        存储的元素(Stirng Integer ....student ,person), 必须重写hashCode方法和equals方法

        要求:
            同名同年龄的人，视为同一个人，只能存储一次
 */
import java.util.HashSet;
public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("小美",18);
        Person p2 = new Person("小美",18);
        Person p3 = new Person("小美",19);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println("p3: " + p3.hashCode());

        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));

        set.add(p1);
        set.add(p2);
        set.add(p3);

        System.out.println(set);

    }
}
