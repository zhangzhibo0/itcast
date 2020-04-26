package cn.itcast.day09SendMoney.demo15Test;

import java.util.ArrayList;
import java.util.Random;

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

    /* 有问题。有时间研究一下 20200425 _斜船台
    public  ArrayList<Integer> randomList (int totalMoney , int  count){

        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        int leftMoney = totalMoney;
        int leftCount = count;

        for( int i = 0; i < count - 1; i++){

            int money = random.nextInt(leftMoney / leftCount * 2) + 1;
            leftMoney = leftMoney - money;
            leftCount--;
        }

        randomList.add(totalMoney - leftCount);

        return randomList;

    }
    */
}
