package cn.itcast.day10instanceof.demo08test;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本开机");
    }
    public void powerOff(){
        System.out.println("笔记本关机");
    }

    public void Device(Usb usb){
        //设备打开
        usb.open();

        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;

            mouse.click();
        }else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;

            keyboard.type();

        }
        usb.close();



    }
}
