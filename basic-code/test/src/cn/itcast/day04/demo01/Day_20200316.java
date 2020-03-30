package cn.itcast.day04.demo01;


public class Day_20200316 {
    public static void main(String[] args) {
        System.out.println("HelloWorld");
        pringMethod();
    }
    public static void pringMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

