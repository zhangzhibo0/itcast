package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {

        Student stu1 = new Student("赵兴1",21);
        Student stu2 = new Student("赵兴2",22);
        Student stu3 = new Student("赵兴3",23);
        Student stu4 = new Student("赵兴4",24);


        ArrayList<Student> listStudent = new ArrayList<>();

        listStudent.add(stu1);
        listStudent.add(stu2);
        listStudent.add(stu3);
        listStudent.add(stu4);

        System.out.println(listStudent); //  输出地址

        for ( int i = 0; i < listStudent.size(); i++){
            Student stu = listStudent.get(i);
            System.out.println("姓名:" + stu.getName() + " 年龄:" + stu.getAge());
        }
    }
}

