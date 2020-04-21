package cn.itcast.day09SendMoney.demo15Test;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){

        int index = new Random().nextInt(list.size());

        int delta = list.remove(index);
        int leftMoney = super.getMoney();

        super.setMoney(delta + leftMoney);

    }

}
