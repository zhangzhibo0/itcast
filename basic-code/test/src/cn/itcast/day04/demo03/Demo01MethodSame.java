package cn.itcast.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(20,20));
    }

    public static boolean isSame(int a, int b){
        if( a == b){
            return true;
        }else{
            return false;
        }
    }
}
