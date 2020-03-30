package cn.itcast.day06.demo02;

//使用对象类型作为方法的参数

public class Demo04PhoneParam {
    public static void main(String[] args) {

        Phone one = new Phone();
        one.brand = "苹果";
        one.color = "黑色";
        one.price = 8588.00;

        method(one);

    }

    public static void method(Phone param){

        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);

    }
}
