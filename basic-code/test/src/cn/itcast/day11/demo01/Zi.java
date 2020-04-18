package cn.itcast.day11.demo01;

public class Zi extends Fu {


   /* @Override
    public void method(){
        System.out.printf("子类重写父类方法");
    }
    */

    public static void main(String[] args) {

        final int num1 = 10 ;

        final int num2;
        num2 = 20;


        Student stu = new Student("张靓颖");
        System.out.println("stu的地址值: " + stu);
        stu = new Student("霍华健");
        System.out.println("stu的地址值: " + stu);

        System.out.println("============");

        Student stu1 = new Student("赵兴");
        System.out.println(stu1.getName());
        System.out.println("stu1的地址值: " + stu1);

        stu1.setName("赵兴兴兴兴兴");
        System.out.println(stu1.getName());
        System.out.println("stu1的地址值: " + stu1);


    }
}
