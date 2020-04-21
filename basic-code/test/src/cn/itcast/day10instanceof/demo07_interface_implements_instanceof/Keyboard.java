package cn.itcast.day10instanceof.demo07_interface_implements_instanceof;

public class Keyboard implements  Usb {

    @Override
    public void open(){
        System.out.println("打开键盘");
    }

    @Override
    public void close(){
        System.out.println("关闭键盘");
    }

    public void type(){
        System.out.println("键盘输入");
    }
}
