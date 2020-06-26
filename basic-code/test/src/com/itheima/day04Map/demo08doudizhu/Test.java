package com.itheima.day04Map.demo08doudizhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        HashMap<Integer,String> poker = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();

        List<String> colors = List.of("♠","♥","♣","♦");
        List<String> numbers = List.of("2","A","K","Q","j","10","9","8","7","6","5","4","3");

        int index = 0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;

        for(String number : numbers){
            for(String color : colors){
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        System.out.println(poker);
        System.out.println(pokerIndex);

        Collections.shuffle(pokerIndex);
        System.out.println("洗牌:" + pokerIndex);

        ArrayList<Integer> player01 = new ArrayList();
        ArrayList<Integer> player02 = new ArrayList();
        ArrayList<Integer> player03 = new ArrayList();
        ArrayList<Integer> diPai = new ArrayList();

        for( int i = 0 ; i < pokerIndex.size(); i++){
            Integer in = pokerIndex.get(i);
            if( i >= 51){
                diPai.add(in);
            }else if(i % 3 == 0){
                player01.add(in);
            }else if (i % 3 == 1 ){
                player02.add(in);
            }else if( i % 3 == 2){
                player03.add(in);
            }
        }

        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(diPai);

        lookPorke("刘德华a",poker,player01);
        lookPorke("刘德华b",poker,player02);
        lookPorke("刘德华c",poker,player03);
        lookPorke("底牌",poker,diPai);
     }

     public static void lookPorke(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
         System.out.print(name+":");
         for(Integer key : list){
             String value = poker.get(key);
             System.out.print(value+" ");
         }
         System.out.println();
     }
}
