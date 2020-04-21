package cn.itcast.day10instanceof.demo01;

public interface MyInterfacePrivateB {

    public static  void method1Static(){
        System.out.println("静态方法1");
        methodMommo();
    }
    public static void method2Static(){
        System.out.println("静态方法2");
        method1Static();
    }

    static void methodMommo(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
