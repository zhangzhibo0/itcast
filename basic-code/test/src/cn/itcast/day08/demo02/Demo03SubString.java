package cn.itcast.day08.demo02;

public class Demo03SubString {
    public static void main(String[] args) {

        String strA = "Hello,World";
        String subString1 = strA.substring(3);
        System.out.println(subString1);

        String strB = "Hello,World!";
        String subString2 = strB.substring(3,6);
        System.out.println(subString2);

        System.out.println("===============");

        String str1 = "Hello";
        System.out.println(str1);
        String str2 = "Java";
        System.out.println("内容没变，地址变了"+str2);
    }
}
