package cn.itcast.day10instanceof.demo02;

public  abstract class MyInterrfaceAbstract implements MyInterfaceA,MyInterfaceB {
    @Override
    public void methodA() {
        System.out.println("11");
    }

    @Override
    public void methodAbs() {
        System.out.println("22");
    }

    @Override
    public void methodDefault(){
        System.out.println("重新默认值");
    }
}
