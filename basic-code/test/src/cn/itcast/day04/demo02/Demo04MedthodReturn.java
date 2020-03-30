package cn.itcast.day04.demo02;

public class Demo04MedthodReturn {
    public static void main(String[] args) {
        System.out.println(getSsum(10,20));
        printSum(10,20);

    }
    public static int getSsum(int a, int b){
        int result = a + b;
        return result;
    }

    //对于void 没有返回值的方法，只能单独调用，不能打印或者赋值
    public static void printSum(int a, int b){
        int result = a + b;
        System.out.println("无返回值结果是：" + result);
    }
}
