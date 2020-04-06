package cn.itcast.day08.demo02;

public class Demo02StringGet {

    public static void main(String[] args) {

        int length = "asdfasdfasdfsadfasdf".length();
        System.out.println("字符串长度:" + length );

        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println("新的字符串:" + str3);

        String strA = "Hello";
        char ch = strA.charAt(1);
        System.out.println("在第一号索引位置的字符是:" + ch);

        String strB = "Hello,World";
        int index1 = strB.indexOf("llo");
        System.out.println("llo位于索引位置: " + index1);
        int index2 = strB.indexOf("LLO");
        System.out.println("LLO位于索引位置: " + index2);
    }
}
