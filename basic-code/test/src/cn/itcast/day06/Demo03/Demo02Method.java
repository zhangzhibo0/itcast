package cn.itcast.day06.Demo03;

/*
面向对象三大特征: 封装 继承 多态
1. 方法就是一种封装
2.关键字private也是一种封装
 */
public class Demo02Method {

    public static void main(String[] args) {

        int[] array = { 10, 20, 30, 40, 100 };
        int max = getMax(array);
        System.out.println(max);
    }

    public static int getMax(int array[]){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
