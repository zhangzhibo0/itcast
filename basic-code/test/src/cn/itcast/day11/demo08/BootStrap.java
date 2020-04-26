package cn.itcast.day11.demo08;

import cn.itcast.day11.red.RedPacketFrame;
import cn.itcast.day11.red.OpenMode;


public class BootStrap {
    public static void main(String[] args) {

        MyRed myRed = new MyRed("抢红包");
        myRed.setOwnerName("自己");


//        OpenMode list = new NormalMode();
//        myRed.setOpenWay(list);

        OpenMode random = new RandomMode();
        myRed.setOpenWay(random);

    }
}
