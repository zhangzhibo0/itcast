package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo03Random {
    public static void main(String[] args) {

        Random r = new Random();

        for( int i = 0; i < 10; i++){

            //注意+1写在外面

            int num = r.nextInt(10)+1;
            System.out.print(num + ", ");
        }
    }
}
