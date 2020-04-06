package cn.itcast.day08.demo02;

public class Demo05StringSplit {

    public static void main(String[] args) {

        String str1 = "aaa,bbb,ccc";
        String[] array1 = str1.split(",");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        String str2 = "xxx.yyy.zzz";
        String[] arry2 = str2.split("\\.");
        for( int i = 0 ; i < arry2.length; i++){
            System.out.println(arry2[i]);
        }
    }
}
