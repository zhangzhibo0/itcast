package cn.itcast.day10instanceof.demo06;

public class Demo01Main {
    public static void main(String[] args) {

        //对象向上转型，安全
        Animal animal = new Cat();
        animal.eat();


        Cat cat = (Cat)animal;
        cat.catchMounse();



    }
}
