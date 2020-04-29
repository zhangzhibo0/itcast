package com.itheima.day01_APIiml.demo01.Object;

import java.util.Objects;

public class Person {
    private String name;
    private int age;


    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }


    //@toString重写
//    @Override
//    public String toString(){
//        return "Person{name =" +  name + ",age=" + age + "}";
//    }

    // 自动生成toString重写方法
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }


//    //手动重写equals方法
//    //@Override
//    public boolean equals(Object obj) {
//
//        if(this == obj){
//
//            return true;
//        }
//
//        if( obj == null){
//            return false;
//        }
//
//
//        if(obj instanceof Person){
//            Person p = (Person) obj;
//            boolean b = this.name.equals(p.name) && this.age == p.age;
//            return b;
//        }
//
//        return false;
//    }


    //自动生成
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
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
