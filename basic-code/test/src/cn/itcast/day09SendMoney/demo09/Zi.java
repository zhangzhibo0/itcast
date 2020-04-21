package cn.itcast.day09SendMoney.demo09;

public class Zi extends Fu{

    int num = 10;

    public Zi(){
        this(11);     //本类的无参构造调用本类的有参构造
    }

    public Zi(int a){


    }

    public void showNum(){
        int num =12;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public void methodA(){
        System.out.println("AAA");
    }

    public void methodB(){
        this.methodA();
        System.out.println("BBB");
    }
}
