package cn.itcast.day07.demo05;

import java.util.Random;
import java.util.ArrayList;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Random ran = new Random();

        for (int i = 0; i < 6; i++) {
            list.add(ran.nextInt(33)+1);
        }

        System.out.println(list);

        for ( int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+", ");
        }





    }
}

