package cn.itcast.day10instanceof.demo06;

public class Demo02Instanceof {

    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.eat();

        //animal.catchMounse;  访问不了子类的特有方法，需要向下转型。

        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }
        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMounse();
        }

        giveMePet(new Dog());

    }
    public static void giveMePet(Animal animal){

        if(animal instanceof Cat){
            Cat cat = (Cat)animal;
            cat.catchMounse();
        }
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchHome();
        }

    }
}
