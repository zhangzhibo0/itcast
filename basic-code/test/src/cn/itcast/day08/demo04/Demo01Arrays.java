package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo01Arrays {

    public static void main(String[] args) {
        int [] number = { 5,1,3,2,6 };
        String numStr = Arrays.toString(number);//静态方法
        System.out.println(numStr);

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        String[] array = {"ccc" , "aaa", "bbb"};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
