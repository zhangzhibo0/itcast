package cn.itcast.day05.demo03;

public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,};

        for(int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }
        System.out.println("============");

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
