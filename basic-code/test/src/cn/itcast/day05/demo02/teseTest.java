package cn.itcast.day05.demo02;

public class teseTest {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            for( int j = 1; j <= 20; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("=======================");
        xing();
    }

    public static void xing(){
        for( int i = 1; i <= 5; i++){
            for( int x = 1; x < i; x++ ){
                System.out.print(" ");
            }
            for(int j = 5; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
