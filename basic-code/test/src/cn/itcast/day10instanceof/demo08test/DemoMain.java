package cn.itcast.day10instanceof.demo08test;

public class DemoMain {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.powerOn();

        Usb mouseUsb = new Mouse();
        computer.Device(mouseUsb);


        Usb Keyboard = new Keyboard();
        computer.Device(Keyboard);




        computer.powerOff();
    }
}
