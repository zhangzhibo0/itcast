package cn.itcast.day06.Demo03;

public class Demo04Student {

    public static void main(String[] args){

        Student stu = new Student();
        stu.setName("赵兴");
        stu.steAge(18);
        stu.setBoolean(true);

        System.out.println("姓名: "+stu.getName()+" 年龄:"+stu.getAge()+" 是不是为真:"+stu.isMale());


    }

}
