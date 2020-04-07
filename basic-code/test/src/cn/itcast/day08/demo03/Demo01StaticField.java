package cn.itcast.day08.demo03;

public class Demo01StaticField {

    public static void main(String[] args) {

        Student stu1 = new Student("赵兴1",19);
        Student stu2 =new Student("赵兴2",20);
        Student stu3 =new Student("赵兴3",21);
        Student stu4 =new Student("赵兴4",22);
        stu1.room ="阜新高专";

        System.out.println("姓名:" + stu1.getName()+
                            "年龄:" + stu1.getAge()+
                            "班级:" + stu1.room +
                            "学号:" + stu1.getId());
        System.out.println("姓名:" + stu2.getName()+
                            "年龄:" + stu2.getAge()+
                            "班级:" + stu2.room +
                            "学号:" + stu2.getId());
        System.out.println("姓名:" + stu3.getName()+
                            "年龄:" + stu3.getAge()+
                            "班级:" + stu3.room +
                            "学号:" + stu3.getId());
        System.out.println("姓名:" + stu4.getName()+
                            "年龄:" + stu4.getAge()+
                            "班级:" + stu4.room +
                            "学号:" + stu4.getId());

    }
}
