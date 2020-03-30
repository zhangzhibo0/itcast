package cn.itcast.day05.demo01;

public class Demo05ArrayUse {
    public static void main(String[] args) {
        int [] array = new int[3];

        System.out.println(array);

        for(int i = 0; i <= array.length; i++){

        }


        for(int i = 0; i < 3; i++){
            System.out.println(array[i]);
        }

        boolean [] arrayA = new boolean[3];
        for(int i = 0; i < 3; i++){
            System.out.println(arrayA[i]);
        }

        String [] arrayB = new String[3];
        for(int i = 0; i < 3; i++){
            System.out.println(arrayB[i]);
        }
    }
}
