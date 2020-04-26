package cn.itcast.day11.demo07;

import  java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);

        for(int i = 0 ; i < result.size(); i++){
            System.out.println(result.get(i));
        }
    }

    public static List<String> addNames(List<String> list){

        list.add("赵兴1");
        list.add("赵兴2");
        list.add("赵兴3");
        list.add("赵兴4");

        return list;

    }
}
