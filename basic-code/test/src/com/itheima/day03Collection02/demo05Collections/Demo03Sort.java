package com.itheima.day03Collection02.demo05Collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort{
    public static void main(String[] args) {

        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);

        Collections.sort(list01, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1 , Integer o2){
                return o1-o2;
            }
        });

        System.out.println(list01);


        ArrayList<Student> list02 = new ArrayList<>();
        list02.add(new Student("b迪丽热巴",18));
        list02.add(new Student("古力娜扎", 20));
        list02.add(new Student("杨幂", 17));


        Collections.sort(list02, new Comparator<Student>(){
            @Override
            public int compare(Student o1,Student o2){
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(list02);


        ArrayList<Student> list03 = new ArrayList<>();
        list03.add(new Student("b迪丽热巴",18));
        list03.add(new Student("古力娜扎", 20));
        list03.add(new Student("杨幂", 17));
        list03.add(new Student("a迪丽热巴",18));

        Collections.sort(list03, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if(result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });

        System.out.println(list03);
    }
}
