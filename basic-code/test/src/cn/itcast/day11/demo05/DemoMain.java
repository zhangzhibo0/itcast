package cn.itcast.day11.demo05;



public class DemoMain {
    public static void main(String[] args) {
       // MyInterface obj = new MyInterfaceImple();
        //obj.method();

        MyInterface obj = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名实现类实现了方法11-A");
            }
            public void method2(){
                System.out.println("匿名实现类实现了方法22-A");
            }
        };
        obj.method1();
        obj.method2();

        new MyInterface(){

            @Override
            public void method1() {
                System.out.println("匿名实现类实现了方法11-B");
            }

            @Override
            public void method2() {
                System.out.println("匿名实现类实现了方法22-B");
            }
        }.method1();
    }
}
