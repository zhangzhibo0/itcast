package cn.itcast.day10instanceof.demo08test;

public class Computer implements Usb{
    @Override
    public void open(){
        System.out.println("笔记本开机");
    }

    @Override
    public void close(){
        System.out.println("笔记本关机");
    }

    public void usbDevice(Usb usb){

        usb.open();

        if(usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }else if( usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.input();
        }

        usb.close();
    }

}
