package cn.itcast.day08.demo02;

public class Demo04StringConvert {
    public static void main(String[] args) {

        String str1 = "asdasdasdasasd";
        char[] chars = str1.toCharArray();
        System.out.println(chars[0]);

        String str2 = "Hello";
        byte[] bytes = str2.getBytes();
        for(int i = 0 ; i < bytes.length; i++){
            System.out.println(bytes[i]);
        }

        String str3 = "你大爷的，你大爷的，你大爷的！";
        String str3New =  str3.replace("大爷",
                "**");
        System.out.println(str3New);



    }
}
