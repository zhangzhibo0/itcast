package cn.itcast.day07.demo05;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Random ran =new Random();
        ArrayList<Integer> bigList = new ArrayList<>();

        for( int i = 0; i < 20; i++){
            bigList.add(ran.nextInt(100)+1);
        }

        System.out.println("随机数：" + bigList);

        ArrayList smallList= getSmall(bigList);
        System.out.println("偶数共计:" + smallList.size() + " 偶数是: " + smallList);




    }

    public static ArrayList<Integer> getSmall(ArrayList<Integer> bigList){

        ArrayList<Integer> smallList = new ArrayList<>();

        for( int i = 0 ; i < bigList.size(); i++){
            int num = bigList.get(i);
            if( num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }

}
