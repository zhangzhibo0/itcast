package cn.itcast.day10instanceof.demo08test;

public class DemoMain {
    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.open();

        Usb  usbMouse = new Mouse();
        computer.usbDevice(usbMouse);

        Usb usbKeybord  = new Keyboard();
        computer.usbDevice(usbKeybord);


        computer.close();
    }
}
