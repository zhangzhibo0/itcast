package cn.itcast.day09.demo13;

public class DemoMain {

    public static void main(String[] args) {

        MydogXiaogouAhuang xiaogou = new MydogXiaogouAhuang();
        xiaogou.eat();
        xiaogou.sleep();
        System.out.println("====================");

        Mydog2Ha ha = new Mydog2Ha();
        ha.eat();
        ha.sleep();
    }
}
