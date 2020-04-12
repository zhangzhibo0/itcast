package cn.itcast.day10.demo01;

public class MyInterfaceDefualtB implements MyInterfaceDefault {
    @Override
    public void methods(){
        System.out.println("实现了抽象接口BBB");
    }

    @Override
    public void methods2(){
        System.out.println("实现了默认接口方法的覆盖重写B");
    }
}
