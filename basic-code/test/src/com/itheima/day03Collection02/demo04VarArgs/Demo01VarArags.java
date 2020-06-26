package com.itheima.day03Collection02.demo04VarArgs;





/*可变参数的注意事项；
    1.一个参数列表，只能有一个可变参数
    2.如果方法的参数有多个，那么可变参必须写在参数列表的末尾
 */

public class Demo01VarArags {
    public static void main(String[] args) {

        int number =add(10,20,30,40);
        System.out.println(number);


        //可变参数注意事项
        method("S",6.6,7,1,2,3,4,5);

        }

    public static void method(String s,double d, int i, int ...a){

    }

    //定义一个方法，计算n个int类型的和
    public static int add(int... arr){
        System.out.println(arr);
        System.out.println(arr.length);

        int sum = 0;

        for(int i : arr){
            sum += i;
        }
        return sum;
    }
}
