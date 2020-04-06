package cn.itcast.day08.demo02;

public class Demo06StringPractise {
    public static void main(String[] args) {
        int [] num = {1,2,3,4};
        String str = fromArrayToString(num);
        System.out.println(str);

    }

    public static String fromArrayToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str + "word" + array[i]+"]";
            }else {
                str = str + "word" + array[i] + "#";
            }
        }
        return str;
    }
}
