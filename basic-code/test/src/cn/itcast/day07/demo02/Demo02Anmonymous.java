package cn.itcast.day07.demo02;

/*
    匿名方法类用法
 */
import java.util.Scanner;

public class Demo02Anmonymous {

    public static void main(String[] args) {

        methodParam(new Scanner(System.in));

        Scanner sc_1 = mthodReturn_1();
        String str_1 = sc_1.next();
        System.out.println("非匿名return" + str_1);

        Scanner sc_2 = mthodReturn_2();
        String str_2 = sc_2.next();
        System.out.println("匿名return" + str_2);





    }

    //一般Scanner 方法类
    public static void methodParam(Scanner sc){
        String num = sc.next();
        System.out.println("非return输入的是:" + num);
    }

    //非匿名的scnnaer 方法类
    public static Scanner mthodReturn_1(){
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    //匿名的Scanner 方法类
    public static Scanner mthodReturn_2() {
        return new Scanner(System.in);
    }
}
