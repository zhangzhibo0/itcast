package cn.itcast.day09.demo15Test;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args){
        Manager manager = new Manager("群主",
                                        100);

        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);
        Member four = new Member("成员D",0);
        Member five= new Member("成员E",0);

        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();
        System.out.println("=================");

        ArrayList<Integer> redList = manager.send(20,5);
        for( int i = 0 ; i < redList.size();i++){
            System.out.println(redList.get(i));
        }
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);
        four.receive(redList);
        five.receive(redList);
        manager.show();
        one.show();
        two.show();
        three.show();
        four.show();
        five.show();
    }
}




