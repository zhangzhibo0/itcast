package cn.itcast.day09.demo15Test;

import javax.swing.*;
import  java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {

        Manager manager = new Manager("管理员", 100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("=============");

        ArrayList<Integer> redList = new ArrayList<>(manager.send(20,3));
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();


    }
}
