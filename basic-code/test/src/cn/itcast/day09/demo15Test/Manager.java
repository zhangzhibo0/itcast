package cn.itcast.day09.demo15Test;

import java.util.ArrayList;

public class Manager extends User{

    public Manager(){ };
    public Manager(String name ,int money){
        super(name,money);
    }

    public  ArrayList<Integer> send(int totlamoney, int count){
        ArrayList<Integer> redList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if(totlamoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        super.setMoney(leftMoney - totlamoney);

        //计算红包金额与数量
        int avg = totlamoney / count;
        int mod = totlamoney % count;


        for( int i = 0 ; i < count - 1 ; i++){
            redList.add(avg);
        }

        int last = avg + mod;
        redList.add(last);
        return redList;
    }
}
