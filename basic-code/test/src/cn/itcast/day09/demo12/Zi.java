package cn.itcast.day09.demo12;

public class Zi extends  Fu{

    public  Zi(){
        System.out.println("子类构造方法执行了");
    }
    @Override
    public void eat(){
        System.out.println("子类调用父类抽象方法重写执行了.");
    }
}
