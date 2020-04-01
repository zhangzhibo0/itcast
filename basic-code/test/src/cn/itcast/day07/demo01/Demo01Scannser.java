package cn.itcast.day07.demo01;
import java.util.Scanner;

public class Demo01Scannser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("int_1:");
        int num_1 = input.nextInt();
        System.out.println("int_2:");
        int num_2 = input.nextInt();
        System.out.println("int_3:");
        int num_3 = input.nextInt();

        int max;
        if( num_1 > num_2){
            max = num_1;
        }else{
            max = num_2;
        }
        if(max < num_3){
            max = num_3;
        }
        System.out.println("max: " + max);



    }
}
