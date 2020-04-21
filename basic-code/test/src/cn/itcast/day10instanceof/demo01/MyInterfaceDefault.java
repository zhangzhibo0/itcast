package cn.itcast.day10instanceof.demo01;

public interface MyInterfaceDefault {

    public abstract void methods();

    public default void methods2(){

        System.out.println("这是新添加的默认方法");
    }

}
