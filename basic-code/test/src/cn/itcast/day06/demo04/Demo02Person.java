package cn.itcast.day06.demo04;

public class Demo02Person {

    public static void main(String[] args) {

        Student stu1 = new Student();

        Student stu2 = new Student("赵兴",18);
        System.out.println("姓名: " + stu2.getName() + "年龄: " + stu2.getAge());
        //修改成员变量数据内容，需要setXxx;
        stu2.setAge(21);
        System.out.println("姓名: " + stu2.getName() + "年龄: " + stu2.getAge());


    }

}
