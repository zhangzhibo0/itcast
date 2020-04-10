package cn.itcast.day09.demo14SendMoney;

import java.util.ArrayList;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        int moeny = 100;
        int a = 100/3;
        int b = 100 % 3;

        list.add(a);
        list.add(a);
        list.add(a);
        System.out.println(list.size());
        System.out.println(list);

        Random ran =new Random();
        int index = ran.nextInt(list.size() - 1  );
        list.set(index,a+b);

        System.out.println(index);
        System.out.println(list);


    }

}
