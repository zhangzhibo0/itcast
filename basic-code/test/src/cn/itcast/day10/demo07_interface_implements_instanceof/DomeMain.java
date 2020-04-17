package cn.itcast.day10.demo07_interface_implements_instanceof;

public class DomeMain {

    public static void main(String[] args) {

        Computer computer = new  Computer();
        computer.powerOn();

        Usb UsbMounse = new Mouse();

        computer.UsbDevice(UsbMounse);

        Keyboard UsbKeyboard = new Keyboard();

        computer.UsbDevice(UsbKeyboard);

        computer.UsbDevice(new Keyboard());




        computer.powerOff();
    }
}
