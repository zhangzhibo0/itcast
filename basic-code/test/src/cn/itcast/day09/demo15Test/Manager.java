package cn.itcast.day09.demo15Test;

import java.util.ArrayList;

public class Manager extends User{

    public Manager(){

    }
    public Manager(String name, int money){
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney, int counts){

        ArrayList<Integer> relist = new ArrayList<>();

        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return relist;
        }

        super.setMoney(leftMoney - totalMoney);

        int avg = totalMoney / counts;
        int mod = totalMoney % counts;

        for(int i = 0 ; i < counts - 1; i++){
            relist.add(avg);
        }
        int last = avg + mod;
        relist.add(last);

        return relist;

    }
}
