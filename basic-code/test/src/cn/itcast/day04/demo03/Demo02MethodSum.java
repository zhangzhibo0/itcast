package cn.itcast.day04.demo03;

public class Demo02MethodSum {
    public static void main(String[] args){
        System.out.println(getSum());
        System.out.println("随机打印" + getSum(1,100));
    }

    public static int getSum(){
        int sum = 0;
        for(int i = 1; i < 101; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int getSum(int s,int m){
        int sum = 0;
        for(int i = s; i <= m; i++){
            sum = sum + i;
        }
        return  sum;
    }
}
