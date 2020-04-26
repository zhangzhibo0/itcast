package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;

import java.util.Random;

public class RandomMode implements OpenMode{
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int leftMoney = totalMoney;
        int leftCount = totalCount;

        Random random = new Random();

        for( int i = 0 ; i < totalCount - 1; i++){
            int moeny = random.nextInt(leftMoney / leftCount) + 1 ;

            list.add(moeny);

            leftMoney = leftMoney - moeny;
            leftCount--;
        }

        list.add(leftMoney);
        return list;
    }
}
