package cn.itcast.day09.demo14SendMoney;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member(){
    }
    public Member(String name, int moeny){
        super(name,moeny);
    }

    public void receive(ArrayList<Integer> list){

        int index = new Random().nextInt(list.size());

        int delta = list.remove(index);
        int money = super.getMoney();
        super.setMoney( delta + money );
    }
}
