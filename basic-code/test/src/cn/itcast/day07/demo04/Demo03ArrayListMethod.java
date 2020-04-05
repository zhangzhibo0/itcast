package cn.itcast.day07.demo04;


import java.util.ArrayList;

public class Demo03ArrayListMethod {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("柳岩1");
        System.out.println(list);

        System.out.println("添加的动作是否成功："+ success);

        list.add("柳岩2");
        list.add("柳岩3");
        list.add("柳岩4");
        list.add("柳岩");
        list.add("柳岩6");

        System.out.println(list.get(4));

        String whoREMOVE = list.remove(4);
        System.out.println("删除的是" + whoREMOVE);

        System.out.println("集合长度:" + list.size());



    }
}
 