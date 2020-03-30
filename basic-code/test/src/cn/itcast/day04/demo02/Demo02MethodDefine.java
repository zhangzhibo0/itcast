package cn.itcast.day04.demo02;

public class Demo02MethodDefine {
    public static void main(String[] args) {
        sum(10,20);
        System.out.println("打印调用->"+sum(10,20));
        int number = sum(10,20);
        System.out.println("赋值调用->"+number);

    }
    public static int sum(int a,int b){
        System.out.println("方法执行啦");
        int result = a + b;
        return result;
    }
}
