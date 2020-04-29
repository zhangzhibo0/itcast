package cn.itcast.day10instanceof.demo08test;

public class Keyboard implements Usb {

    public void open(){
        System.out.println("打开键盘");
    }
    public void close(){
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }

}
