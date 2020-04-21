package cn.itcast.day09.demo14SendMoney;

import java.util.ArrayList;



public class Manager extends User{

    public Manager(){
    }

    public Manager(String name, int money){
        super(name,money);
    }

    public ArrayList<Integer> send(int totalMoney,
                                    int count){
        ArrayList<Integer> reList = new ArrayList<>();
        int leftMoney = super.getMoney();
        if(totalMoney > leftMoney){
            System.out.println("余额不足");
            return reList;
        }

        super.setMoney(leftMoney - totalMoney);

        int avg = totalMoney / count;
        int mod = totalMoney % count;

        for( int i = 0 ; i < count - 1; i++){
            reList.add(avg);
        }

        int last = avg + mod;
        reList.add(last);

        return reList;
    }
}
