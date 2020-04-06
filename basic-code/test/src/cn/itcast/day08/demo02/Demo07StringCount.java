package cn.itcast.day08.demo02;

import java.util.Scanner;

public class Demo07StringCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String arraySc = sc.next();
        char[] charAr = arraySc.toCharArray();
        charArray(charAr);


    }

    public static void charArray(char[] charAr){

        int countUpper = 0;
        int countLower = 0;
        int countNum = 0;
        int countOther = 0;

        for (int i = 0; i < charAr.length; i++) {

            char ch = charAr[i];
            if( ch >= 'A' && ch <= 'Z'){
                countUpper++;
            }else if ( ch >= 'a' && ch <='z'){
                countLower++;
            }else if(ch >= '0' && ch <= '9' ){
                countNum++;
            }else{
                countOther++;
            }
        }
        System.out.println("大写字母的个数:" + countUpper);
        System.out.println("小学字母的个数" + countLower);
        System.out.println("数字的个数:" + countNum);
        System.out.println("其他字符的个数:" + countOther);
    }
}
