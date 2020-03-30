package cn.itcast.day04.demo02;

public class Demo03MethodParam {
    public static void main(String[] args) {
        method1(1,20);
        method2();
    }
    public static void method1(int a, int b){
        int result = a * b;
        System.out.println("有参数结果\t"+result);
    }
    public static void method2(){
        for (int i = 0; i < 3; i++) {
            System.out.println("无参数结果");
        }
    }
}
