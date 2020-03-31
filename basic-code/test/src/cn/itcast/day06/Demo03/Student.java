package cn.itcast.day06.Demo03;

/*
boolean get方法命名规范 isXxx
 */

public class Student {

    private String name;
    private int age;
    private boolean male;

    public void setName(String stu){
        name = stu;
    }
    public String getName(){
        return name;
    }

    public void steAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }

    public void setBoolean(boolean m){
        male = m;
    }

    public boolean isMale(){
        return male;
    }


}

