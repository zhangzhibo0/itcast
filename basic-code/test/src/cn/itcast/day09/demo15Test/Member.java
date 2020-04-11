package cn.itcast.day09.demo15Test;

import java.util.Random;
import java.util.ArrayList;
public class Member extends User{
    public Member(){};
    public Member(String name, int money){
        super(name,money);
    }

    public void receive (ArrayList<Integer> redList){

        int index = new Random().nextInt(redList.size());
        int delta = redList.remove(index);
        int leftMoney = super.getMoney();
        super.setMoney(leftMoney + delta);

    }
}
