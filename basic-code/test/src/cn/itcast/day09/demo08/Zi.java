package cn.itcast.day09.demo08;

public class Zi extends Fu{

    int num = 20;

    public void methodZi(){
        System.out.println(super.num);
    }

    public  void method(){
        super.method();
        System.out.println("子类方法");
    }

    public Zi(){
        super();
    }
}
