package cn.itcast.day06.demo03;

/*
使用private 进行修饰，那么奔雷当中仍然可以随意访问。
但是！超出本类范围之外就不能再访问了。

间接访问private成员变量，就是定义一对Getter/Setter方法

必须叫 setXxx getXxx命名规则。


对于setXxx ,  不能用返回值，参数类型和成员变量对应。
对于getXxx ， 不能有参数。 返回值类型和成员变量对应。


 */
public class Person {

    String name;
    private int age;

    //判断年龄是否存在正确
    boolean judge;

    public void show(){
        if(judge == false){
            System.out.println("请重新输入年龄");
        }else {
            System.out.println("我叫" + name + "年龄" + age);
        }
    }


    public void setAge(int num){
        if(num > 0 && num < 101){
            age = num;
        }else{
            System.out.println("年龄有误");
            judge = false;
        }
    }

    public int getAge(){
        return age;
    }


}
