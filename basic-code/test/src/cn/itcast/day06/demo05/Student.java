package cn.itcast.day06.demo05;

public class Student {
/*
手动
    private String name;
    private int age;

    public Student() {
        System.out.println("无参数构造方法");
    }


    public Student(String name, int age) {
        System.out.println("有参数构造方法");
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    */
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
