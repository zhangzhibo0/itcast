package cn.itcast.day06.Demo04;

/*
当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用变量。
如果需要访问本类当中的成员变量，需要使用格式。
this.成员变量
 */


public class Person {


    String name ;  //我自己的名字

    //没有this关键字
    public void sayHello(String name_1){
        System.out.println(name_1 + "，你好" + "我是" + name);
    }

    //有this关键字

    public void sayHello_this(String name){
        System.out.println(name + ": 你好" + "我是" + this.name);
    }

}
