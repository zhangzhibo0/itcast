package cn.itcast.day07.demo03;



import java.awt.*;
import java.util.Scanner;
import java.util.Random;

public class Demo04RandomGame {
    public static void main(String[] args) {
        //调用无限次数的随机小游戏
        one();
        //two();

    }

    //无限次数
    public static void one() {

        Random ran = new Random();
        int ranNum = ran.nextInt(100)+1;
        System.out.println(ranNum);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入你猜测的数字: ");
            int scNum = sc.nextInt();

            if (scNum > ranNum){
                System.out.println("太大了，请重试.");
            }else if (scNum < ranNum){
                System.out.println("太小了，请重试。");
            }else{
                System.out.println("恭喜你，猜中啦！");
                break;
            }
        }
        System.out.println("游戏结束");
    }

    //限制次数
    public static void two(){
        Random ran = new Random();
        int numRan = ran.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);

        System.out.println("猜数字游戏共计"+"10"+"机会");

        for (int i = 1; i <= 10; i++) {
            System.out.println("第"+i+"次"+"请输入你猜测的数字: ");
            int numSc = sc.nextInt();
            if(numSc > numRan){
                System.out.println("太大了，请重试.");
            }else if (numSc < numRan){
                System.out.println("太小了，请重试.");
            }else{
                System.out.println("恭喜您，猜中啦!");
                break;
            }
        }
        System.out.println("游戏结束");
    }

}
