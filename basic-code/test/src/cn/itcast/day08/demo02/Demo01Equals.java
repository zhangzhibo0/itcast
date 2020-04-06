package cn.itcast.day08.demo02;


/*
public boolean equals(Object obj);
 */
public class Demo01Equals {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";

        char[] charArray= new char[]{'H','e','l','l','o'};

        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("Hello"));
        System.out.println("Hello".equals(str1));

        System.out.println("HELLO".equals(str1));

        String strA = "Hello";
        String strB = "hello";

        System.out.println(strA.equalsIgnoreCase(strB));

        System.out.println("汉字不识别大小写" + "Hello一"
                .equalsIgnoreCase("Hello壹"));

    }
}
