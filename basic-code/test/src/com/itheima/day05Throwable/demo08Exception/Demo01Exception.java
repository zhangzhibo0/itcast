package com.itheima.day05Throwable.demo08Exception;
/*
    异常的注意事项
 */



import java.util.List;

public class Demo01Exception {
    public static void main(String[] args) {

        /*
            多个异常使用捕获
            1.多个异常分别处理
            2.多个异常一次捕获，多次处理
            3.多个异常一次捕获一次处理
         */

        // 1.多个异常分别处理
        System.out.println("------"+ "多个异常分别处理"+"------");
        try{
            int [] arr = {1,2,3};
            System.out.println(arr[3]);
        }catch(Exception e){
            System.out.println(e);
        }

        try{
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch(Exception e){
            System.out.println(e);
        }

        //2.多个异常一次捕获，多次处理

        /*
            一个try多个catch注意事项;
                1.catch里面定义异常变量，如果有子父类关系，那么子类异常变量必须写在上面，否则就会报错
                2.只执行第一次出现的异常

         */

        System.out.println("------"+ "多个异常一次捕获，多次处理"+"------");

        try{
            int[] arr= {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("------"+ "多个异常一次捕获一次处理"+"------");

        try{
            int [] arr = {1,2,3};
            System.out.println(arr[3]);
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch(Exception e){
            System.out.println(e);
        }


        System.out.println("后续代码");

    }
}
