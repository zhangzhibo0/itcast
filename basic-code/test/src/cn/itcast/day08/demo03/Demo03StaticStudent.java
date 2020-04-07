package cn.itcast.day08.demo03;

public class Demo03StaticStudent {
    public static void main(String[] args) {

        Student.room = "阜新高专";

        Student stu1 = new Student("赵兴1",20);
        Student stu2 = new Student("赵兴2",21);

        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(Student.room);

        System.out.println("====================");

        System.out.println(stu2.getName());
        System.out.println(stu2.getAge());
        System.out.println(Student.room);
    }
}
