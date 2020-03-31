package cn.itcast.day06.Demo04;


/*


 */
public class Student {

    private String name;
    private int age;

    public Student(){
        System.out.println("无参数构造方法");
    }

    public Student(String name, int age){

        this.name = name;
        this.age = age;
        System.out.println("有参数构造方法");
    }

    public void setNmame(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
