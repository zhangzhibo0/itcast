package cn.itcast.day10instanceof.demo06;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }


    //子类特有方法
    public void catchMounse() {
        System.out.println("猫抓老鼠");
    }
}
