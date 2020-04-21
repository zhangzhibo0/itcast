package cn.itcast.day11.demo04;

public class MyOuter {

    public void methodOuter(){

        final int num = 20;
        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }
}
