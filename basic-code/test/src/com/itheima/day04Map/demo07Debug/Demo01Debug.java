package com.itheima.day04Map.demo07Debug;

/*
    Debug调试程序：
    执行程序：
    Step Over F8:逐行执行程序
    Step Into F7:进入到方法中
    Step Out  shift + F8: 跳出方法
    Resume Program F9: 跳到下一个断点，如果没有下一个断点，那么结束程序
    Stop Ctrl+F2: 退出debug模式，停止程序
    Console:切换到控制台

 */
public class Demo01Debug {
    public static void main(String[] args){
//        int a = 10;
//        int b = 20;
//        int sum = a + b;
//        System.out.println(sum);

       /* for(int i = 0; i<3; i++){
            System.out.println(i);
        }
        */
        print();
    }
    private static void print(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
}
