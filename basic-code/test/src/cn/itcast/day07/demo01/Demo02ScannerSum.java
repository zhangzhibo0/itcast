package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {

    public static void main(String[] args) {

        /*
        Scanner sc = new Scanner(System.in);


        int input_1 = sc.nextInt();
        int input_2 = sc.nextInt();
        int sum = input_1 + input_2;
        System.out.println(sum);

        */

        Demo02ScannerSum d = new Demo02ScannerSum();

        d.Demo02ScannerSum();

    }

    public void Demo02ScannerSum(){

        Scanner sc  = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println(sum);

    }
}
