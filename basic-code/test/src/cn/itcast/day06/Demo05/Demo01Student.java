package cn.itcast.day06.Demo05;

public class Demo01Student {
    public static void main(String[] args) {

        Student stu1 = new Student();
        stu1.setName("赵兴");
        stu1.setAge(21);
        System.out.println("stu1"+"姓名:" + stu1.getName() + "年龄:" + stu1.getAge());

        System.out.println("=============");

        Student stu2 = new Student("刘久石",18);
        System.out.println("stu2"+"姓名:" + stu2.getName() + "年龄:" + stu2.getAge());
        stu2.setAge(19);
        System.out.println("stu2"+"姓名:" + stu2.getName() + "年龄:" + stu2.getAge());
    }
}
