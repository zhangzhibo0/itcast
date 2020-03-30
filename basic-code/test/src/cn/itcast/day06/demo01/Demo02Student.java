package cn.itcast.day06.demo01;


/*
1.导包：
import cn.itcast.day06.demo01.Student;
对于和当前类属于同一个包的情况，可以省略导包语句不写。

2.创建：
类名称 对象名 = new 类名称();
Student stu =  new Student();

3.使用:
使用成员变量： 对象名.成员变量名
使用成员方法： 对象名.成员方法名();
 */
public class Demo02Student {
    public static void main(String[] args) {

        Student stu = new Student();

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.name = "赵丽颖";
        stu.age = 18;
        System.out.println(stu.name + " "+ stu.age);

        stu.eat();
        stu.sleep();
        stu.study();
    }
}
