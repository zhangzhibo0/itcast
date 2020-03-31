package cn.itcast.day06.Demo03;

/*
1.定位位置不一样
成员变量 and 局部变量
局部变量: 在方法的内部
成员变量: 在方法的外部

2.作用范围不一样
局部变量:只有方法当中可以使用，出了方法就不能再用
成员变量:整个类都可以通用

3.默认值不一样
局部变量:没有默认值，如果要想使用，必须手动进行赋值
成员变量:如果没有赋值，会有默认值，规则和数组一样

 */


//static 静态方法 静态变量 ，不用new，默认初始会在内存开辟一块空间。


public class Demo01VariableDifference {

   static  String name ; //静态成员变量



    public static void main(String[] args) {

        System.out.println(name);
        methodA();

        Demo01VariableDifference vD = new Demo01VariableDifference();
        vD.methodB(10);

    }

    //静态方法
    public static void methodA(){

        int num = 20 ;  //局部变量

        System.out.println(num);

    }

    public void methodB(int param){

        System.out.println(param);

        int age;
        System.out.println(param);
    }
}
