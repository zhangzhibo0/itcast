package com.itheima.day01_APIiml;

public class Person {
    private  String name;
    private int age;
    public Person(){

    }
    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Person{name =" +  name + ",age=" + age + "}";
    }


    @Override
    public boolean equals(Object obj){

        if(obj == this){
            return true;
        }

        if( obj == null){
            return false;
        }

        if( obj instanceof Person) {
            Person p = (Person) obj;
            boolean b = this.equals(obj) && this.age == age;
            return b;
        }
        return false;
    }

   // 自动生成
//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

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
