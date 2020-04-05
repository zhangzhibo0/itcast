package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        Random ran = new Random();
        ArrayList<Integer> bigList = new ArrayList<>();
        for( int i = 0 ; i < 20; i++){
            bigList.add(ran.nextInt(100)+1);
        }
        System.out.println(bigList);

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println(smallList);
        System.out.println("偶数一共有"+smallList.size()+"个");

    }

    private  static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){

        ArrayList<Integer> smallList = new ArrayList<>();
        for ( int i = 0; i < bigList.size(); i++){
            int num = bigList.get(i);
            if(num % 2 == 0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
