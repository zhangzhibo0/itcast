package cn.itcast.day07.demo03;

import java.util.Scanner;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        //one();
        two();

    }

    public static void one(){

        Random ran =new Random();
        int numRan =ran.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        while(true){
                System.out.print("请输入你猜的数字: ");
                int numSc = sc.nextInt();
                if( numSc > numRan){
                    System.out.println("太大了，请重试 ");

                }else if(numSc < numRan) {
                    System.out.println("太小了，请重试 ");
                }else{
                    System.out.println("恭喜你，猜中了！");
                    break;
                }

            System.out.println("程序结束");
        }
    }

    public static void two(){
        Scanner input = new Scanner(System.in);
        Random ra = new Random();
        int numRa = ra.nextInt(100) + 1;

        for (int i = 1; i <= 10; i++) {
            System.out.println(i+",请输入你猜的数字: ");
            int numIn = input.nextInt();
            if(numIn > numRa){
                System.out.println("太大了，请重试: ");
            }else if(numIn < numRa){
                System.out.println("太小了，请重试:");
            }else{
                System.out.println("恭喜你，猜对了！");
                System.out.println("程序结束");
                break;
            }
        }
        System.out.println("次数已用完"+"程序结束");

    }
}
