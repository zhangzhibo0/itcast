package cn.itcast.day10instanceof.demo07_interface_implements_instanceof;

public class Mouse implements Usb {

    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");

    }

    public void click() {

        System.out.println("鼠标点击");
    }
}
