package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerMax {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("输入第一个int: ");
        int num_1 = input.nextInt();
        System.out.println("输入第二个int：");
        int num_2 = input.nextInt();
        System.out.println("输入第三个int: ");
        int num_3 = input.nextInt();

        Demo03ScannerMax max = new Demo03ScannerMax();
        int num =  max.max(num_1,num_2,num_3);
        System.out.println("最大数: " + num);



    }


    public int max(int a, int b , int c) {

       /* int max ;
        if( a > b){
            max = a;
        }else{
            max = b;
        }

        if( max > c){
            return max;
        }else{
            max = c;
        }
        return max;
    }
    */
       //三元运算符 ， 判断大小。
        int temp = a > b ? a : b;
        int max = temp > c ? temp : c;
        return max;
    }



}
