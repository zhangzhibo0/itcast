package cn.itcast.day10instanceof.demo08test;

public class Mouse implements Usb{

    public void open(){
        System.out.println("打开鼠标");
    }

    public void close(){
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("鼠标点击");
    }
}
