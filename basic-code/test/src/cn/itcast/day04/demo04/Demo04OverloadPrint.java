package cn.itcast.day04.demo04;

public class Demo04OverloadPrint {
    public static void main(String[] args) {
        System.out.println(myPrint('a'));
        System.out.println(myPrint(125));
        System.out.println(myPrint(2000));
        myPrint("字符串");
    }


    public static byte myPrint(byte number){
        System.out.println("byte类型返回值");
        return number;
    }

    public static short myPrint(short number){
        System.out.println("short类型返回值");
        return number;
    }

    public static int myPrint(int number){
        System.out.println("int类型返回值");
        return number;
    }

    public static long myPrint(long number){
        System.out.println("long类型返回值");
        return number;
    }


    public static float myPrint(float number){
        System.out.println("float类型返回值");
        return number;
    }

    public static double myPrint(double number){
        System.out.println("double类型返回值");
        return number;
    }

    public static char myPrint(char ch){
        System.out.println("char类型返回值");
        return ch;
    }

    public static boolean myprint(boolean is){
        System.out.println("boolean类型返回值");
        return is;
    }

    public static void myPrint(String str){
        System.out.println(str);
    }
}
