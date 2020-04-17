package cn.itcast.day10.demo07_interface_implements_instanceof;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }

    public void UsbDevice(Usb usb) {
        usb.open();   //打开设备

        if (usb instanceof Mouse) {
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if (usb instanceof Keyboard) {
            Keyboard keyboard = new Keyboard();
            keyboard.type();
        }



        usb.close();  //关闭设备
    }

}
