package cn.itcast.day04.demo04;

public class Demo02MethodSame {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(isSame(a,b));
        System.out.println(isSame((short)20,(short)20));
        System.out.println(isSame(1,2));
    }


    public static boolean isSame(byte a, byte b){
        System.out.println("byte方法\t");
        boolean same;
        if( a == b){
            same = true;
        }else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b){
        System.out.println("short方法\t");
        boolean same = a == b ? true :false;
        return same;
    }

    public static boolean isSame(int a, int b){
        System.out.println("int方法\t");
        if (a == b){
            return true;
        }else{
            return false;
        }
    }

}
