package cn.itcast.day05.demo02;

public class Demo02AarrayTwo {
    public static void main(String[] args) {

        int[] arrayA = new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=================");

        arrayA[1] = 10;
        arrayA[2] = 20;
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("=================");


        int[] arrayB = new int[3];
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("=================");

        arrayB[1] = 10;
        arrayB[2] = 20;
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("=================");

    }
}
