package cn.itcast.day05.demo02;

public class Demo01ArrayOne {

    public static void main(String[] args) {

        int[] array = new int[3];
        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);

        array[0] = 10;
        array[1] = 20;

        for(int i = 0 ;i <= array.length; i++){
            System.out.println(array[i]);
        }
    }
}
