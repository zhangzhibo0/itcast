package cn.itcast.day09.demo03;

public class Zi extends Fu{
    String str = "子类成员变量";

    public void method(){

        String str = "子类局部变量";

        System.out.println(str); //子类局部变量
        System.out.println(this.str); //子类成员变量

        System.out.println(super.str);//父类成员变量
    }
}
