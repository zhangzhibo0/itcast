package cn.itcast.day05.demo03;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int [] arrayB = {1,1,2,3,3,3,6,5,6,6,6,6,6,6,};
        int len = arrayB.length;
        System.out.println(len);

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
