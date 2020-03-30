package cn.itcast.day04.demo04;

public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));

    }

    public static int sum(int a, int b){
        System.out.println("方法重载"+2+"个变量"+"\t");
        return a+b;
    }
    public static int sum(int a, int b, int c){
        System.out.println("方法重载"+3+"个变量"+"\t");
        return  a+b+c;
    }
    public  static int sum(int a, int b, int c, int d){
        System.out.println("方法重载"+4+"个变量"+"\t");
        return a+b+c+d;
    }
}
