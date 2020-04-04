package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        int[] array = new int[]{};
        System.out.println(array);
        list.add("赵兴1");
        list.add("赵兴2");
        list.add("赵兴3");
        list.add("赵兴4");

        System.out.println(list);
    }
}
