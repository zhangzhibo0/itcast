package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {

    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {

        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;  //平均值
        int mod = totalMoney % totalCount;  //零头

        for(int i = 0; i < totalCount - 1 ; i++){
            list.add(avg);
        }

        int last = avg + mod;

        list.add(last);

        return list;
    }
}
