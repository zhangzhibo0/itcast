package cn.itcast.day09SendMoney.demo02;

public class Demo01ExtendsField {
    public static void main(String[] args) {

        Fu fu = new Fu();
        System.out.println(fu.numFu);

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);

        System.out.println(zi.num);

        zi.method();
        fu.method();


    }
}
