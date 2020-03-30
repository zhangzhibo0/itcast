package cn.itcast.day06.demo02;

public class Demo02PhoneTwo  {
    public static void main(String[] args) {

        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("=================");

        one.brand = "苹果";
        one.price = 8388.99;
        one.color = "黑色";

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);

        System.out.println("=========");

        one.call("乔布斯");
        one.sendMessage();

        System.out.println("****************");

        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("=================");

        two.brand = "华为";
        two.price = 5999.0;
        two.color = "蓝色";

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);

        System.out.println("=========");

        two.call("任正非");
        two.sendMessage();
    }
}
