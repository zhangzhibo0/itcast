package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo01Random {

    public static void main(String[] args) {

        Random r =new Random();
        int num_1 = r.nextInt();
        System.out.println("无参数nextInt类型: "+num_1);



    }
}
