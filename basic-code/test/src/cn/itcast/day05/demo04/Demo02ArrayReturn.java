package cn.itcast.day05.demo04;

public class Demo02ArrayReturn {
    public static void main(String[] args) {
        int[] result = calculate(10,20,30);
        System.out.println("main方法地址:" + result );
        System.out.println("总和:" + result[0]);
        System.out.println("平均数:" + result[1]);
    }

    public static int[] calculate(int a, int b, int c ){
        int sum = a + b + c;
        int avg = sum / 3;
        int [] array = new int[]{sum, avg};
        System.out.println("calculate方法内部地址:" +
                array);
        return array;
    }
}
